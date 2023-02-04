package com.easy;

import java.util.Scanner;

public class Java_Regex {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex{
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num+"."+num+"."+num+"."+num;
}
