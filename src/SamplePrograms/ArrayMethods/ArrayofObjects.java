
package SamplePrograms.ArrayMethods;


public class ArrayofObjects {


    public static void main(String[] args) {
       Room myRooms[] = new Room[5];
       String roomNames[]={"Kitches", "Den", "Washroom", "Bedroom", "Playroom"};
       
        for (int i = 0; i < myRooms.length; i++) {
            myRooms[i] = new Room
                    ("Room " + (i+1),
                    (int)(Math.random() * 20 +10),
                    (int)(Math.random() * 20 +10)
                    ); 
                    System.out.println(myRooms[i]);
            
        }
        int avgArea=0;
        for (int i = 0; i < myRooms.length; i++) {
            avgArea += myRooms[i].getArea();
        }
        avgArea/=myRooms.length;
        System.out.println("The average room size is " + avgArea);

    }
    
}
