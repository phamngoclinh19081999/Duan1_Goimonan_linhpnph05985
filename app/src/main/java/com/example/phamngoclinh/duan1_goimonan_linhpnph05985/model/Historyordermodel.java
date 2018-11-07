package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model;

public class Historyordermodel {
    private String STT;
    private String thoigian;
    private String tongtien;

    public Historyordermodel(String STT, String thoigian, String tongtien) {
        this.STT = STT;
        this.thoigian = thoigian;
        this.tongtien = tongtien;
    }

    public String getSTT() {
        return STT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }
}
