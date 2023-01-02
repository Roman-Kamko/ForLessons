public class Main {
    public static final double CM_PER_INCH = 2.54;

    // константа которую можно использовать в других иетодах
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1() {
        System.out.println("Упражнение 1");
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }

    public static void exercise2() {
        System.out.println("Упражнение 2");
        int one = 10;
        int two = 10;
        int three = 9;
        if (one > two) {
            if (one>three) {
                System.out.println(one);
            }else{
                System.out.println(three);
            }
        } else if (two>three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}