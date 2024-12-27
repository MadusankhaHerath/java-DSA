
import java.util.Scanner;
public class array{

     public static void main (String [] Arg){
        Scanner scn = new Scanner (System.in);

        int[] arr = new int[5];
        int size = 5;


        for (int i = 0; i<size ; i++){
            System.out.print("enter number :  ");
            arr[i] = scn.nextInt();
        }

        for (int j =0 ; j<size ;j++){
            System.out.println(arr[j]);
        }
        


 
    }
}