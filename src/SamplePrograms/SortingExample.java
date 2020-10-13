package SamplePrograms;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SortingExample {

    static int arr[] = new int[100];

    public static void main(String[] args) {
        //fill th earray with 100 random number from 1 to 1000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 + 1);
            System.out.print(arr[i] + " | ");
            if ((i + 1) % 10 == 0) //every 10th number
                System.out.println("");
            }

            System.out.println("\nSorting in 3 seconds");
            try {
                Thread.sleep(3000);
            } catch (Exception ex) {

            }
            System.out.println("---------------------");
            
            for (int i = 0; i < arr.length -1 ; i++){
                int smallest = findSmallestLocation(i);
                swap(i,smallest);
            }
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
            if ((i + 1) % 10 == 0) //every 10th number
                System.out.println("");
            }
        }
    
    //find smallest lod-> return location o fsmallest number
    // given  a start point in th elist
    public static int findSmallestLocation (int startPoint){
        int smallestLoc = startPoint;
        //store the number at the start point
        int smallestNum=arr[startPoint];
        //go through list frim start point +1 to the end
        for (int i = startPoint+1; i < arr.length; i++){
            if (arr[i] < smallestNum){
                smallestLoc=i;
                smallestNum=arr[i];
            }
        }
        return smallestLoc;
    }
    public static void swap (int loc1,int loc2){
        int temp =arr[loc1];
        arr[loc1]=arr[loc2];
        arr[loc2]=temp;
    }
    }


