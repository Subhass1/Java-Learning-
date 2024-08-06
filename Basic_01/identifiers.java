/*
✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️ Variables_Concept ✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️
🔴All Java variables must be identified with unique names.
🔴These unique names are called identifiers.
🔴Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
🔴Note: It is recommended to use descriptive names in order to create understandable and maintainable code:

      // Good
        int minutesPerHour = 60;

     // OK, but not so easy to understand what m actually is
        int m = 60;

👉The general rules for naming variables are:
➡️Names can contain letters, digits, underscores, and dollar signs
➡️Names must begin with a letter
➡️Names should start with a lowercase letter, and cannot contain whitespace
➡️Names can also begin with $ and _ (but we will not use it in this tutorial)
➡️Names are case-sensitive ("myVar" and "myvar" are different variables)
➡️Reserved words (like Java keywords, such as int or boolean) cannot be used as names

*/

class identifiers {

    public static void main(String [] args){
        // Student data
String studentName = "Subhash Yadav";
int studentID = 15;
int studentAge = 23;
float studentFee = 75.25f;
char studentGrade = 'B';

// Print variables
System.out.println("Student name: " + studentName);
System.out.println("Student id: " + studentID);
System.out.println("Student age: " + studentAge);
System.out.println("Student fee: " + studentFee);
System.out.println("Student grade: " + studentGrade);

    }

}
