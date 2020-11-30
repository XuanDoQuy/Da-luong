package com.company;

public class Vidu5 {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan("Do Xuan",5000);
        RutTienVipThread rutTienVipThread
                = new RutTienVipThread("RutTienVip",15000,taiKhoan);
        rutTienVipThread.start();
        NapTienThread napTienThread
                = new NapTienThread("NapTien",20000,taiKhoan);
        napTienThread.start();
    }
}
