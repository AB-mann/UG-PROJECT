package Server;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucky
 */
public class mainServer {

    public static void main(String[] args) throws IOException {

        ReciveFileForUploading1 r1 = new ReciveFileForUploading1();
        r1.start();

        ProviderListDownloadServerr s1 = new ProviderListDownloadServerr();
        s1.start();

        FileUploadTouser f1 = new FileUploadTouser();
        f1.start();

        FileListDownloadServer f2 = new FileListDownloadServer();
        f2.start();

    }

}
