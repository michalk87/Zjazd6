package ZadWojna;

public class Card {

    private int value;
    private CardColor color;
    private boolean rare;

    public Card(CardColor color,int value, boolean rare) {
        this.value = value;
        this.color = color;
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", color=" + color +
                ", rare=" + rare +
                '}';
    }

    public boolean isRare() {
        return rare;
    }
}
