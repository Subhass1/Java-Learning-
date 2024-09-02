package Array;
import java.util.Arrays;
public class copyArrays {
    public static void main(String[] args) {
        
        String [] fruits = {"Car", "Bus", "Jeep", "Cycle"};
        Arrays.fill(fruits, 0, 2, "Subhas");
        
        // System.out.print("Fill Arrays: " + Arrays.fill(fruits));
        System.out.println(fruits);
    }
    
}
