

/**
 * Write a description of class Course here.
 *
 * @author Joshua Smith
 * @version 2016.02.29
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
    
    private int finalMark;
        
    private Grades finalGrade;

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
    
    public void addMark(int mark, int moduleNo)
    {
    if(moduleNo == 1)
    {
    module1.awardMark(mark);
    }
    if(moduleNo == 2)
    {
    module2.awardMark(mark);
    }
    if(moduleNo == 3)
    {
    module3.awardMark(mark);
    }
    if(moduleNo == 4)
    {
    module4.awardMark(mark);
    }
    
    }

    /**
     * 
     * 
     */
    public void print()
    {
        System.out.println("Course" + codeNo + "=" + title);

    }
    
    public Grades convertToGrade(int mark)
    {
    if(mark >= 0 && (mark < 40))
        {
    return Grades.F;
    }
    
    {
    if(mark > 40 && (mark < 49))
    return Grades.D;
    }

    {    
    if(mark > 50 && (mark < 59))
    return Grades.C;
    } 
    
    {
    if(mark > 60 && (mark < 69))
    return Grades.B;
    } 
    
    {
    if(mark > 70 && (mark < 100))
    return Grades.A;
     }    
    return Grades.X;
}
}

