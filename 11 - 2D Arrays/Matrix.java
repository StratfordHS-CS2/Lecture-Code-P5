public class Matrix
{
    public static int findBiggest( int[][] intArr )
    {
        int biggest = Integer.MIN_VALUE;  // the smallest integer -2billion
        for( int row = 0; row < intArr.length; row++ )
        {
            for( int col = 0; col < intArr[row].length; col++ )
            {
                if( intArr[row][col] > biggest )
                {
                    biggest = intArr[row][col];
                }
            }
        }
        return biggest;
    }
    
    public static void main( String[] args )
    {
        int[][] array = {
            { 1, 2, 3, 4 },
            { 6, 7, 8, 2 },
            { 9, 2, 6, 5 }
        };
        
        // print the array
        for( int row = 0; row < array.length; row++ )
        {
            for( int col = 0; col < array[row].length; col++ )
            {
                System.out.print( array[row][col] + " " );
            }
            System.out.println();
        }
        
        // find the biggest integer
        System.out.println( "The biggest number is: " + findBiggest( array ) );
    }
}








