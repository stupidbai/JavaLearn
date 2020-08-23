package com.bai.Thread.demo01;

public class TestThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我早看代码"+i);
        }
    }

    public static void main(String[] args) {
        TestThread01 testThread01 = new TestThread01();
        testThread01.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程");
        }

    }
}
