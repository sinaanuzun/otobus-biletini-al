package com.example.BiletiniAl.controller;

import com.example.BiletiniAl.entities.Otobus;
import com.example.BiletiniAl.service.OtobusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/otobusler")
public class OtobusController {
    private final OtobusService otobusService;

    public OtobusController(OtobusService otobusService) {
        this.otobusService = otobusService;
    }

    @GetMapping
    public List<Otobus> getAllOtobuslar() {
        return otobusService.getAllOtobuslar();
    }

    @GetMapping("/{id}")
    public Otobus getOtobusById(@PathVariable Long id) {
        return otobusService.getOtobusById(id);
    }

    @PostMapping
    public Otobus createOtobus(@RequestBody Otobus otobus) {
        return otobusService.createOtobus(otobus);
    }

    @PutMapping("/{id}")
    public Otobus updateOtobus(@PathVariable Long id, @RequestBody Otobus otobusDetails) {
        return otobusService.updateOtobus(id, otobusDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteOtobus(@PathVariable Long id) {
        otobusService.deleteOtobus(id);
    }
}
