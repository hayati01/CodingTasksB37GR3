package AlvaroTask;

public class OddOrEven {


    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static void main(String[] args) {

        identify(5);
        identify(6);

    }

    public static void identify(int number) {

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
