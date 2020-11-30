package com.company;

public class NapTienThread extends Thread {
    private long soTienNap;
    private TaiKhoan taiKhoan;

    public NapTienThread(String name, long soTienNap, TaiKhoan taiKhoan) {
        super(name);
        this.soTienNap = soTienNap;
        this.taiKhoan = taiKhoan;
    }

    @Override
    public void run() {
        taiKhoan.napTien(getName(),soTienNap);
    }
}
