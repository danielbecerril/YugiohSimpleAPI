package com.becerril.yugioh.controller;


import com.becerril.yugioh.domain.Card;
import com.becerril.yugioh.service.CardService;
import com.becerril.yugioh.service.CardServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CardController.BASE_URL)
public class CardController {

    public static final String BASE_URL = "/api/v1/cards";


    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getAllCards(){
        return cardService.findAllCards();
    }

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable("id") long id){
        return cardService.findCardById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Card saveCard(@RequestBody Card card){
        return cardService.saveCard(card);
    }

}
