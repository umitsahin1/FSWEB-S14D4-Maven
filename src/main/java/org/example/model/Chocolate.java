package org.example.model;

public class Chocolate extends ProductForSale{
    private String cocoaContent;


    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String cocoaContent) {
        super(type, price, description);
        this.cocoaContent = cocoaContent;
    }

    public String getCocoaContent() {
        return cocoaContent;
    }
     @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Content: " + cocoaContent);
    }
}
