package Decision_Making;

 class else_if {
    public static void main(String[] args) {
        
   
    int time = 22 ;
    if(time<10)
    {
        System.out.println("Good morning.");
    }else if(time<18)
    {
        System.out.println("Good day.");
    }else
    {
        System.out.println("Good evening.");
    }
    // Outputs "Good evening."
}

}

/*
  👉The else if Statement
  ●Use the else if statement to specify a new condition if the first condition
  is false.
  ● Syntax:- if (condition1) {
  // block of code to be executed if condition1 is true
  } else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is
  true
  } else {
  // block of code to be executed if the condition1 is false and condition2 is
  false
  }
 */


 /*
  ✍️✍️✍️Example explained
In the example above, time (22) is greater than 10, so the first condition is false. The next condition, in the else if statement, is also false, so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".

However, if the time was 14, our program would print "Good day."
  */