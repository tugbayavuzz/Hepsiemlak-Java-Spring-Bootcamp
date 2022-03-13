package com.hepsiemlak.hw1.model;

import java.util.Date;

public class Message {

    private String title;
    private String content;
    private Date sendDate;
    private Date readDate;
    private boolean read;
    User sender;
    User receiver;

    public Message() {
    }

    public Message(String title, String content, Date sendDate, Date readDate, boolean read, User sender, User receiver) {
        this.title = title;
        this.content = content;
        this.sendDate = sendDate;
        this.readDate = readDate;
        this.read = read;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", sendDate=" + sendDate +
                ", readDate=" + readDate +
                ", read=" + read +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
