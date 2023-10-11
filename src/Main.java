import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();

        Scanner product = new Scanner(System.in);
        System.out.println("Add product");

        String name = product.nextLine();

        System.out.println("the product is " + name);
    }
}