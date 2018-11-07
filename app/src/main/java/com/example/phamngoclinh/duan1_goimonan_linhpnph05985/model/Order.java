package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model;

public class Order {
    private String soban;
    private String sotang;
    private String tongtien;

    public Order(String soban, String sotang, String tongtien) {
        this.soban = soban;
        this.sotang = sotang;
        this.tongtien = tongtien;
    }

    public String getSoban() {
        return soban;
    }

    public void setSoban(String soban) {
        this.soban = soban;
    }

    public String getSotang() {
        return sotang;
    }

    public void setSotang(String sotang) {
        this.sotang = sotang;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }
}
