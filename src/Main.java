public class Main {
    public static void main(String... args) {
        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        String myString = "Hello!";
        System.out.println(myString);


        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        //float myNumber = 3.14;
        //System.out.println(myNumber);
        // Step 9 - Option 1: Fixing the compilation error by using a double data type
        double myNumber2 = 3.14;
        System.out.println(myNumber2);
        // Step 9 - Option 2: Fixing the compilation error by explicitly casting the float value
        float myNumber3 = (float) 3.14;
        System.out.println(myNumber3);
        // Step 9 - Option 3: Fixing the compilation error by using a float literal with 'f' suffix
        float myNumber4 = 3.14f;
        System.out.println(myNumber4);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        //11:Try to create a variable named class. What happens?
        //A:If you try to create a variable named class in Java, you will encounter a compilation error. The word class is a reserved keyword in Java, which means it has a special meaning and is used to define class declarations.


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";
        //^What are the two different types of errors we are observing?^
        // A runtime exception will occur, specifically a ClassCastException. Attempting to cast an Object (which holds a reference to a String) directly to an int type.
        //A compilation error will occur. The reason is that you are trying to perform an invalid type cast from a String literal to an int. The types String and int are incompatible, and direct casting between them is not allowed.

        int a = 4;
        a += 5;

        int b = 3;
        int c = 4;
        c *= b;

        int q = 10;
        int w = 2;
        q /= w;

        int f = 10;
        int g = 2;
        f -= g;


//        Assigning a value larger than the type can hold:
//
//If you assign a value larger than the maximum value that the data type can hold, it will result in an overflow. For example, assigning a value larger than Integer.MAX_VALUE to an int variable will cause it to wrap around and become a negative value. This behavior is known as integer overflow.

//        Incrementing a numeric variable past the type's capacity:
//
//If you increment a numeric variable beyond its maximum value, a similar overflow behavior will occur.
    }

}