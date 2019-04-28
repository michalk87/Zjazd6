package ZadWojna;

public class ColorBattle implements Battle{

    public static void main(String[] args) {
        int cardColor = CardColor.Clubs.getValue();
        System.out.println("cardColor " + cardColor);
    }

    @Override
    public int checkWinner(Deck deck, Deck secondDeck) {

        int sumOfColorValuesinDeck1 = calculateColorValues(deck);
        int sumOfColorValuesinDeck2 = calculateColorValues(secondDeck);
        if (sumOfColorValuesinDeck1 > sumOfColorValuesinDeck2) {
            return 1;
        } else if (sumOfColorValuesinDeck1 < sumOfColorValuesinDeck2) {
            return -1;
        } else {
            return 0;
        }
    }

    private static int calculateColorValues(Deck deck) {

        int sum = 0;

        //        sum = deck.getCards().stream()
//            .map(x -> x.getColor().getValue())
//            .reduce(0, Integer::sum);

        for (Card card : deck.getCards()) {

        //    sum += card.getColor().getValue();

        }

        return sum;
    }
}
