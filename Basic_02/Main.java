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
