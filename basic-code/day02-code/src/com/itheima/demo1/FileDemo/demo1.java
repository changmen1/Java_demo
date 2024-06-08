package com.itheima.demo1.FileDemo;

import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
//        public File(String pathname)  根据文件路径创建文件对象
//        public File(String parent，String child)  根据父路径字符串和子路径名字符创建文件对象
//        public File(File parent，Strin child)  根据父路径对应文件对象和子路径名字符船舰文件对象
        String str = "E:\\JavaFileDemo\\a.md";
        File f1 = new File(str);
        try {
            if (f1.createNewFile()) {
                System.out.println("文件创建成功");
            } else {
                System.out.println("文件已经存在");
            }
        } catch (IOException e) {
            System.out.println("文件创建失败：" + e.getMessage());
        }
        System.out.println(f1);
    }
}
