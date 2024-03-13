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
public class ReciveFileForUploading1 extends Thread{
    Socket socket;
    ServerSocket serverSocket;
    ObjectInputStream input;
    ObjectOutputStream output;

    public ReciveFileForUploading1() throws IOException {
    serverSocket=new ServerSocket(4871);
    }
    @Override
    public void run(){
        while (true) {            
            getConnection();
        }
    }

    private void getConnection() {
        try {
            socket=serverSocket.accept();
            input=new ObjectInputStream(socket.getInputStream());
            System.out.println("connected to server..");
            byte[] Data = (byte[]) input.readObject();
            String FileName = (String) input.readObject();
            String userName = (String) input.readObject();
            File f=new File(System.getProperty("user.dir")+File.separator+"Cloud Space");
            
            boolean mkdir = f.mkdir();
            File f1=new File(f+File.separator+userName);
            f1.mkdir();
            String path=f1+File.separator+FileName;
            ByteStore1.spitFile1(path, Data);
            output=new ObjectOutputStream( socket.getOutputStream());
            output.writeObject("File Uploaded Successfully");
            
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
            
}
