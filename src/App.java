import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the size of the array:");
        int mySize = input.nextInt();

        System.out.println("Please enter the power:");
        int myPower = input.nextInt();

        int myArray[];

        //Calling the toPower() function
        myArray = toPower(mySize, myPower);

        //Output the contents of the array returned by toPower()
        System.out.println("The outputs of the toPower() function are:");
        /* for(int i= 0; i < myArray.length; i++)
        {
            if(i != myArray.length-1)
                System.out.printf("%d, ", myArray[i]);
            else
                System.out.printf("%d", myArray[i]);
        } */

        System.out.println(Arrays.toString(myArray));
    }


    //This function will take the following two parameters:
    // size: int
    // pow: int
    // Return an array of integers. Each elment of the array is the power (pow)
    // of the index of the array.

    public static int[] toPower(int size, int pow)
    {

       //Create an array of size of "size"
       int retVal[] = new int[size];

       //initialize the array with 0s
       for (int i= 0; i<size; i++)
       {
            retVal[i] = 0;
       }

       //Raise the index to the "pow"
       for (int i = 0; i < size; i++)
       {
         retVal[i] = (int)Math.pow(i, pow);
       }
        
       return retVal;
    }
}
