package org.api.model.transaksi;

import javax.persistence.Column;

public class TransaksiRequestModel {
    private int Id;

    private int IdBarang;

    private int Jumlah;

    private int TanggalTransaksi;

    public TransaksiRequestModel() {
    }

    public TransaksiRequestModel(int id, int idBarang, int jumlah, int tanggalTransaksi) {
        Id = id;
        IdBarang = idBarang;
        this.Jumlah = jumlah;
        TanggalTransaksi = tanggalTransaksi;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdBarang() {
        return IdBarang;
    }

    public void setIdBarang(int idBarang) {
        IdBarang = idBarang;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        this.Jumlah = jumlah;
    }

    public int getTanggalTransaksi() {
        return TanggalTransaksi;
    }

    public void setTanggalTransaksi(int tanggalTransaksi) {
        TanggalTransaksi = tanggalTransaksi;
    }
}
