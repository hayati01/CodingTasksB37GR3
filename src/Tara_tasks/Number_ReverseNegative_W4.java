package Tara_tasks;

public class Number_ReverseNegative_W4 {
    public static void main(String[] args) {

        System.out.println(reverseNumber(-456));

    }

    public static int reverseNumber(int num) {

        String numberString = String.valueOf(num).substring(1); // index 0 is negative sign "-"
        String reversed = ""; // empty String

        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversed += numberString.charAt(i);
        }

        return -Integer.parseInt(reversed);

    }




}


/*
Write a return method that can reverse
negative number and return it as int

      Ex:
      input => -456
      output => -654



 */