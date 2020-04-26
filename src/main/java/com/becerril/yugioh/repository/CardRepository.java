package com.becerril.yugioh.repository;

import com.becerril.yugioh.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {


}
