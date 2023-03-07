import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class task1{
    public static void main(String[] args) {
        Integer[] A = { 6, 2, 8, 5, 3, 9 };
 
        List<Integer> ints = Arrays.asList(A);
 
        System.out.println("Min element is " + Collections.min(ints));
        System.out.println("Max element is " + Collections.max(ints));
    }
}