package com.hepsiemlak.hw1.model;

import java.util.List;
import java.util.Set;

public class User {

    private String userType;
    private String name;
    private String email;
    private String image;
    private String biography;
    private String tax;
    Set<Advert> favorites;
    List<Advert> adverts;
    List<Message> messages;

    public User() {
    }

    public User(String userType, String name, String email, String image, String biography, String tax) {
        this.userType = userType;
        this.name = name;
        this.email = email;
        this.image = image;
        this.biography = biography;
        this.tax = tax;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public Set<Advert> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<Advert> favorites) {
        this.favorites = favorites;
    }

    public List<Advert> getAdverts() {
        return adverts;
    }

    public void setAdverts(List<Advert> adverts) {
        this.adverts = adverts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User{" +
                "userType='" + userType + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", biography='" + biography + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }
}
