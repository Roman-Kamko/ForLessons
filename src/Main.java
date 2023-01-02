public class Main {
    public static final double CM_PER_INCH = 2.54;

    // константа которую можно использовать в других иетодах
    public static void main(String[] args) {

        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        int one = 10;
        int two = 10;
        int three = 9;
        System.out.println();
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