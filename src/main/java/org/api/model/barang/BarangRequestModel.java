package org.api.model.barang;

public class BarangRequestModel {
    private int Id;

    private String Name;

    private String JenisBarang;

    private int Stok;

    public BarangRequestModel() {
    }

    public BarangRequestModel(int id, String name, String jenisBarang, int stok) {
        Id = id;
        Name = name;
        JenisBarang = jenisBarang;
        Stok = stok;
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

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int stok) {
        Stok = stok;
    }
}
