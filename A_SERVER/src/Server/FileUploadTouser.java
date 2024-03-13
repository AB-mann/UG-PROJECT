/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Tulajaram
 */
public class FileUploadTouser extends Thread{
    ServerSocket serverSocket;
    Socket socket;
    ObjectOutputStream output;
    ObjectInputStream input;

    public FileUploadTouser() throws IOException {
    serverSocket=new ServerSocket(4358);
        System.out.println("Medical server start ");
    }
    public void run(){
        while (true) {            
            getConnection();
        }
    }

    private void getConnection() {
        try {
            socket=serverSocket.accept();
            input=new ObjectInputStream(socket.getInputStream());
            String  fileName = (String) input.readObject();
            
            String ProviderName = (String) input.readObject();
            String filePath=System.getProperty("user.dir")+File.separator+"Cloud Space"+File.separator+ProviderName+File.separator+fileName;
            byte[] suckFile = ByteStore1.suckFile1(filePath);
            output=new ObjectOutputStream(socket.getOutputStream());
            output.writeObject(suckFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
