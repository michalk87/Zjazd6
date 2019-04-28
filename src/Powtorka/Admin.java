package Powtorka;

public class Admin implements Osoba{

    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void pisze() {
        System.out.println(name);
    }
}
