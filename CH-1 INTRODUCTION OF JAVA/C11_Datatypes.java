public class C11_Datatypes {
    public static void main(String args[]) 
    {
        // Integer Data types

        byte b1 = 127;    // 1 byte (range approximately -128 to 127)
        short s1 = 32767;  // 2 bytes (range approximately -32,768 to 32,767)
        int i = 2147483647; // 4 bytes (range approximately -2^31 to 2^31 - 1)
        long i1 = 9223372036854775807L; // 8 bytes (range approximately -2^63 to 2^63 - 1)

        // Float Datatypes

        float f1 = 3.14f; // 4 bytes
        double d1 = 3.141592653589793; // 8 bytes
        // char Data types
        char c1 = 'A'; // 2 bytes (Unicode character)
        // String is not a primitive data type, it's a class in Java
         String str = "Hello"; // just for it dont count 
        // boolean Data types
        boolean bool = true; // 1 bit (typically stored as 1 byte)

        // Printing out the values of each variable
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);
        System.out.println("i: " + i);
        System.out.println("i1: " + i1);
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);
        System.out.println("c1: " + c1);
        System.out.println("str: " + str);
        System.out.println("bool: " + bool);
    }
}
