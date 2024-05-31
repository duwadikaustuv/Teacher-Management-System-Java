
/**
 * Write a description of class Tutor here.
 *
 * @author (Kaustuv)
 * @version (1)
 */
public class Tutor extends Teacher //using extends keyword for inheritance of child class Tutor to the parent class Teacher 
{
    //creating instance variables for the following attributes
    private double salary, newsalary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //creating a constructor that accepts six attributes from parent class Teacher and four attributes from child class Tutor
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex)
    {
    //using super keyword to call the constructor of parent class Teacher
    super(teacherId, teacherName, address, workingType, employmentStatus);
    this.setworkingHours(workingHours);
    //assigning values of instance variables of child class Tutor
    this.salary = salary;
    this.specialization = specialization;
    this.academicQualifications = academicQualifications;
    this.performanceIndex = performanceIndex;
    this.isCertified = false;
}

//creating getter(accessor) methods that return the value of the following attributes
public double getsalary()
{
    return this.salary;
}

public String getspecialization()
{
    return this.specialization;
}

public String getacademicQualifications()
{
    return this.academicQualifications;
}

public int getPerformanceIndex()
{
    return this.performanceIndex;
}

public boolean isCertified()
{
    return this.isCertified;
}

//creating setter(mutator) method for the attribute salary
public void setsalary(double newsalary, int newperformanceIndex)
{
    //using if else for checking if performance index of tutor is more than 5 and working hours of tutor is more than 20 and to set appraisal
    if(newperformanceIndex>5 && getworkingHours()>20)
    {
        double appraisalPer;
            if(newperformanceIndex>=5 && newperformanceIndex<=7)
            {
            appraisalPer=0.05;
            }
        else if(newperformanceIndex>=8 && newperformanceIndex<=9)
        {
            appraisalPer=0.10;
        }
        else
        {
            appraisalPer=0.20;
        }
        //using the formula to calculate salary
        this.newsalary= salary+(appraisalPer*salary);
        this.salary=newsalary;//setting the value of newsalary for the attribute salary
        this.isCertified=true;//checking the status of isCertified
    }
    else
    {
        System.out.println("The tutor has not been certified yet. The salary cannot be approved: ");
    }
}

//creating a getter method for newsalary
public double getnewsalary()
{
    return this.newsalary;
}

//creating the method removeTutor for removing the tutor if the tutor has not been certified yet
public void removeTutor()
{
    //using if else to remove the tutor if it is not certified or display a message saying that tutor cannot be removed
    if(isCertified==false)
    {
        this.salary = 0;
        this.specialization = "";
        this.academicQualifications= "";
        this.performanceIndex = 0;
        this.isCertified = false;
    }
    else
    {
        System.out.println("The tutor is certified and cannot be removed: ");
    }
}

//creating a method to display the details of Tutor
public void display()
{
    if(isCertified==false)
    {
        super.display(); //using super keyword to call the display method from teacher class
    }
    else 
    {
        super.display();
        System.out.println("The salary is: "+this.salary);
        System.out.println("The specialization is: "+this.specialization);
        System.out.println("The academic qualifications is: "+this.academicQualifications);
        System.out.println("The performance index is: "+this.performanceIndex);
    }
}
//creating a method to check if the tutor is certified or not
public void checkCertification(int newPerformanceIndex, int workingHours) {
    if (newPerformanceIndex > 5 && workingHours > 20) 
    {
        this.isCertified = true;
        System.out.println("The tutor is certified.");
    } else {
        this.isCertified = false;
        System.out.println("The tutor is not certified yet.");
    }
}
}



    


    
