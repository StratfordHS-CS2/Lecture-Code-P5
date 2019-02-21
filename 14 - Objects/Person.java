public class Person
{
    // things that define a person
    // instance variables
    // generally these should be private so access is controlled
    private String name;
    private int age;
    private int height;  // inches
    private String hairColor;
    
    // constructor
    // this is where you set the default values
    public Person()
    {
        name = "";
        age = 0;
        height = 0;
        hairColor = "";
    }
    
    // Other methods
    public String greet()
    {
        return "Good Morning!";
    }
    
    // accessor methods
    // getters
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public String getHairColor()
    {
        return hairColor;
    }
    
    // setters
    public void setName( String n )
    {
        name = n;
    }
    
    public void setAge( int a )
    {
        age = a;
    }
    
    public void setHeight( int h )
    {
        height = h;
    }
    
    public void setHairColor( String hc )
    {
        hairColor = hc;
    }
    
    // toString - Tell Java how to print a Person object
    public String toString()
    {
        return name + " is " + age + " years old, " + height + " inches tall with " + hairColor + " hair.";
    }
}







