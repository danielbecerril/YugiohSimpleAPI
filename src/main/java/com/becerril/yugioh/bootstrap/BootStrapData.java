package com.becerril.yugioh.bootstrap;

import com.becerril.yugioh.domain.Card;
import com.becerril.yugioh.repository.CardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CardRepository cardRepository;

    public BootStrapData(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading card data");

        Card card1 = new Card();
        card1.setName("Blue-eyes white dragon");
        card1.setDescription("The legendary dragon");
        card1.setLevel(8);
        card1.setAttack(3000);
        card1.setDefense(2500);
        cardRepository.save(card1);

        Card card2 = new Card();
        card2.setName("Red-eyes black dragon");
        card2.setDescription("A ferocious dragon");
        card2.setLevel(7);
        card2.setAttack(2400);
        card2.setDefense(2000);
        cardRepository.save(card2);

        System.out.println("Cards saved: " + cardRepository.count());
    }
}
