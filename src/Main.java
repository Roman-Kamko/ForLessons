public class Main {
    public static final double CM_PER_INCH = 2.54;

    // константа которую можно использовать в других иетодах
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    public static void exercise1() {
        System.out.println("Упражнение 1");
        // Операции
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }

    public static void exercise2() {
        System.out.println("Упражнение 2");
        // Операции
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println("Квадратный корень от числа " + x + " равен " + y);

        double z = 9.997;
        int nz = (int) z;
        // преобразование тип double в тип int
        System.out.println(nz);
        int nnz = (int) Math.round(z);
        // преобразование тип double в тип int с округлением
        System.out.println(nnz);

        System.out.println("Упражнение 3");
        // Строки
        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        // Второй параметр метода substring ()  обозначает позицию символа, который не следует включать в состав подстроки.
        System.out.println(s);
        String greeting2 = "Hello";
        greeting2 = greeting.substring(0, 3) + "p!";
        System.out.println(greeting2);

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);
        String repeated = "Java".repeat(3);
        System.out.println(repeated);

        String str = "";
        if (str.equals("")) {
            // Либо можно использовать if (str.length() == 0)
            System.out.println("Строка пуста");
        } else {
            System.out.println(str);
        }

        System.out.printf("%,+.2f", 10_000.0 / 4.0);
    }

    public static void exercise3() {
        System.out.println("Упражнение ...");
        // Условные операторы
        int one = 10;
        int two = 10;
        int three = 9;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }

        int yourSales = 1_400_000;
        int target = 750_000;

        if (yourSales >= target * 2) {
            System.out.println("Excellent, your bonus 1 000");
        } else if (yourSales >= target * 1.5) {
            System.out.println("Fine, your bonus 500");
        } else if (yourSales >= target) {
            System.out.println("Satisfactory, your bonus 100");
        } else {
            System.out.println("You're fired");
        }

        int balance = 0;
        int goal = 1_000_000;
        int payment = 100_000;
        int interestRate = 10;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100.0;
            balance += interest;
            years++;
            System.out.println(years + " year." + balance);
        }
        System.out.println(years + " years.");
    }
}