package com.company;

public class RutTienVipThread extends Thread {
    private long soTienRut;
    private TaiKhoan taiKhoan;

    public RutTienVipThread(String name, long soTienRut, TaiKhoan taiKhoan) {
        super(name);
        this.soTienRut = soTienRut;
        this.taiKhoan = taiKhoan;
    }

    @Override
    public void run() {
        taiKhoan.rutTienVip(getName(),soTienRut);
    }
}
