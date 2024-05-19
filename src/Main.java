import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        // Primitive data types
//        byte metvlhth2 = 0;
//        char metvlhth3 = 'a';
//        short metvlhth4 = 12314;
//        long metavlhth6 = 155345345;
//
//        // The most common
//        boolean metvlhth1 = false;
//        int metvlhth5 = 1234;
//        double metavlhth7 = 1.353453;
//
//        //Non primitive
//        String metavlhth8 = "hello";
//
//        //Arrays
//        int[] intArray = {1, 2, 3, 4, 5, 6};
//        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
//        String[] stringArray = {"hello", "world"};
//
//        //naming convention
//        int metavlhth9;
//        int apotelesmaAthrismatos;
//        int _$;
//
//        // Operators
//        int number = 5 - 3;
//        number = number + 5;
//        number += 5;
//
//        boolean sinthinkh = true;
//        sinthinkh = !true;
//
//        number++;
//        number--;
//
//        // Bitwise operators
//        //~, & , |
//
//        // Relational operators
//        int x = 1;
//        int y = 2;
//        int z = 3;
//        boolean check = x == y;
//        boolean falseCheck = x != y;
//        boolean biggerCheck = x >= y;
//        boolean smallerCheck = x <= y;
//
//        // logical operators
//        // && -> and
//        boolean trueCheck = false && false;
//        // || -> or
//        boolean trueCheck2 = false || false;
//
//
//        // Cool ternary operators
//        int counter = 4;
//        if (check) {
//            counter = 3;
//        } else {
//            counter = 5;
//        }
//
//        counter = check ? 3 : 5;
//
//        if (trueCheck && falseCheck) {
//
//            if (x > 5) {
//
//            }
//        } else if (x == y) {
//
//        }
//
//        String someString = "hello";
//        switch (someString) {
//            case "hello":
//                y++;
//                break;
//            case "goodbye":
//                x++;
//                break;
//            case "Fuck off and die":
//                y--;
//                break;
//            default:
//                System.out.println("hello");
//        }
//
//        switch (z) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                someString = "Weekday";
//                break;
//            case 6:
//            case 7:
//                someString = "Weekend";
//                break;
//
//            default:
//                someString = "Invalid daytype";
//        }


        for (int p = 0; p < 8; p++) {
            System.out.println("1)Current iteration is: " + p);
        }

        System.out.println();

        int p = 0;
        while (p < 8) {
            System.out.println("2)Current iteration is: " + p);

            p++;
        }

        System.out.println();
        p = 0;
        do {
            System.out.println("3)Current iteration is: " + p);
            p++;
        } while (p < 8);

        System.out.println();

        int[] myArray = {1, 2, 3, 69};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("1) Current element: " + myArray[i]);
        }


        System.out.println();
        for (int a : myArray) {
            System.out.println("2) Current element: " + a);
        }

        System.out.println();
        System.out.println("p is: " + p);
        String myrFunctionResult = myFunction();
        System.out.println("Function return (): " + myrFunctionResult);

        int k = 6;
        int o = 7;
        myVoidFunction(k, o);
        myVoidFunction(o);
    }

    public static String myFunction() {
        String x = "Hello";
        String z = " World";
        return x + z;
    }

    public static void myVoidFunction(int x, int y) {
        System.out.println("The sum of these numbers is: " + (x + y));
    }

    public static void myVoidFunction(int y) {
        System.out.println("The number you want is: " + y);
    }

    //TODO method recursion
    //TODO arrays

}