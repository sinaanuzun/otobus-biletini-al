package com.example.BiletiniAl.service;

import com.example.BiletiniAl.entities.Bilet;
import com.example.BiletiniAl.repository.BiletRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiletService {
    private final BiletRepository biletRepository;

    public BiletService(BiletRepository biletRepository) {
        this.biletRepository = biletRepository;
    }

    public List<Bilet> getAllBiletler() {
        return biletRepository.findAll();
    }

    public Bilet getBiletById(Long id) {
        return biletRepository.findById(id).orElse(null);
    }

    public Bilet createBilet(Bilet bilet) {
        return biletRepository.save(bilet);
    }

    public Bilet updateBilet(Long id, Bilet biletDetails) {
        Bilet bilet = biletRepository.findById(id).orElse(null);
        if (bilet != null) {
            bilet.setOtobus(biletDetails.getOtobus());
            bilet.setYolcuAdi(biletDetails.getYolcuAdi());
            return biletRepository.save(bilet);
        }
        return null;
    }

    public void deleteBilet(Long id) {
        biletRepository.deleteById(id);
    }
}
