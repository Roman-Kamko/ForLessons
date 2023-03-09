import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "мир озарим и разорим";
        str = str.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(str);
        boolean stringIsPolindrom = stringBuilder.reverse()
                .toString().equals(str);
        if (stringIsPolindrom == true) {
            System.out.println("строка является полиндромом");
        } else {
            System.out.println("строка не является полиндромом");
        }

        System.out.println("--------------------------------------------");

        String string = "мир озарим и разорим";
        int mid = string.length() / 2;
        String[] part = {string.substring(0, mid), string.substring(mid)};
        System.out.println(part[0]);
        System.out.println(part[1]);

        System.out.println("--------------------------------------------");

        String[] strArray = {"Hello", "Hello", "Hello", "Java", "World", "Hello", "World"};
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            String tmp = strArray[i];
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[j] != null && strArray[j].equals(tmp)) {
                    strArray[j] = null;
                }
            }
            if (strArray[i] != null) {
                stringBuilder1.append(strArray[i]).append(" ");
            }
        }
        System.out.println(stringBuilder1);

        System.out.println("--------------------------------------------");

        int[] num = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == -2) {
                    System.out.println(num[i] + " " + num[j]);
                }
            }
        }

        System.out.println("--------------------------------------------");


    }
}