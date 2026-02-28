package org.lessons.java.spring_la_mia_pizzeria_security.repository;

import org.lessons.java.spring_la_mia_pizzeria_security.model.SpecialOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialOfferRepository extends JpaRepository<SpecialOffer, Integer> {
    
}
