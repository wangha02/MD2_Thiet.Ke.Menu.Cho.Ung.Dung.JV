import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve Tam Giac");
            System.out.println("2. Ve Hinh Vuong");
            System.out.println("3. Ve Hinh Chu Nhat");
            System.out.println("0. Exit");
            System.out.println("Nhap su lua chon");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ve Tam Giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Ve Hinh Chu Nhat");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khng co sua lua chon");
            }
        }
    }
}