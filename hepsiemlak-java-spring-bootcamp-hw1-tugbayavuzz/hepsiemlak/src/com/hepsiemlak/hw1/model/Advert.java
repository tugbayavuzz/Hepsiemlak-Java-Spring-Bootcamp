package com.hepsiemlak.hw1.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class Advert {

    private RealEstate realEstate;
    private String title;
    private User user;
    private String[] images = new String[5];
    private BigDecimal price;
    private int time;
    private Date createDate;
    private boolean putForward = false;
    private boolean analyze = false;
    private boolean active;

    public Advert() {
    }

    public Advert(RealEstate realEstate, String title, User user, String[] images, BigDecimal price, int time, Date createDate, boolean putForward, boolean analyze, boolean active) {
        this.realEstate = realEstate;
        this.title = title;
        this.user = user;
        this.images = images;
        this.price = price;
        this.time = time;
        this.createDate = createDate;
        this.putForward = putForward;
        this.analyze = analyze;
        this.active = active;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isPutForward() {
        return putForward;
    }

    public void setPutForward(boolean putForward) {
        this.putForward = putForward;
    }

    public boolean isAnalyze() {
        return analyze;
    }

    public void setAnalyze(boolean analyze) {
        this.analyze = analyze;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "realEstate=" + realEstate +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", images=" + Arrays.toString(images) +
                ", price=" + price +
                ", time=" + time +
                ", createDate=" + createDate +
                ", putForward=" + putForward +
                ", analyze=" + analyze +
                ", active=" + active +
                '}';
    }
}
