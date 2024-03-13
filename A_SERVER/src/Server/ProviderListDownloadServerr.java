/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



/**
 *
 * @author rahul
 */
public class ProviderListDownloadServerr extends Thread implements java.io.Serializable {

    ServerSocket server;
    Socket client;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ProviderListDownloadServerr() {
        try
        {
        server = new ServerSocket(6149);
            System.out.println("File List server is started");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("File list Download server Started..");
        while (true) {
            getFileList();
        }

    }

    public void getFileList() {
        try {
            client = server.accept();
            System.out.println("Connected to File list download client");
            ois = new ObjectInputStream(client.getInputStream());
            oos = new ObjectOutputStream(client.getOutputStream());
            String ProviderName=ois.readObject().toString();
            
            File userGroupDir=new File(System.getProperty("user.dir")+File.separator+"Cloud Space"+File.separator+ProviderName);
           
            ArrayList<String> fileNames=new ArrayList<String>();
            
//            File[] listFiles = userGroupDir.listFiles();
            
            if(userGroupDir.exists())
            {
               File[] fileList=userGroupDir.listFiles();
               for(File userFile:fileList)
               {
                   if(userFile.isDirectory())
                   {
                   fileNames.add(userFile.getName());
                   }
               }
            }
            System.out.println("File:"+fileNames);
            oos.writeObject(fileNames);
        } 
        catch (Exception e) {
            e.printStackTrace();

        }

    }

}
