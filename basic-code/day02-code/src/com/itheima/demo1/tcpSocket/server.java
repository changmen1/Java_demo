package com.itheima.demo1.tcpSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        //TCP协议 接收数据

        //1.创建对象ServerSocket
        ServerSocket ss = new ServerSocket(8080);

        //2.监听客户端连接
        Socket socket = ss.accept();

        //3. 从链连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        socket.close();
        ss.close();
    }
}
