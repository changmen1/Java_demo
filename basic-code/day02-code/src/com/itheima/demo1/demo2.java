package com.itheima.demo1;

public class demo2 {
    public static void main(String[] args) {
        //静态初始化
        int[] array = {11, 22, 33};
        System.out.println(array[0]);
        //动态初始化
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        System.out.println(arr[2]);
        playGame();
    }
    public static void playGame() {
        System.out.println("打游戏");
    }
}