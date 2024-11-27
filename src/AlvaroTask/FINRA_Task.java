package AlvaroTask;

public class FINRA_Task {

    /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    EX:
    1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
     */

    //  Tara will share the solution
    // next week we will meet on Wednesday at 3:30 pm EST

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.print(" ");
            if (i % 15 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            }else {
                System.out.print(i);
            }
        }

    }
}
