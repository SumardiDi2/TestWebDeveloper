package org.html.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    @GetMapping("/barang")
    public String barang() {
        return "barang";
    }

    @GetMapping("/formBarang")
    public String formBarang() {
        return "formBarang";
    }

    @GetMapping("/formBarangUpdate")
    public String formBarangUpdate(@RequestParam(value = "id", required = false) int id, Model model) {
        model.addAttribute("id", id);
        return "formBarangUpdate";
    }

    @GetMapping("/transaksi")
    public String transaksi() {
        return "transaksi";
    }

    @GetMapping("/formTransaksi")
    public String formTransaksi() {
        return "formTransaksi";
    }
}
