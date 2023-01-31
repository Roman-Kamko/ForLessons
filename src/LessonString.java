import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LessonString {
    public static void main(String[] args) {
        String phone = "+960 415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный!");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий!");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Номер начинается не с 7!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("--------------------------------");

        // Способы сортировки в строках

        /*преобразовать строку в массив символов, используя toCharArray() метод, отсортируйте массив с помощью
        Arrays.sort() и создайте новую строку из массива символов с помощью конструктора строк*/
        String str1 = "CABD";
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        str1 = new String(chars);
        System.out.println(str1);

        /*с помощью метода String.chars(), который возвращает IntStream (поток целых чисел), представляющий целочисленное
        представление символов в строке. После получения IntStream, мы сортируем его и собираем каждый символ в
        отсортированном порядке в StringBuilder.*/
        String str2 = "CABD";
        str2 = str2.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println(str2);

        /*вместо создания IntStream, мы также можем преобразовать каждый символ в строке в односимвольную строку и вместо
        этого получить поток строк.*/

        String str3 = "CADB";

        str3 = Stream.of(str3.split(""))
                .sorted()
                .collect(Collectors.joining());

        System.out.println(str3);
    }
}
