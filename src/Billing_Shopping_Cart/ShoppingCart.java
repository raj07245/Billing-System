package Billing_Shopping_Cart;

import java.util.ArrayList;


public class ShoppingCart {
    private ArrayList<Product> cart=new ArrayList<>();

    public void addProduct(Product p){
        cart.add(p);
        System.out.println("Product added successfully!");
    }

    public void showCart(){
        if (cart.isEmpty()){
            System.out.println("Cart is empty");
        }else {
            System.out.println("Your Cart:");
            for (Product p : cart){
                System.out.println(p.getName()+"-Qty: "+p.getQuantity()+"-Price: "+p.getPrice());
            }
        }
    }

    public void removeProduct(String name){
        cart.removeIf(p ->p.getName().equalsIgnoreCase(name));
        System.out.println("Product removed!");
    }

    public double calculateBill(){
        double total=0;
        for (Product p : cart){
            total = total+p.getTotalPrice();
        }
        double gst= total*0.18;
        return total+gst;
    }
 }
