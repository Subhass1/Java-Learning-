/*
 ✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️ All About Maths Method✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️
🔴The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
     ● The Math.max(x,y) method can be used to find the highest value of x and y:
     ● The Math.min(x,y) method can be used to find the lowest value of x and y:
     ● The Math.sqrt(x) method returns the square root of x:
     ● The Math.abs(x) method returns the absolute (positive) value of x:
     ● Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
*/

public class math {
    public static void main(String [] args){
        System.out.println(Math.max(20,40));
        System.out.println(Math.min(4,6));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-10.7));
        System.out.println(Math.random());

        // One Examples set on random method
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
