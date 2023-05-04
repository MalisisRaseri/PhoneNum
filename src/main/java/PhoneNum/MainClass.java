package PhoneNum;
import java.util.HashMap;
import java.util.HashSet;


public class MainClass {
    public static void main(String[] args) {
        PhoneNumber num1 = new PhoneNumber("963", "3751435");
        PhoneNumber num2 = new PhoneNumber("9690", "7688083");
        PhoneNumber num3 = new PhoneNumber("8392", "7894518");


        HashSet<PhoneNumber> setOfNumbers = new HashSet<>();
        setOfNumbers.add(num1);
        setOfNumbers.add(num2);
        setOfNumbers.add(num3);
        setOfNumbers.add(num1); //не выводит, так как дублирование номера

        System.out.println(setOfNumbers);


        HashMap<Integer, PhoneNumber> phoneNumbers = new HashMap<>();
        phoneNumbers.put(1, num1);
        phoneNumbers.put(2, num2);
        phoneNumbers.put(3, num3);
        phoneNumbers.put(4, num3); //выводит, так как другой ключ

        System.out.println(phoneNumbers);

    }
}
