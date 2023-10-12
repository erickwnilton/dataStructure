import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();

        Scanner Data = new Scanner(System.in);

        while (true) {
            System.out.println("1. add new product");
            System.out.println("2. list all products");
            System.out.println("3. update product");
            System.out.println("4. remove product");
            System.out.println("0. Sair");

            int readOption = Data.nextInt();

            switch (readOption) {
                case 1:
                    System.out.println("Write");
                    String product = Data.next();
                    products.add(product);

                    System.out.println("product added");
                    break;
                case 2:
                    System.out.println("products in the list:");
                    for(String productName : products) {
                        System.out.println(productName);
                    }
                    break;
                case 3:
                    System.out.println("enter index to update product:");
                    int index = Data.nextInt();

                    if(index >= 0 && index < products.size()) {
                        System.out.print("new name: ");

                        String newProductName = Data.next();

                        products.set(index, newProductName);
                        System.out.println("successfully");
                    }

                    else {
                        System.out.println("invalid");
                    }
                    break;
                case 4:
                    System.out.println("enter index to delete product:");
                    int removeIndex = Data.nextInt();

                    if(removeIndex >= 0 && removeIndex < products.size()) {
                        String removedProduct = products.remove(removeIndex);

                        System.out.println("removed product: " + removedProduct);
                    }

                    else {
                        System.out.println("invalid");
                    }
                    break;
                case 0:
                    System.out.println("exit");
                    Data.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }
}