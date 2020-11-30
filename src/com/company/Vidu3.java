package com.company;

import java.util.Comparator;

import static java.lang.Thread.sleep;

public class Vidu3 {
    public static void main(String[] args) {
        Thread thread3 = new Thread() {
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
        };
        thread3.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=10;i>0;i--){
                    System.out.println(i);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Het gio!");
            }
        };
        new Thread(runnable).start();
    }
}
