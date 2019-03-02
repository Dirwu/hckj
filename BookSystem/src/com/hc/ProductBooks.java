package com.hc;

import java.util.Random;

public class ProductBooks {
    //用于随机生成图书编号
    private int id;
    private String name;
    private String author;
    private String summary;
    private double price;
    private String publisher;
    private int amount;

    public ProductBooks(String name, String author, double price, String publisher) {
        this.setId();
        this.name = name;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.amount = 0;
    }

    public ProductBooks() {

    }

    public long getId() {
        return id;
    }
    public void setId(){
        Random ran = new Random();
        id = ran.nextInt();
        if(id<0){
            id = -id;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return "ProductBooks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
