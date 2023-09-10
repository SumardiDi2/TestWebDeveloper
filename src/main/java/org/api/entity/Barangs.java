package org.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="barang")
public class Barangs {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;

    @Column(name="name")
    private String Name;

    @Column(name="stok")
    private int Stok;

    @Column(name="jenisBarang")
    private String JenisBarang;

    @OneToMany(mappedBy = "barang", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Transaksis> transaksis;

    public Barangs() {
    }

    public Barangs(int id, String name, int stok, String jenisBarang, List<Transaksis> transaksis) {
        Id = id;
        Name = name;
        Stok = stok;
        JenisBarang = jenisBarang;
        this.transaksis = transaksis;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int stok) {
        Stok = stok;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public List<Transaksis> getTransaksis() {
        return transaksis;
    }

    public void setTransaksis(List<Transaksis> transaksis) {
        this.transaksis = transaksis;
    }
}
