package org.api.controllers;

import org.api.entity.Barangs;
import org.api.model.barang.BarangRequestModel;
import org.api.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barang")
public class BarangController {

    @Autowired
    private BarangService bukuService;

    @CrossOrigin
    @GetMapping("/getAll")
    public ResponseEntity<List<Barangs>> getAllBuku(){
        List<Barangs> users = null;
        try {
            users = bukuService.getAllBukus();
        }
        catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Barangs>>(users, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Barangs> getBuku(@PathVariable("id") int id){
        Barangs user = null;
        try {
            user = bukuService.findById(id);
        }
        catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Barangs>(user,HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("")
    public ResponseEntity<Barangs> CreateOrUpdate(@RequestBody BarangRequestModel userAdminRequestModel){
        Barangs userAdmins = null;
        userAdmins = bukuService.addOrUpdateBuku(userAdminRequestModel);

        return new ResponseEntity<Barangs>(userAdmins, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("addStock/{id}/{stock}")
    public ResponseEntity<HttpStatus> addStock(@PathVariable("id") int id, @PathVariable("stock") int stock){
        Barangs buku = bukuService.findById(id);
        buku.setStok(buku.getStok() + stock);
        bukuService.addOrUpdateBuku(buku);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("decreaseStock/{id}/{stock}")
    public ResponseEntity<HttpStatus> decreaseStock(@PathVariable("id") int id, @PathVariable("stock") int stock){
        Barangs buku = bukuService.findById(id);
        buku.setStok(buku.getStok() - stock);
        bukuService.addOrUpdateBuku(buku);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("delete/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") int id){
        bukuService.deleteBuku(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
