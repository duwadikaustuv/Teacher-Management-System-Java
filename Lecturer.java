
/**
 * Write a description of class Lecturer here.
 *
 * @author (Kaustuv)
 * @version (1)
 */
public class Lecturer extends Teacher //using extends keyword for inheritance of child class Lecturer to the parent class Teacher 
{
    //creating instance variables for the following attributes
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    //Creating a constructor that accepts the five parameters from parent class Teacher and also two atrributes from child class Lecturer
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience)
    {
        //Using super keyword to call the constructor of parent class Teacher
        super(teacherId, teacherName, address, workingType, employmentStatus);
        //assigning values of instance variables of child class Lecturer to the corresponding parameter values
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }
    //creating getter(accessor) methods that return the value of the following attributes
    public String getdepartment()
    {
        return this.department;
    }
    
    public int getyearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    
    public int getgradedScore()
    {
        return this.gradedScore;
    }
    
    //creating setter(mutator) method for the attribute gradedScore
    public void setgradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }
    
    //creating method gradeAssignment for grading students 
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience)
    {
        //using if nested if for checking years of experience and department of the lecturer and if else if ladder for the grade of the students
        if(yearsOfExperience>=5 && department.equals(this.department))
        {
            if(gradedScore>=70)
            {
                this.gradedScore=gradedScore;
                System.out.println("The student got an A: ");
            }
            else if(gradedScore>=60)
            {
                this.gradedScore=gradedScore;
                System.out.println("The student got a B: ");
            }
            else if(gradedScore>=50)
            {
                this.gradedScore=gradedScore;
                System.out.println("The student got a C: ");
            }
            else if(gradedScore>=40)
            {
                this.gradedScore=gradedScore;
                System.out.println("The student got a D: ");
            }
            else if(gradedScore<40)
            {
                this.gradedScore=gradedScore;
                System.out.println("The student got an E: ");
            }
            hasGraded=true;
        }
        else
        {
            System.out.println("The lecturer has not graded yet: ");
        }
    }
    
    //creating a method to display the details of Lecturer
    public void display()
    {
        super.display(); //using super keyword to call the display method from the parent class Teacher to display the attributes declared in the teacher class
        //displaying the attributes of this child class Lecturer
        System.out.println("The department is: "+this.department);
        System.out.println("The years of experience is: "+this.yearsOfExperience);
        //using if else for hasGraded
        if(hasGraded==true)
        {
            System.out.println("The graded score is: "+this.gradedScore);
        }
        else
        {
            System.out.println("The score has not been graded yet: ");
        }
    }

    
    }
    