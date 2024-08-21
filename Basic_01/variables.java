/* ⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉ Variables_Concept ⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉
  🔴 Definition ⇶ Variable is the name of memory location. In other word we can say it is user defined name which is given by user. variables can store any type of values.
                 👉There are three types of variables:
                        ● Local Variables ⇉ A variables which is declared inside the body of the method parameter called local variables.
                                       Syntax : void fun()
                                       {
                                       int x; //local variables
                                       }

                        ● Instance Variables ⇉ A variables which is declared inside the class but outside of all the methods is called instacne variables.
                                       syntax : class A
                                       {
                                       int a; //instance variables
                                       public static void main(String[] args){
                                       }
                                       }
                        ● Static Variables ⇉ A variables which is declared with the static keyword called static variables.
                                        Syntax : class A
                                        {
                                        static int b= 20; //static 
                                        int c = 30;//instance
                                        public static void main (String [] args){
                                        
                                        int a = 20; // Local
                                        A ref new A();
                                        System.out.println(A.b);
                                        System.out.println(ref.c);
                                        }
                                        }


 👉 In Java, there are different types of variables, for example:

        ⇶ String: stores text, ————→ "Hello".  ➡️String values are surrounded by double quotes
        ⇶ int: stores integers (whole numbers), without decimals, ————→  123 or -123
        ⇶ float: stores floating point numbers, with decimals, ————→  19.99 or -19.99
        ⇶ char: stores single characters, ————→  'a' or 'B'. ➡️Char values are surrounded by single quotes
        ⇶ boolean: stores values with two states: true or false
     
    ➡️ Declaring (Creating) Variables
               ——→ Syntax:- type variableName = value;

 */



class variables {

    public static void main(String[] args) {

        // writing variables string

        String name = "Subhash";
        System.out.println(name);

        // Integer Variables ⤵️
        int myNum = 15;
        System.out.println(myNum);

        // Write another way on integer
        int mynumber;
        mynumber = 20;
        System.out.println(mynumber);

        // Other types of variables

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);

        char myLetter = 'D';
        System.out.println(myLetter);

        boolean myBool = true;
        System.out.println(myBool);

    }

}

/*
 * 👉 *************Print Variables*****************
 * 
 */

class variable {

    public static void main(String[] args) {

        // 👉To combine both text and a variable, use the + character:
        String firstName = "Subhash ";
        String lastName = "Yadav1";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // Declare Multiple Variables {First Way}
        int x = 2;
        int y = 4;
        int z = 10;
        System.out.println(x + y + z);

        // Second Way
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

    }

}


// Add two number program in java (without user)
 class A {

    public static void main(String [] args){
        int a = 10; 
        int b =20;
        System.out.println(a+b);
    }
}