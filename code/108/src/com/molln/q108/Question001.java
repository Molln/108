package com.molln.q108;

import java.io.InputStream;

public class Question001 {
	
	public static void main(String[] args) throws Exception {
		int len = 0;
        InputStream in = System.in;
        char c = (char)in.read();
        while(c != '\n'){
            if(c == ' '){
                len = 0;
            }else{
                len++;
            }
            c = (char)in.read();
        }
        System.out.println(len);
	}

}
