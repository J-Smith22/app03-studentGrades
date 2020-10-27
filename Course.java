

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    
    
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer Architectures", "CO457");
        module3 = new Module("Networking", "CO451");
        module4 = new Module("User Experience", "CO455");
    }
    
    public void addModule(Module module, int moduleNo)
    {
    
    
    }

    /**
     * 
     * 
     */
    public void print()
    {
        System.out.println("Course" + codeNo + "=" + title);

    }
}

