
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
    }
}