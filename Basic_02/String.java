/*
  ✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️ All About String ✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️✍️
       ● Strings are used for storing text.
       ● A String variable contains a collection of characters surrounded by double quotes:
       ➡️For example:-  String greeting = "Hello";

 */

// 👉String Length⤵️

 class txt {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
  }
}

// 🔴The more string methods:-

class Text {
  public static void main(String[] args) {

    String txt = "Hello World";
    System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase()); // Outputs "hello world"
  }

}

/*
 * 👉Finding a Character in a String :- The indexOf() method returns the index
 * (the position) of the first occurrence of a specified text in a string
 * (including whitespace):
 */

// ➡️Java String Concatenation:- The + operator can be used between strings to
// combine them. This is called concatenation:

class conact {
  public static void main(String[] args) {
    String firstName = "Subhash";
    String MiddleName = "Kumar";
    String LastName = "Yadav";

    System.out.println(firstName + " " + MiddleName + " " + LastName);

  }
}

// ✍️Note that we have added an empty text (" ") to create a space between
// firstName and lastName on print.
// 🔴You can also use the concat() method to concatenate two strings:

class Name {
  public static void main(String[] args) {
    String firstName = "Naresh";
    String lastName = "Kumar";
    // String LastName = "Yadav";

    System.out.println(firstName.concat(lastName));

  }

}

 class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
  }
}

/*
 👉Java Number and Strings
 Note: ❗Java uses the + operator for both addition and concatenation.
       ❗Numbers are added. Strings are concatenated.
 */
// For exampeles adding integer...
class int1{
public static void main(String [] args){

  int A = 10;
  int B = 20;
System.out.println(A + B);
}
}

// Examples of adding String
class Strings{
  public static void main(String [] args){
  String x = "10";
  String y = "20";

  System.out.println(x + y);

  }
}

// Adding String and Numbers
class NumberandString{
  public static void main(String [] args){
    int x = 10;
    String y = "50";

    System.out.println(x + y);
  }
}

/*
 🔴 Some unique Concepts :- String Special Characters
 
    Escape character	     Result	      Description
          \                 '	         Single quote
          \"	              "	         Double quote
          \\	              \	         Backslash
 */
class texts{
  public static void main(String [] args){

    //The sequence \"  inserts a double quote in a string:
    String txt = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt);

    //The sequence \'  inserts a single quote in a string:
    String txt1 = "It\'s alright.";
    System.out.println(txt1);

    //The sequence \\  inserts a single backslash in a string:
    String txt2 = "The character \\ is called backslash.";
    System.out.println(txt2);
  }
}

/*
 🔴Other common escape sequences that are valid in Java are:
       Code	      Result	
        \n	      New Line	
        \r	      Carriage Return	
        \t	      Tab	
        \b	      Backspace	
        \f	      Form Feed
 */