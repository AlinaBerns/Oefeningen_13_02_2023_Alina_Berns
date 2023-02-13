package be.intecbrussel;
import java.util.Arrays;
import java.util.Scanner;
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

        //OPDRACHT 1
        System.out.println("*** OPDRACHT 1 ***");
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

        }
        System.out.println(Arrays.toString(user));

        //OPDRACHT 2
        System.out.println("*** OPDRACHT 2 ***");

        int[] user1 = user.clone();

        for (int index1 = user1.length - 1; index1 >= 0; index1--) {
            System.out.println(user1[index1]);
        }


        //OPDRACHT 3
        System.out.println("*** OPDRACHT 3 ***");
        boolean contains = IntStream.of(user).anyMatch(x -> x == 4);

        System.out.println(contains);

        //OPDRACHT 4
        System.out.println("*** OPDRACHT 4 ***");

        int Evens = 0;
        int Odd = 0;

        for(int i = 0;i<user.length;i++){
            if(user[i]%2 == 0){
                Evens++;
            }else{
                Odd++;
            }
        }
        System.out.println("The number of odd numbers: " + Odd);
        System.out.println("The number of even numbers: " + Evens);

        //OPDRACHT 5
        System.out.println("*** OPDRACHT 5 ***");
        String [] strArray = {"Convert", "array", "to", "String"};
        System.out.println(Arrays.toString(strArray));

        // OF

        String myString = String.join(" ", strArray);
        System.out.println(myString);

        // OF

        System.out.println(strArray[0]+" "+strArray[1]+" "+strArray[2]+" "+strArray[3]);
    }
}

