package Powtorka;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        User user1 = new User("Stefan");
        Admin admin1 = new Admin("Kazik");
        Moderator moderator1 = new Moderator("Wojtek");

        List<Osoba> list = new ArrayList<>();
        list.add(user1);
        list.add(admin1);
        list.add(moderator1);

        for(Osoba osoba : list){
            osoba.pisze();
        }

    }

}