package Powtorka;

public class Moderator implements Osoba{

    private String name;

    public Moderator(String name) {
        this.name = name;
    }

    @Override
    public void pisze() {
        System.out.println(name);
    }
}
