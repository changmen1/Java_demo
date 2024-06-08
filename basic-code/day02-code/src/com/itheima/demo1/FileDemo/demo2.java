package com.itheima.demo1.FileDemo;

import java.io.File;

public class demo2 {
    public static void main(String[] args) {
        File src = new File("C:\\");
        findAvi(src);
    }
    public static void findAvi(File src){
        File[] files = src.listFiles();
        if(files != null){
            for (File file : files) {
                if(file.isFile()){
                    String name = file.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else{
                    findAvi(file);
                }
            }
        }
    }
}
