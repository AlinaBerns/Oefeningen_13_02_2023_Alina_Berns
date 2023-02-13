package be.intecbrussel;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MyArrays {
    public static void main(String[] args) {

         /*
    Oefening 1
    - creeer op 2 manieren een array
    - Met datatype van double en char
    - Druk 1 element van beide array's af in de commando lijn
     */
        int[] num_users = new int[3];

        num_users[0] = 1;

        num_users[1] = 2;

        num_users[2] = 3;

        //of

        int[] num_users1 = {1, 2, 3};

        //- Met datatype van double en char

        double[] double_num = {12.03, 23.05, 132.5};

        char[] myChar = {'a', 'b', 'c', 'd', 'e'};

        // - Druk 1 element van beide array's af in de commando lijn

        System.out.println(double_num[1]);
        System.out.println(myChar[3]);

        /*Oefeningen ARRAYS
        1 - 5
         */


        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 10 numbers...");

        int[] user = new int[10];

        user[0] = in.nextInt();
        user[1] = in.nextInt();
        user[2] = in.nextInt();
        user[3] = in.nextInt();
        user[4] = in.nextInt();
        user[5] = in.nextInt();
        user[6] = in.nextInt();
        user[7] = in.nextInt();
        user[8] = in.nextInt();
        user[9] = in.nextInt();

        for (int index = 0; index <= user.length - 1; index++) {
            System.out.println(user[index]);
        }

        for (int index1 = user.length - 1; index1 >= 0; index1--) {
            System.out.println(user[index1]);
        }
        boolean contains = IntStream.of(user).anyMatch(x -> x == 4);
    }

}

