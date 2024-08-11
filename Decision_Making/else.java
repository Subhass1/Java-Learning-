package Decision_Making;

class decion {
    public static void main(String[] args) {
        int time = 20;

        if (time < 18) {
            System.out.println("Good Day.");
        } else {
            System.out.println("Good Evening:");
        }

    }

    // Example explained: In the example above, time(20) is greater than 18, so the condition is false. Because of this, we move on to the else condition and  print to the screen"Good evening". If the time was less than 18, the program would print"Good day".
}

/*
 * 👉 The else statement
 * ● Use the else statement to specify a block of code to be executed if the
 * condition is false.
 * ● Syntax:- if (condition) {
 * // block of code to be executed if the condition is true
 * } else {
 * // block of code to be executed if the condition is false
 * }
 * 
 */
