package com.becerril.yugioh.service;

import com.becerril.yugioh.domain.Card;
import com.becerril.yugioh.repository.CardRepository;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {


    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }



    @Override
    public List<Card> findAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card findCardById(long id) {
        return cardRepository.findById(id).get();
    }

    @Override
    public Card saveCard(Card card) {

        List<Card> cards = cardRepository.findAll();

        for(Card  c : cards){

            if(card.getName().equals(c.getName())){
                System.out.println("Card already exists.");
                return null;
            }

        }

        Card newCard = new Card();
        newCard.setName(card.getName());
        newCard.setDescription(card.getDescription());
        newCard.setAttack(card.getAttack());
        newCard.setDefense(card.getDefense());
        newCard.setLevel(card.getLevel());

        return cardRepository.save(newCard);
    }


}
