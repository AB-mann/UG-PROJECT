/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloudlet_pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStore {

    public static void spitFile(String outputfile, byte[] b) throws IOException {
        System.out.println("  here in split file...");
        System.out.println("output file ="+outputfile);
        OutputStream os = new FileOutputStream(outputfile);
        os.write(b);
        os.close();
    }
    
    public static byte[] suckFile(String inputfile) throws IOException {
		InputStream is = new FileInputStream(inputfile);
		int size = is.available();
		byte[] content = new byte[size];

		is.read(content);

		is.close();
		return content;
	}
}
