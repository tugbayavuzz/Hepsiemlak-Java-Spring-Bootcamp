package com.hepsiemlak;

import com.hepsiemlak.hw1.model.Advert;
import com.hepsiemlak.hw1.model.Message;
import com.hepsiemlak.hw1.model.RealEstate;
import com.hepsiemlak.hw1.model.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User tugba = new User();
        tugba.setUserType("Bireysel");
        tugba.setName("Tugba");
        tugba.setEmail("tugba@gmail.com");
        tugba.setImage("tugba.png");
        tugba.setBiography("Tugba Yavuz");
        tugba.setTax("1234567891");

        User ayse = new User();
        ayse.setUserType("Bireysel");
        ayse.setName("Ayse");
        ayse.setEmail("ayse.sari@gmail.com");
        ayse.setImage("ayse.png");
        ayse.setBiography("Ayse Sari");
        ayse.setTax("1234567891");

        User hasan = new User();
        hasan.setUserType("Bireysel");
        hasan.setName("Hasan");
        hasan.setEmail("hasan.sari@gamil.com");
        hasan.setImage("hasan.png");
        hasan.setBiography("Hasan Sari");
        hasan.setTax("1234567892");

        User berk = new User();
        berk.setUserType("Kurumsal");
        berk.setName("Berk");
        berk.setEmail("berk.sari@gmail.com");
        berk.setImage("berk.png");
        berk.setBiography("Berk Sari");
        berk.setTax("1234567893");


        List<Message> tugbaMessages = new ArrayList<>();
        tugbaMessages.add(new Message("Mesaj Başlığı 1", "daire hk yazıyorum", new Date(), new Date(), true, tugba, ayse));
        tugba.setMessages(tugbaMessages);

        List<Message> ayseMessages = new ArrayList<>();
        ayseMessages.add(new Message("Mesaj Başlığı 2", "Buyrun", new Date(), new Date(), true, ayse, tugba));

        ayse.setMessages(ayseMessages);

        List<Message> hasanMessages = new ArrayList<>();
        hasanMessages.add(new Message("Mesaj Başlığı 3", "daireyi görebilir imiym", new Date(), new Date(), true, hasan, ayse));
        hasan.setMessages(hasanMessages);

        List<Message> berkMessages = new ArrayList<>();
        berkMessages.add(new Message("Mesaj Başlığı 4", "esyalı mı", new Date(), new Date(), true, berk, ayse));
        berk.setMessages(berkMessages);

        RealEstate realEstate1 = new RealEstate("Istanbul", "Avcılar", "daire", "3+1", 120, 4, 2500.0);
        RealEstate realEstate2 = new RealEstate("Istanbul", "Avcılar", "daire", "2+1", 100, 2, 3500.0);
        RealEstate realEstate3 = new RealEstate("Istanbul", "Avcılar", "daire", "1+1", 90, 1, 2900.0);
        RealEstate realEstate4 = new RealEstate("Tokat", "Avcılar", "daire", "3+1", 110, 3, 2800.0);

        String[] images = new String[2];
        images[0] = "resim1.png";
        images[1] = "resim2.png";

        List<Advert> advertList = new ArrayList<>();
        Advert advert1 = new Advert();
        advert1.setTitle("Sahibinden acil satılık!");
        advert1.setRealEstate(realEstate1);
        advert1.setUser(tugba);
        advert1.setActive(true);
        advert1.setImages(images);
        advertList.add(advert1);

        Advert advert2 = new Advert();
        advert2.setTitle("Dosta gider acill!");
        advert2.setRealEstate(realEstate2);
        advert2.setUser(ayse);
        advert2.setActive(true);
        advert2.setImages(images);
        advertList.add(advert2);

        Advert advert3 = new Advert();
        advert3.setTitle("Metroya koşarak 5 dk");
        advert3.setRealEstate(realEstate3);
        advert3.setUser(hasan);
        advert3.setActive(true);
        advert3.setImages(images);
        advertList.add(advert3);

        Advert advert4 = new Advert();
        advert4.setTitle("Öğrenciye ve bekara uygun");
        advert4.setRealEstate(realEstate4);
        advert4.setUser(berk);
        advert4.setActive(true);
        advert4.setImages(images);
        advertList.add(advert4);

        Set<Advert> favorites = new HashSet<>();
        favorites.add(advert1);
        ayse.setFavorites(favorites);

        // 1
        for (Advert advert : advertList) {
            RealEstate realEstate = advert.getRealEstate();
            if (realEstate.getCity().equals("Istanbul") && (realEstate.getRoom().equals("2+1") || realEstate.getRoom().equals("3+1")) && realEstate.getPrice() < 3000.0) {
                System.out.println(advert);
            }
        }

        // 2
        List<User> userList = new ArrayList<>();
        userList.add(tugba);
        userList.add(ayse);
        userList.add(hasan);
        userList.add(berk);
        for (User user : userList) {
            for (Message message : user.getMessages()) {
                System.out.println(user.getName() + " " + message.getTitle());
            }
        }

        // 3
        for (User user : userList) {
            if (user.getEmail().equals("ayse.sari@gmail.com")) {
                for (Advert favoriteAdvert : user.getFavorites()) {
                    System.out.println(favoriteAdvert);
                }
            }
        }

    }


}
