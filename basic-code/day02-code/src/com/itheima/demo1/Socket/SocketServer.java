package com.itheima.demo1.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {
        SocketServer server = new SocketServer();
        server.startService();
    }

    public void startService() {
        ServerSocket serverSocket = null;
        try {
            // 创建一个服务器套接字，绑定到指定端口
            serverSocket = new ServerSocket(8080);
            System.out.println("服务器已启动，等待客户端连接...");

            while (true) {
                // 监听并等待用户发起连接，有连接请求就生成一个套接字
                Socket socket = serverSocket.accept();
                System.out.println("客户端ip:" + socket.getInetAddress() + "已连接");

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

                pw.println("来自服务器消息：欢迎使用本服务！");

                String msg;
                while ((msg = br.readLine()) != null) {
                    if (msg.equals("bye")) {
                        pw.println("来自服务器消息：服务器断开连接，结束服务！");
                        System.out.println("客户端离开。");
                        break;
                    }
                    msg = msg.replace("?", "!").replace("？", "!")
                            .replace("吗", "").replace("吗？", "").replace("在", "没");
                    pw.println("来自服务器消息：" + msg);
                    pw.println("来自服务器,重复消息：" + msg);
                }

                socket.close(); // 关闭socket连接以及相关的输入输出流
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
