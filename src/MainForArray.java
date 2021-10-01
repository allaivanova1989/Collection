import java.util.ArrayList;

public class MainForArray {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
      numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(6);
        numbers.add(7);
        numbers.add(5);
        numbers.add(12);
        numbers.add(12);
        numbers.add(7);
        numbers.add(7);
        ServiForArray newclass = new ServiForArray();
        System.out.println(newclass.mostFrequent(numbers));
    }
}
