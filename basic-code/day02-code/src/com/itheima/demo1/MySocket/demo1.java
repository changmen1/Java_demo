package com.itheima.demo1.MySocket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        /**
         * static InetAddress getByName(String host) 确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
         * String getHostName() 获取此IP地址的主机名
         * String getHostAddress() 返回文本显示中的IP地址字符串
         * */

        InetAddress address = InetAddress.getByName("192.168.0.112");
        System.out.println(address);
    }
}
