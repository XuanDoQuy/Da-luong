package com.company;

import static java.lang.Thread.sleep;

public class ViDu2 {
    static class CountDownThread2 implements Runnable {

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
        CountDownThread2 countDownThread2 = new CountDownThread2();
        Thread thread2 = new Thread(countDownThread2);
        thread2.start();
    }
}
