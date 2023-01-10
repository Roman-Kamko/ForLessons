import java.util.*;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*System.out.print("What is your name?");
        String name = in.nextLine();

        System.out.print("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));*/

        System.out.print("Сколько денег тебе нужно для выхода на пенсию? ");
        double goal = in.nextDouble();

        System.out.print("На какую сумму ты готов пополнять счет ежегодно? ");
        double payment = in.nextDouble();

        System.out.print("Какова твоя ежегодная ставка (в %): ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        String input;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Для достижения цели в " +goal+" рублей, тебе потребуется "+years+" лет.");

        /*do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            System.out.printf("После %d лет твой баланс %,.2f%n", years, balance);
            System.out.println("Готов выйти на пенсию? (Y/N) ");
            input = in.next();
        } while (input.equals("N"));*/
    }
}
