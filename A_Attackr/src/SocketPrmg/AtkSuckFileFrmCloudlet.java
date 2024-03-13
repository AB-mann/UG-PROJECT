/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketPrmg;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Tulajaram
 */
public class AtkSuckFileFrmCloudlet {

    Socket socket;
    ServerSocket serverSocket;
    ObjectOutputStream output;
    ObjectInputStream input;

    public String CatchCloudletFile() {
        try {
            socket = new Socket("localhost", 7843);
//            output = new ObjectOutputStream(socket.getOutputStream());
//            output.writeObject(fileName);
//            output.writeObject(userName);
            input = new ObjectInputStream(socket.getInputStream());
            byte[] Data = (byte[]) input.readObject();
            File f = new File(System.getProperty("user.dir") + File.separator + "Download File");
            f.mkdir();
            String FilePath = f + File.separator + "AttackFile";
            ByteStore.spitFile(FilePath, Data);
            return FilePath;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }

}
