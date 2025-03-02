package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenSquareSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 4);

        
        List<Integer> output = numbers.stream()
                                                .map(num -> num % 2 == 0 ? num * num : num)
                                                .sorted() 
                                                .collect(Collectors.toList());
        
        System.out.println("Processed List: " + output);
    }
}
