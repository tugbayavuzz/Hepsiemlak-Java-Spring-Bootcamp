package com.hepsiemlak.hw1.model;

public class RealEstate {
    private String city;
    private String town;
    private String type;
    private String room;
    private int area;
    private int floor;
    private double price;

    public RealEstate(String city, String town, String type, String room, int area, int floor, double price) {
        this.city = city;
        this.town = town;
        this.type = type;
        this.room = room;
        this.area = area;
        this.floor = floor;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", type='" + type + '\'' +
                ", room='" + room + '\'' +
                ", area=" + area +
                ", floor=" + floor +
                ", price=" + price +
                '}';
    }
}
