package com.company;

public abstract class Article implements Comparable<Article> {

    private String name;
    private double price;

    public Article(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Article article) {
        return (int) (getEuroInventory() - article.getEuroInventory());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getEuroInventory();

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "sum to pay" + getEuroInventory() +
                '}';
    }
}
