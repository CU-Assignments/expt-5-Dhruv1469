import java.util.ArrayList;
import java.util.List;

public class exp51 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(20);
        numbers.add(Integer.valueOf(30));
        numbers.add(40);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);

        String strNum = "100";
        Integer parsedInt = Integer.parseInt(strNum);
        System.out.println("Parsed Integer: " + parsedInt);
    }
}
