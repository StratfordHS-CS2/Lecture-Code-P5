public class PersonRunner
{
    public static void main( String[] args )
    {
        Person dylan = new Person();  // create a new person object
        System.out.println( "Default: " + dylan );
        dylan.setName( "Dylan" );
        dylan.setAge( 100 );
        dylan.setHeight( 66 );
        dylan.setHairColor( "Black" );
        System.out.println( "Updated: " + dylan );
        
        System.out.println( "Name: " + dylan.getName() );
        System.out.println( "Age: " + dylan.getAge() );
        System.out.println( "Height: " + dylan.getHeight() );
        System.out.println( "HairColor: " + dylan.getHairColor() );
        
        System.out.println( dylan.greet() );
        
        // make another person
        Person gabe = new Person();
        gabe.setName( "Gabriel" );
        System.out.println( gabe );
    }
}






