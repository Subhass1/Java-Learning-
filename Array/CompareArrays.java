/* ⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉  👉 All about java methods  ⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉ 
🔴Java Arrays.compare() Method
Syntax: compare()                   »→ Compares between two arrays

● Some imp information:
            ⇉ Returns 0 if the arrays are equal.
            ⇉ Returns a negative integer if the array1 is less than array2 lexicographically
            ⇉ Returns a positive integer if array1 is greater than array2 lexicographically.
            
*/

// For examples: 
package Array;
import java.util.Arrays;

public class CompareArrays {

    public static void main(String [] args){
        String [] A = {"Java", "Desktop", "Pen", "Pencil"};
        String [] B = {"Java", "Desktop", "Pen", "Pencil"};

        System.out.println("Comparing Arrays: " + Arrays.compare(A,B));
    }
}