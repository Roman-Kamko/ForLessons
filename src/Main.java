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
    public static void exercise2(){
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
    }

    public static void exercise3() {
        System.out.println("Упражнение 2");
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
    }
}