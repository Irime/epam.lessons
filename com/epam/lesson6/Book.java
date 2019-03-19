package com.epam.lesson6;

public class Book {
    private int ID;
    private String name;
    private String author;
    private String publisher;
    private int publishingYear;
    private int pages;
    private double price;

    public Book(int ID, String name, String author, String publisher,
                int publishingYear, int pages, double price){
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book view(){
        return new Book(ID, name, author, publisher, publishingYear, pages, price);
    }
}
