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

/**
 *
 * @author Tulajaram
 */
public class SendFileForDownloading extends Thread{
    ServerSocket serverSocket;
    Socket socket;
    ObjectOutputStream output;
    ObjectInputStream input;

    public SendFileForDownloading() throws IOException {
    serverSocket=new ServerSocket(7842);
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
            
            String userName = (String) input.readObject();
            String filePath=System.getProperty("user.dir")+File.separator+"Cloud Space"+File.separator+userName+File.separator+fileName;
            byte[] suckFile = ByteStore.suckFile(filePath);
            output=new ObjectOutputStream(socket.getOutputStream());
            output.writeObject(suckFile);
        } catch (Exception e) {
        }
    }
    
}
