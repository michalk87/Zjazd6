package Powtorka;

public class User implements Osoba{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void pisze() {
        System.out.println(name);

    }
}
