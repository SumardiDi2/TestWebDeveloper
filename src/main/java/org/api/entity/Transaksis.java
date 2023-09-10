package org.api.entity;

import javax.persistence.*;

@Entity
@Table(name="transaksi")
public class Transaksis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;

    @Column(name="id_barang")
    private int IdBarang;

    @Column(name="jumlah")
    private int jumlah;

    @Column(name="tanggal_transaksi")
    private int TanggalTransaksi;

    @ManyToOne
    private Barangs barang;

    public Transaksis() {
    }

    public Transaksis(int id, int idBarang, int jumlah, int tanggalTransaksi, Barangs barang) {
        Id = id;
        IdBarang = idBarang;
        this.jumlah = jumlah;
        TanggalTransaksi = tanggalTransaksi;
        this.barang = barang;
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
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTanggalTransaksi() {
        return TanggalTransaksi;
    }

    public void setTanggalTransaksi(int tanggalTransaksi) {
        TanggalTransaksi = tanggalTransaksi;
    }

    public Barangs getBarang() {
        return barang;
    }

    public void setBarang(Barangs barang) {
        this.barang = barang;
    }
}
