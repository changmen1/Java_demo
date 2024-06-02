package com.itheima.demo1.inerfacedemo;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建青蛙的对象
        Frog f = new Frog("小青",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();
        f.show();
        Swim.moo();
        System.out.println(System.currentTimeMillis());
        // 运行CMD命令
        //shutdown:关机
        //加上参数才可以执行
        //-s 默认在1分钟之后关机
        //-s -t 指定之间： 关机时间
        //-a: 取消关机
        //-r： 关机并重启
        Runtime.getRuntime().exec("shutdown -s -t 3600");
//        Runtime.getRuntime().exec("shutdown -a");
    }
}
