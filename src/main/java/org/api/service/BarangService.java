package org.api.service;

import org.api.entity.Barangs;
import org.api.model.barang.BarangRequestModel;
import org.api.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangService {

    @Autowired
    private BarangRepository bukuRepository;

    public Barangs addOrUpdateBuku(BarangRequestModel bukuRequest) {
        Barangs buku = new Barangs();
        if(bukuRequest.getId() > 0){
            buku.setId(bukuRequest.getId());
        }
        buku.setName(bukuRequest.getName());
        buku.setStok(bukuRequest.getStok());
        buku.setJenisBarang(bukuRequest.getJenisBarang());
        return bukuRepository.save(buku);
    }

    public Barangs addOrUpdateBuku(Barangs buku) {
        return bukuRepository.save(buku);
    }

    public void deleteBuku(int id){
        Barangs buku = bukuRepository.findById(id).orElse(null);
        if(buku != null){
            bukuRepository.delete(buku);
        }
    }


    public Barangs findById(int id){
        return bukuRepository.findById(id).orElse(null);
    }

    public List<Barangs> getAllBukus() {
        return (List<Barangs>) bukuRepository.findAll();
    }
}
