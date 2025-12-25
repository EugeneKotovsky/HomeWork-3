import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int winCount = 0;

        while (true) {
            System.out.print("Введите год: ");
            int year = sc.nextInt();
            System.out.print("Введите количество дней: ");
            int days = sc.nextInt();

            int daysInYear = getDaysInYear(year);

            if (daysInYear == days) {
                winCount++;
            } else {
                System.out.println("Неправильно! В этом году " + daysInYear + " дней!");
                System.out.println("Набрано очков: " + winCount);
                break;
            }
        }
    }

    public static int getDaysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}

