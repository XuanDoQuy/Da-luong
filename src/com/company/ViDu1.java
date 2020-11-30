package com.company;

public class ViDu1 {
    static class CountDownThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Het gio!");
        }
    }

    public static void main(String[] args) {
        CountDownThread1 thread1 = new CountDownThread1();
        thread1.start();
    }
}
