import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfWeek
{
    public static void printDaysOfWeek()
    {
        // for loops are used when you know how many times you 
        // want the loop to run.
        System.out.println( "Using a for loop..." );
        // for( start; continuing condition; increment )
        for( int i = 0; i <= 7; i++ )
        {
            System.out.println( "Weekday " + i + ": " + weekdayName( i ) );
        }
    }
    
    public static String weekdayName( int dayNum )
    {
        String dayName = "";
        // Weeks start on Saturday. So dayNum = 0 --> dayName = "Saturday"
        // "or" is "||"
        // "and" is "&&"
        // "not" is "!"
        // "not equals" is "!="
        if( dayNum == 0 )
        {
            dayName = "Saturday";
        }
        else if( dayNum == 1 )
        {
            dayName = "Sunday";
        }
        else if ( dayNum == 2 )
        {
            dayName = "Monday";
        }
        else if ( dayNum == 3 )
        {
            dayName = "Tuesday";
        }
        else if ( dayNum == 4 )
        {
            dayName = "Wednesday";
        }
        else if ( dayNum == 5 )
        {
            dayName = "Thursday";
        }
        else if ( dayNum == 6 )
        {
            dayName = "Friday";
        }
        else if ( dayNum == 7 )
        {
            dayName = "Saturday";
        }
        else 
        {
            dayName = "error";
        }
        return dayName;
    }
    
    public static void main( String[] args )
    {
        System.out.println( "Weekday 1: " + weekdayName(1) );
        System.out.println( "Weekday 2: " + weekdayName(2) );
	System.out.println( "Weekday 3: " + weekdayName(3) );
	System.out.println( "Weekday 4: " + weekdayName(4) );
	System.out.println( "Weekday 5: " + weekdayName(5) );
	System.out.println( "Weekday 6: " + weekdayName(6) );
	System.out.println( "Weekday 7: " + weekdayName(7) );
	System.out.println( "Weekday 0: " + weekdayName(0) );
	System.out.println();
	System.out.println( "Weekday 43: " + weekdayName(43) );
	System.out.println( "Weekday 17: " + weekdayName(17) );
	System.out.println( "Weekday -1: " + weekdayName(-1) );
	
	GregorianCalendar cal = new GregorianCalendar();
	int todayNum = cal.get( GregorianCalendar.DAY_OF_WEEK );
	System.out.println( "\nToday is a " + weekdayName( todayNum ) );
	
	System.out.println();
	printDaysOfWeek();
	System.out.println();
	
	Scanner keyboard = new Scanner( System.in );
	int dayNum = 0;
	// while loops are used when you don't know how many
	// times the loop will run.
	// while( continuing condition )
	while( dayNum != -1 )
	{
	    System.out.print( "Enter a day number (0-7): " );
	    dayNum = keyboard.nextInt();
	    keyboard.nextLine();
	    if( dayNum != -1 )
	    {
	        System.out.println( "Day number: " + dayNum + " is a " + weekdayName( dayNum ) );
	    }
	    else
	    {
	        System.out.print( "Exiting..." );
	    }
	}
    }
}









