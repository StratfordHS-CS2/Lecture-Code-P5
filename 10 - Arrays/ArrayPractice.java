public class ArrayPractice
{
    public static void printIntArray( int[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.print( array[i] + " " );
        }
        System.out.println();
    }
    
    public static void printStrArray( String[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( array[i] );
        }
    }
    
    public static void main( String[] args )
    {
        int[] nums = new int[10];
        
        for( int i = 0; i < nums.length; i++ )
        {
            nums[i] = i;
        }
        printIntArray( nums );
        
        //String[] names = new String[5];
        String[] names = { "Bob", "Jack", "Jill", "Dylan", "Nick" };
        printStrArray( names );
        System.out.println();
        names[0] = "William";
        printStrArray( names );
        System.out.println();
        
        // add a value to an array
        String[] names2 = new String[ names.length + 1 ];
        for( int i = 0; i < names.length; i++ )
        {
            names2[i] = names[i];
        }
        names2[names2.length - 1] = "Avis";
        names = names2;
        printStrArray( names );
    }
}





