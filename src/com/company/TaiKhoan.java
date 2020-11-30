package com.company;

public class TaiKhoan {
    private String chuTaiKhoan;
    private long soDu;

    public TaiKhoan(String chuTaiKhoan, long soDu) {
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    public boolean kiemTra(long soTienRut) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (soTienRut <= soDu) return true;
        return false;
    }

    public synchronized void rutTien(String rutTienThread, long soTienRut) {
        System.out.println(rutTienThread
                + " | muon rut so tien la: "
                + soTienRut);

        if (kiemTra(soTienRut)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            soDu = soDu - soTienRut;
            System.out.println(rutTienThread
                    + " | rut thanh cong so tien la: "
                    + soTienRut);
        } else {
            System.out.println(rutTienThread + " | so du khong du!");
        }

        System.out.println(rutTienThread
                + " | nhin thay so du la: "
                + soDu);
    }

    public synchronized void rutTienVip(String rutTienThreadVip, long soTienRut) {
        System.out.println(rutTienThreadVip
                + " | muon rut so tien la: "
                + soTienRut);
        while (!kiemTra(soTienRut)) {
            System.out.println(rutTienThreadVip + " | so du khong du. dang doi nap them tien...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        soDu = soDu - soTienRut;
        System.out.println(rutTienThreadVip + " | rut thanh cong: " + soTienRut);
        System.out.println(rutTienThreadVip + " | nhin thay so du la: " + soDu);
    }

    public synchronized void napTien(String napTienThread, long soTienNap) {
        System.out.println(napTienThread
                + " | nap so tien la: "
                + soTienNap);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        soDu = soDu + soTienNap;
        notify();
    }

    public void chuyenTien(TaiKhoan taiKhoanDich, long soTienChuyen) {
        synchronized (this) {
            this.rutTien("1", soTienChuyen);
            synchronized (taiKhoanDich) {
                taiKhoanDich.napTien("2", soTienChuyen);
                System.out.println("chuyen tien thanh cong");
            }
        }
    }


}
