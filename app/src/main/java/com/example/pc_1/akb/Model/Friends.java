package com.example.pc_1.akb.Model;

public class Friends {
    private String nim;
    private String nama;
    private String kelas;
    private String telp;
    private String email;
    private String socmed;


    public Friends(String nim,String nama,String kelas,String telp,String email,String socmed) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.telp = telp;
        this.email = email;
        this.socmed = socmed;

    }


    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public String getKelas() {
        return kelas;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
    public String getTelp() {
        return telp;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setSocmed(String socmed) {
        this.socmed = socmed;
    }
    public String getSocmed() {
        return socmed;
    }





}
