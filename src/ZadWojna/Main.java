package ZadWojna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(createDeck());
        RarityBattle rarityBattle = new RarityBattle();
        rarityBattle.CheckWinner(createDeck(), createDeck());

        System.out.println(createDeck());

        createDeck();
        createRandomCard();
        createRandomCard();

    }
    private static Deck createDeck(){

        List<Card> cards = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Card card = createRandomCard();
            cards.add(card);
        }
        Deck deck = new Deck(cards);
        return deck;
    }

    private static Card createRandomCard(){
        Random random = new Random();
        int randomNumber = random.nextInt(9)+1;
        System.out.println(randomNumber);

        int randomColorNumber = random.nextInt(4);

        CardColor cardColor = CardColor.values() [randomColorNumber];
//        System.out.println("Wylosowany numer koloru: " + randomColorNumber);
//        System.out.println("Wylosowany kolor: "+ cardColor);

        boolean isRare = random.nextBoolean();

        Card card = new Card(cardColor, randomNumber, isRare);

        System.out.println("Wylosowany karta: " + card);


        return card;
    }
}
