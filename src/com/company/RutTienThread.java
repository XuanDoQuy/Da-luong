package com.company;

public class RutTienThread extends Thread{
    private long soTienRut;
    private TaiKhoan taiKhoan;

    public RutTienThread(String name, long soTienRut, TaiKhoan taiKhoan) {
        super(name);
        this.soTienRut = soTienRut;
        this.taiKhoan = taiKhoan;
    }

    @Override
    public void run() {
        taiKhoan.rutTien(getName(),soTienRut);
    }
}
