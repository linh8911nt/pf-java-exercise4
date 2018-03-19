import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int year; //năm sinh
        int age; //tuổi

        Scanner scanner = new Scanner(System.in);

        System.out.println("Năm sinh:");
        year = scanner.nextInt();

        age = 2018 - year;
        System.out.println("Tuổi:" + age);
    }
}

