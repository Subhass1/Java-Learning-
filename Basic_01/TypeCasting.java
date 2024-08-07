/* 
✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️ Type Casting_Concept ✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️
👉Java Type Casting:- when you assign a value of one primitive data type to another type.

     🔴 In Java, there are two types of casting:

        ● Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        ● Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
*/

// ➡️ Widening Casting:- Widening casting is done automatically when passing a smaller size type to a larger size type:

 class type {
    public static void main(String[] args) {
        int  num = 9;
        double myDouble = num; // Automatic casting: int to double

        System.out.println(num); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
    }
}


// ➡️Narrowing Casting:- Narrowing casting must be done manually by placing the type in parentheses () in front of the value:

public class TypeCasting {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}

//🔴🔴Examples:-

 class info {
  public static void main(String[] args) {
    // Set the maximum possible score in the game to 500
    int maxScore = 500;

    // The actual score of the user
    int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
    float percentage = (float) userScore / maxScore * 100.0f;

    // Print the result
    System.out.println("User's percentage is " + percentage);
  }
}