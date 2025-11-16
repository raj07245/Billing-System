package Billing_Shopping_Cart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ShoppingCart cart=new ShoppingCart();

        while (true){
            System.out.println("\n=====BILLING SYSTEM=====");
            System.out.println("1. Add Product");;
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Generate BIll");
            System.out.println("5. Exit");
            System.out.println("Choose: ");

            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Product name: ");
                    String name=sc.next();

                    System.out.println("Enter Price: ");
                    double price=sc.nextDouble();

                    System.out.println("Enter Quantity: ");
                    int qty=sc.nextInt();

                    Product p=new Product(name,price,qty);
                    cart.addProduct(p);
                    break;

                case 2:
                    System.out.println("Enter Product name to Remove: ");
                    String removeName=sc.next();
                    cart.removeProduct(removeName);
                    break;

                case 3:
                    cart.showCart();
                    break;

                case 4:
                    double bill=cart.calculateBill();
                    System.out.println("Final Bill (including GST): ₹ "+bill );
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
