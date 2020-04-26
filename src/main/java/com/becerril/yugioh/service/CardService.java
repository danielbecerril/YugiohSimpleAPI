package com.becerril.yugioh.service;

import com.becerril.yugioh.domain.Card;

import java.util.List;


public interface CardService {

    List<Card> findAllCards();

    Card findCardById(long id);

    Card saveCard(Card card);
}
