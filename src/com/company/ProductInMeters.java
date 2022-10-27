package com.company;

public class ProductInMeters extends Article {

    private int width;
    private int length;

    public ProductInMeters(String name, double price, int width, int length) {
        super(name, price);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getEuroInventory(){

        return getMetrInventory()*getPrice();
    }

    @Override
    public String toString() {
        return '{' + getName() +
                " width=" + width +
                ", length=" + length +
                ", price=" + getPrice() +
                " sum to pay = " + getEuroInventory() +
                '}'+ '\n';
    }

    public double getMetrInventory(){
        return width*length;
    }


}

