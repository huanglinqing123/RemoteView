package com.example;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author: momo
 * Date: 2018/5/7
 * Description:文件转为二进制
 */
public class BinUtil {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Huanglinqing\\Desktop\\1.jpg");
        File file2 = new File("D:\\1.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        String fileEcode1 = encode(fileInputStream);
        String fileEcode2 = encode(fileInputStream2);
        if (fileEcode1.equals(fileEcode2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }

    public static String encode(InputStream in)throws IOException {
        sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
        byte[] data = new byte[in.available()];
        in.read(data);
        return encoder.encode(data);
    }

    public byte[] decode(String base64Str)throws IOException{
        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        return decoder.decodeBuffer(base64Str);
    }
}

