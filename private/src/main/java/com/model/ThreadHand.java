package com.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ThreadHand extends Thread {
	
	private int i =0;
	public void run() {
		try {
			while (true) {
				i++;
				System.out.println("i="+i);
				Thread.sleep(1000);
				if(i>9) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		/*ThreadHand t = new ThreadHand();
		t.start();
		Thread.sleep(5000);
		System.out.println("likaihoubuzaidaying");*/
	/*	String a = "a,b,c";
		StringTokenizer stringTokenizer  = new StringTokenizer(a, ",",false);
		System.out.println(stringTokenizer.countTokens());
		
		while (stringTokenizer.hasMoreTokens()) {
		      System.out.println(stringTokenizer.nextToken());
		}
		System.out.println(a.charAt(2));
		System.out.println(a.concat("7777"));
		StringBuilder b = new StringBuilder(a);
		System.out.println();*/
		
		 //д�ļ�ͨ��
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\addons\\111.txt"));
        FileChannel wChannel = fileOutputStream.getChannel();
        //���ļ�ͨ��
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\addons\\read.txt"));
        FileChannel rChannel = fileInputStream.getChannel();
        
        ByteBuffer byteBufferRead = ByteBuffer.allocate(1024);//�Ӷ��з��仺����
        
        while(rChannel.read(byteBufferRead)!=-1){
            byteBufferRead.flip();//��Buffer��д״̬�л�����״̬
            while(byteBufferRead.hasRemaining()){
                wChannel.write(byteBufferRead);
            }
            byteBufferRead.clear();//Ϊ�������ݵ�Buffer��׼��
        }
        wChannel.close();
        rChannel.close();
	
	}
	
}
