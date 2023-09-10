package org.api.service;

import org.api.entity.Transaksis;
import org.api.model.transaksi.TransaksiRequestModel;
import org.api.repository.BarangRepository;
import org.api.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private BarangRepository bukuRepository;

    public Transaksis addOrUpdateTransaksi(TransaksiRequestModel bukuRequest) {
        Transaksis buku = new Transaksis();
        if(bukuRequest.getId() > 0){
            buku.setId(bukuRequest.getId());
        }
        buku.setIdBarang(bukuRequest.getIdBarang());
        buku.setJumlah(bukuRequest.getJumlah());
        buku.setTanggalTransaksi(bukuRequest.getTanggalTransaksi());
        return transaksiRepository.save(buku);
    }

    public List<Transaksis> getAllTransaksis() {
        List<Transaksis> transaksisList = new ArrayList<>();
        Iterable<Transaksis> list = transaksiRepository.findAll();

        for(Transaksis transaksi : list){
            transaksi.setBarang(bukuRepository.findById(transaksi.getIdBarang()).orElse(null));
            transaksisList.add(transaksi);
        }

        return transaksisList;
    }
}
