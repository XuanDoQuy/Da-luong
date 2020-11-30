package com.company;

public class Vidu6 {
    public static void main(String[] args) {
        TaiKhoan tkChong = new TaiKhoan("chong",2000);
        TaiKhoan tkVo = new TaiKhoan("vo",3000);
        Thread threadChong = new Thread(){
            @Override
            public void run() {
                tkChong.chuyenTien(tkVo,500);
            }
        };
        threadChong.start();
        Thread threadVo = new Thread(){
            @Override
            public void run() {
                tkVo.chuyenTien(tkChong,1000);
            }
        };
        threadVo.start();
    }
}
