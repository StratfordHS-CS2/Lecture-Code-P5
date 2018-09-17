public class Parameters
{
    /**
     * Adds five to the provided number.
     * 
     * @param   num     The number to add five to.
     */
    public static void addFive( int num )
    {
        int sum = num + 5;
        System.out.println( "num = " + num );
        System.out.println( "sum = " + sum );
    }
    
    public static int returnAddFive( int num )
    {
        num = num + 5;
        return num;
    }
    
    public static void main( String[] args )
    {
        addFive( 7 );
        addFive( 25 );
        System.out.println( "10 + 5 = " + returnAddFive( 10 ) );
        
        System.out.println( "Math.PI = " + Math.PI );
        System.out.println( "5^3 = " + Math.pow( 5, 3 ) );
        System.out.println( "abs(-12) = " + Math.abs( -12 ) );
        System.out.println( "sqrt( 30 ) = " + Math.sqrt( 30 ) );
    }
}







