package org.api.controllers;

import org.api.entity.Transaksis;
import org.api.model.transaksi.TransaksiRequestModel;
import org.api.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaksi")
public class TransaksiController {

    @Autowired
    private TransaksiService bukuService;

    @CrossOrigin
    @GetMapping("/getAll")
    public ResponseEntity<List<Transaksis>> getAllTransaksi(){
        List<Transaksis> users = null;
        try {
            users = bukuService.getAllTransaksis();
        }
        catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Transaksis>>(users, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("")
    public ResponseEntity<Transaksis> CreateOrUpdate(@RequestBody TransaksiRequestModel userAdminRequestModel){
        Transaksis userAdmins = null;
        userAdmins = bukuService.addOrUpdateTransaksi(userAdminRequestModel);

        return new ResponseEntity<Transaksis>(userAdmins, HttpStatus.OK);
    }
}
