/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloudlet_pkg;

import java.io.IOException;

/**
 *
 * @author lucky
 */
public class MainSysetem {
    
    public static void main(String[] args) throws IOException {
        
        ReciveFileForUploading r=new ReciveFileForUploading();
        r.start();
        
        SendFileForDownloading s=new SendFileForDownloading();
        s.start();
  
        FileAtkStart f=new FileAtkStart();
        f.start();
     
    }
    
}
