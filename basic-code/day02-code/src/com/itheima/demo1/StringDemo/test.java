package com.itheima.demo1.StringDemo;

public class test {
    public static void main(String[] args) {
        // boolean equals  要比较的字符串 完全一样才是true
        // boolean equalslgnoreCase 要比较的字符串 忽略大小写

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符abc");
//        String str1 = sc.next();
//        String str2 = "abc";
//        System.out.println(str1 == str2);

        StringBuilder sb = new StringBuilder("abc");
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
