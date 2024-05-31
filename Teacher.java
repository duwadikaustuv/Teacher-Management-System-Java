public class Teacher
{
    //creating instance variables for the following attributes
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //Creating a constructor that accepts these five parameters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
        //assigning values of instance variables to the corresponding parameter values
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    } 
    //creating getter(accessor) methods that return the value of the following attributes
    public int getteacherId()
    {
        return teacherId;
    }
    public String getteacherName()
    {
        return teacherName;
    }
    public String getaddress()
    {
        return address;
    }
    public String getworkingType()
    {
        return workingType;
    }
    public int getworkingHours()
    {
        return workingHours;
    }
    public String getemploymentStatus()
    {
        return employmentStatus;
    }
    
    //creating setter(mutator) method for the attribute workingHours
    public void setworkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }
    
    //creating a display method for output of the following attributes
    public void display()
    {
        System.out.println("The teacher Id is: "+this.teacherId);
        System.out.println("The teacher name is: "+this.teacherName);
        System.out.println("The address is: "+this.address);
        System.out.println("The working type is: "+this.workingType);
        System.out.println("The employment status is: "+this.employmentStatus);
        
        //Using if else for working hours to display a suitable message if not assigned
        if(workingHours!=0)
        {
            System.out.println("The working hours is: "+workingHours);
        }
        else
        {
            System.out.println("The working hours is not assigned: ");
        }
    }
    
}
    
    