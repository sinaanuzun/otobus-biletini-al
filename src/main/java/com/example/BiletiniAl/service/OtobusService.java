package com.example.BiletiniAl.service;

import com.example.BiletiniAl.entities.Otobus;
import com.example.BiletiniAl.repository.BiletRepository;
import com.example.BiletiniAl.repository.OtobusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtobusService {
    private final OtobusRepository otobusRepository;

    public OtobusService(OtobusRepository otobusRepository) {
        this.otobusRepository = otobusRepository;
    }

    public List<Otobus> getAllOtobuslar() {
        return otobusRepository.findAll();
    }

    public Otobus getOtobusById(Long id) {
        return otobusRepository.findById(id).orElse(null);
    }

    public Otobus createOtobus(Otobus otobus) {
        return otobusRepository.save(otobus);
    }

    public Otobus updateOtobus(Long id, Otobus otobusDetails) {
        Otobus otobus = otobusRepository.findById(id).orElse(null);
        if (otobus != null) {
            otobus.setMarka(otobusDetails.getMarka());
            otobus.setModel(otobusDetails.getModel());
            return otobusRepository.save(otobus);
        }
        return null;
    }

    public void deleteOtobus(Long id) {
        otobusRepository.deleteById(id);
    }
}