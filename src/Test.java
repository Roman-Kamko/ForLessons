import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person = " + person);
        changePerson(person);
        System.out.println("person = " + person);
    }

    public static void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}
