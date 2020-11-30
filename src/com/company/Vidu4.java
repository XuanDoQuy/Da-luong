package com.company;

public class Vidu4 {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan("Chong",20000);
        RutTienThread threadChong = new RutTienThread("Chong",10000,taiKhoan);
        threadChong.start();
        RutTienThread threadVo = new RutTienThread("Vo",20000,taiKhoan);
        threadVo.start();
    }
}
