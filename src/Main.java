
import java.util.Scanner;


public class Main {
    public static String[] products = {"Хлеб", "Яблоки", "Молоко"};
    public static int[] prices = {100, 200, 300};
    public static int[] counts = new int[products.length];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        while (true) {
            System.out.println("Введите номер товара и его колличество или \"end\"");
            printProducts();
            userInput = scanner.nextLine();
            if ("end".equals(userInput))
                break;


            final String[] inputRaw = userInput.split(" ");
            counts[Integer.parseInt(inputRaw[0]) - 1] += Integer.parseInt(inputRaw[1]);
        }

        printReceipt();
    }

    public static void printProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d, %s\t\t%d\n", (i + 1), products[i], prices[i]);

        }
    }

    public static void printReceipt() {
        int sum = 0;

        for (int i = 0; i < products.length; i++) {
            if (counts[i] == 0) continue;
            int sumOfProduct = prices[i] * counts[i];
            System.out.printf("%-15s %-4d %-4d %-5d\n", products[i], prices[i], counts[i], sumOfProduct);
            sum += sumOfProduct;
        }

        System.out.println("Итого: " + sum);

    }

}