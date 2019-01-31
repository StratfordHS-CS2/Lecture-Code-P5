import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main( String[] args )
    {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        numList.add(0);  // add 0 to the end of numList
        numList.add(1);
        numList.add(2);
        numList.add(3);
        System.out.println( numList );
        
        numList.add(1, 4); // add 4 at location 1
        System.out.println( numList );
        
        numList.set(3, 200); // set location 3 to be 200
        System.out.println( numList );
        
        System.out.println( "Location 2 = " + numList.get(2) );
        
        numList.remove( 2 );  // remove location 2 from the list
        System.out.println( numList );
        
        System.out.println( numList.contains( 3 ) );
        System.out.println( "3 is at location " + numList.indexOf(3) );
        
        System.out.println( "numList.size() = " + numList.size() );
        
        // make a 2d ArrayList
        ArrayList<ArrayList<String>> list2d = new ArrayList<ArrayList<String>>();
        list2d.add( new ArrayList<String>() );
        
    }
}








