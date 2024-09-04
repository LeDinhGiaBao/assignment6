
package assignment6;


import java.util.ArrayList;
import java.util.Scanner;
public class Assignment6 {
    public static ArrayList <Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap pha tu thu: " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
         System.out.println("Cac phan tu trong mang: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int findMax2(ArrayList<Integer> numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }
        return max2;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
    }
}

class Process {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhap mang");
            System.out.println("2. Xuat mang");
            System.out.println("3. Tim phan tu lon thu 2");
            System.out.println("4. Xoa cac so le");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    numbers = Assignment6.EnterData(numbers);
                    break;
                case 2:
                    Assignment6.DisplayData(numbers);
                    break;
                case 3:
                    int max2 = Assignment6.findMax2(numbers);
                    System.out.println("Phan tu lon thu 2: " + max2);
                    break;
                case 4:
                    Assignment6.deleteOddNumber(numbers);
                    System.out.println("Mang sau khi xoa so le:");
                    Assignment6.DisplayData(numbers);
                    break;
                case 5:

            System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");

            }
        } while (choice != 5);
    }
}

