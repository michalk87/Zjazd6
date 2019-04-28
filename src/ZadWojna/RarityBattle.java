package ZadWojna;

import java.util.List;

public class RarityBattle {

public int CheckWinner(Deck deck, Deck secondDeck){

RarityBattle rarityBattle = new RarityBattle();
int numberOfRareCardsInDeckOne = rarityBattle.calculateRareNumber(deck);
int numberOfRareCardsInDeckTwo = rarityBattle.calculateRareNumber(secondDeck);

if (numberOfRareCardsInDeckOne > numberOfRareCardsInDeckTwo){
    System.out.println("Zwyciężył gracz numer 1");
    System.out.println("Liczba kart rzadkich: "+ numberOfRareCardsInDeckOne);
    return 1;
}else if (numberOfRareCardsInDeckOne < numberOfRareCardsInDeckTwo){
    System.out.println("Zwyciężyła talia numer 2");
    System.out.println("Liczba kart rzadkich: " + numberOfRareCardsInDeckTwo);
    return 2;
}else{
    System.out.println("Remis");
    System.out.println("Liczba kart rzadkich talii 1:" + numberOfRareCardsInDeckOne);
    System.out.println("Liczba kart rzadkich talii 2" + numberOfRareCardsInDeckTwo);
    return 0;
}


}

private int calculateRareNumber (Deck deck){
    int counter = 0;
    for(Card card : deck.getCards()){
        if (card.isRare()){
            counter++;
        }
    }
    return counter;
}


}
