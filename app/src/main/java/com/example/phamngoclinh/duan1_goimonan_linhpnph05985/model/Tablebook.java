package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model;

public class Tablebook {
    private String soban;
    private String sotang;

    public Tablebook(String soban, String sotang) {
        this.soban = soban;
        this.sotang = sotang;
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
}
