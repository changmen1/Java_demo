package com.itheima.demo1.MySocket;

import java.io.IOException;
import java.net.*;

public class udpsend {
    public static void main(String[] args) throws IOException {
        //1.创建DaragramSocket对象（快递公司）
        //细节：
        //绑定端口
        //空参 所有可用端口随机一个
        //有参 指定端口
        DatagramSocket ds = new DatagramSocket();
        //2.打包数据
        String str = "你好啊";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
