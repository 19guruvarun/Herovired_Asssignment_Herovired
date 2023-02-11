import java.util.Scanner;

public class IMS {
    static Scanner sc= new Scanner(System.in);

    static class Product {
        String p_name;
        String p_spec;
        int cost;
        int count;

        Product(String p_name, String p_spec, int cost, int count) {
            this.p_name = p_name;
            this.p_spec = p_spec;
            this.cost = cost;
            this.count = count;
        }
    }

    static Product[] products = {
        new Product("Laptop", "8GB RAM, 512GB SSD, Intel i7 Processor", 900, 20),
        new Product("phone", "6GB RAM, 128GB Storage,Processor", 500, 30),
        new Product("Tabs", "4GB RAM, 64GB Storage, core_Processor", 300, 40)
    };

    public static void main(String[] args) {
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int ch= sc.nextInt();

            switch (ch) {
                case 1:
                    viewProductList();
                    break;
                case 2:
                    viewProductCount();
                    break;
                case 3:
                    viewProductDetails();
                    break;
                case 4:
                    editProduct();
                    break;
                case 5:
                    update_Inventory();
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }

    static void viewProductList() {
        System.out.println("\nProduct List");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].p_name);
        }
    }

    static void viewProductCount() {
        System.out.println("\nProduct Count");
        System.out.print("Enter product name: ");
        String productName = sc.next();
        for (int i = 0; i < products.length; i++) {
            if (products[i].p_name.equalsIgnoreCase(productName)) {
                System.out.println("Count: " + products[i].count);
                return;
            }
        }
        System.out.println("Invalid p_Name");
    }

    static void viewProductDetails() {
        System.out.println("\nProduct Details");
        System.out.print("Enter the product name: ");
        String productName = sc.next();
        for (int i = 0; i < products.length; i++) {
            if (products[i].p_name.equalsIgnoreCase(productName)) {
            System.out.println("Name: " + products[i].p_name);
            System.out.println("Specification: " + products[i].p_spec);
            System.out.println("Cost: " + products[i].cost);
            System.out.println("Count: " + products[i].count);
            return;
            }
            }       
             System.out.println("Invalid p_Name");
            }
            static void editProduct() {
                System.out.println("\nEdit Product");
                System.out.print("Enter the product name: ");
                String productName = sc.next();
                for (int i = 0; i < products.length; i++) {
                    if (products[i].p_name.equalsIgnoreCase(productName)) {
                        System.out.print("Enter new specification: ");
                        products[i].p_spec = sc.next();
                        System.out.print("Enter new cost: ");
                        products[i].cost = sc.nextInt();
                        System.out.println("Product details updated successfully.");
                        return;
                    }
                }
                System.out.println("Product not found.");
            }
            
            static void update_Inventory() {
                System.out.println("\nUpdate Inventory");
                System.out.print("Enter the product name: ");
                String productName = sc.next();
                for (int i = 0; i < products.length; i++) {
                    if (products[i].p_name.equalsIgnoreCase(productName)) {
                        System.out.print("Enter quantities to add");
                        int quantity = sc.nextInt();
                        products[i].count += quantity;
                        System.out.println("Inventory updated successfully");
                        return;
                    }
                }
                System.out.println("Invalid p_Name");

            }
        }            
