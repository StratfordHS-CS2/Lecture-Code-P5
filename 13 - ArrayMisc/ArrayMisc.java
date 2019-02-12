import java.util.Arrays;

public class ArrayMisc
{
    /**
     * Return a string representation of the array.
     * 
     * @param arr the array to be stringified
     * @return the String version of the array
     */
    public static String outputIntArray( int[] arr )
    {
        String out = "";
        out = "[ ";
        for( int i = 0; i < arr.length; i++ )
        {
            out += arr[i] + " ";
        }
        out += "]";
        return out;
    }
    
    public static String outputStrArray( String[] arr )
    {
        String out = "";
        out = "[ ";
        for( int i = 0; i < arr.length; i++ )
        {
            out += arr[i] + " ";
        }
        out += "]";
        return out;
    }
    
    public static void main( String[] args )
    {
        // check default value for an int array
        int[] intArr = new int[5];
        System.out.println( outputIntArray( intArr ) );
        // default value for an int array is an array full of zeros.
        
        // fill the array with a value
        // Arrays.fill( arrayName, value );
        Arrays.fill( intArr, 5 );  // fill intArr with 5s
        System.out.println( outputIntArray( intArr ) );
        
        // add some values to the array
        intArr[1] = 3;
        intArr[2] = 9;
        intArr[3] = 12;
        System.out.println( outputIntArray( intArr ) );
        
        // sort the array
        // Arrays.sort( arrayName );
        Arrays.sort( intArr );
        System.out.println( outputIntArray( intArr ) );
        
        // Do the same things for Strings array
        String[] strArr = new String[5];
        System.out.println( outputStrArray( strArr ) );
        // default value of a String array is an array full of nulls (null = no value)
        
        strArr[0] = "Compsci\n";
        strArr[1] = "computer\n";
        strArr[2] = "Physics C\n";
        strArr[3] = "CompScience\n";
        strArr[4] = "Physics Class\n";
        System.out.println( outputStrArray( strArr ) );
        Arrays.sort( strArr );
        System.out.println( outputStrArray( strArr ) );
    }
}











