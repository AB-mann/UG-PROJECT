/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloudlet_pkg;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tulajaram
 */
public class ReciveFileForUploading extends Thread{
    Socket socket;
    ServerSocket serverSocket;
    ObjectInputStream input;
    ObjectOutputStream output;
//    public static String FileName;
//    public static String ownername;

    public ReciveFileForUploading() throws IOException {
    serverSocket=new ServerSocket(9517);
    }
    @Override
    public void run(){
        while (true) {      
            System.out.println("cloudlet system started");
            
            getConnection();
        }
    }

    private void getConnection() {
        try {
            socket=serverSocket.accept();
            input=new ObjectInputStream(socket.getInputStream());
            System.out.println("input=="+input);
            byte[] Data = (byte[]) input.readObject();
            String FileName = (String) input.readObject();
            System.out.println("File name="+FileName);
            String FileName1 = (String) input.readObject();
            String ownername = (String) input.readObject();
            System.out.println("ownernam,e  " +ownername);
            File f=new File(System.getProperty("user.dir")+File.separator+"Cloud Space"+File.separator+"EncFile");
            
            if(!f.exists()){
            f.mkdir();
            }
            System.out.println("f::: "+f.getAbsolutePath()+"   fname=="+f.getName());
            boolean mkdir = f.mkdir();
           
         
//            File f1=new File(f+File.separator+ownername);
//            f1.mkdir();
         System.out.println("f  "+f);
            String path=f+File.separator+"EncFile.txt";
            System.out.println("path=="+path);
            try{
            ByteStore.spitFile(path, Data);
            }catch(Exception e){
            }
            File cdFile=new File(path);
            cdFile.setReadOnly();
            output=new ObjectOutputStream( socket.getOutputStream());
            output.writeObject("File Uploaded Successfully");
            
         } catch (Exception e) {
              
        }
    }

    
            
}
