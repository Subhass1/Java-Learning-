package Decision_Making;

class Decison1 {

    public static void main(String[] args) {
        // ✍️ Instead of writing ternary operator.✍️
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");

        }

        // 🔴🔴In Ternary Operator🔴🔴🔴
        String result = (time < 18) ? "Good Day." : "Good Evening.";
        System.out.println(result);

    }
}

/*
 * 👉👉👉👉👉👉👉 Ternary Operator
 * ● It consists three operands.
 * ● It can be used to replace multiple lines of code with a single line, and it
 * often to replace simple if else statements:
 * ● Syntax:- variable = (condition) ? expressionTrue : expressionFalse;
 * 
 */

class examples {
    public static void main(String[] args) {
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        // 🔴 Find out if a number is even or odd.
        int Num = 5;

        if (myNum % 2 == 0) {
            System.out.println(Num + " is even");
        } else {
            System.out.println(Num + " is odd");
        }
    }
}
