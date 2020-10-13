package SamplePrograms;

public class Example1 {

    public static void main(String[] args) {
        int x[] = {67, 7, 45, 98, 0, 0, 0, 0};
        //         0   1   2   3  4
        String names[]={"Bob","Sue","Andy"};
        
        
        int logicalSize = 4;
        //logicalSize = number of actual items stored
        //it is also the location where the NEXT new item will go
        
        int abc[] = new int[5], xyz[];
        
        xyz = abc;  //ok  this creates a pointer to abc
        //abc and xyz both point to the same list of numbers
        
        abc[4] = 50;
        System.out.println(xyz[4]);  // get 50
        xyz[1] = 99;  //using xyz reference to put 99 in list at loc 1
        
        for (int i = 0; i < abc.length; i++) {
            System.out.format("abc[%d] = %d\n", i, abc[i]);
        }
       
        
        
        //          0  1  2  3  4  5
        x[1] = 100;  //2nd location
        int ii = 4;
        x[ii - 1] = 94;
        int count7 = 0;
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
            if (x[i] == 7) {
                count7++;
            }
        }
       // System.out.println("There are " + count7 + " 7's in the list");
        // System.out.println("" + x[10]);  index out of bounds
        System.out.println("Adding 5th assignment mark");
        if(logicalSize < x.length){
            x[logicalSize] = 82;
            logicalSize++;
        }
        System.out.println("Updated list of marks:");
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
        }
        
        
    }

}
