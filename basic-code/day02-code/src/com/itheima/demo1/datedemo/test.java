package com.itheima.demo1.datedemo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        //空参构造
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println(str); //1970/1/1 上午8:00
        //带参构造
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  EE");
        String str2 = sdf2.format(d);
        System.out.println(str2);//1970-01-01 08:00:00  周四

        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));  // 访问第二个元素
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
        System.out.println(sites.size());
    }
}
