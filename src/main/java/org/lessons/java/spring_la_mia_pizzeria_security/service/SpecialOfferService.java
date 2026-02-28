package org.lessons.java.spring_la_mia_pizzeria_security.service;

import org.lessons.java.spring_la_mia_pizzeria_security.model.SpecialOffer;
import org.lessons.java.spring_la_mia_pizzeria_security.repository.SpecialOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialOfferService {

    @Autowired
    private SpecialOfferRepository specialOfferRepository;

    public SpecialOffer findById(Integer id) {
        return specialOfferRepository.findById(id).get();
    }

    public SpecialOffer save(SpecialOffer specialOffer) {
        return specialOfferRepository.save(specialOffer);
    }

    public void delete(Integer id) {
        specialOfferRepository.deleteById(id);
    }
}