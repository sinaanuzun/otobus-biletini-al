package com.example.BiletiniAl.controller;

import com.example.BiletiniAl.entities.Bilet;
import com.example.BiletiniAl.service.BiletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biletler")
public class BiletController {
    private final BiletService biletService;

    public BiletController(BiletService biletService) {
        this.biletService = biletService;
    }

    @GetMapping
    public List<Bilet> getAllBiletler() {
        return biletService.getAllBiletler();
    }

    @GetMapping("/{id}")
    public Bilet getBiletById(@PathVariable Long id) {
        return biletService.getBiletById(id);
    }

    @PostMapping
    public Bilet createBilet(@RequestBody Bilet bilet) {
        return biletService.createBilet(bilet);
    }

    @PutMapping("/{id}")
    public Bilet updateBilet(@PathVariable Long id, @RequestBody Bilet biletDetails) {
        return biletService.updateBilet(id, biletDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBilet(@PathVariable Long id) {
        biletService.deleteBilet(id);
    }
}
