import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeacherGUI {
    //making instance variables for GUI components
    private JFrame frame;
    private JPanel Panel;
    private JLabel TitleLabel, TeacherHeadingLabel, TeacherIdLabel, TeacherNameLabel, AddressLabel, WorkingTypeLabel, EmploymentStatusLabel, WorkingHoursLabel, LecturerHeadingLabel, DepartmentLabel, YearsOfExperienceLabel, GradedScoreLabel, TutorHeadingLabel, SalaryLabel, SpecializationLabel, AcademicQualificationsLabel, PerformanceIndexLabel, NewSalaryLabel, NewPerformanceIndexLabel;
    private JTextField TeacherIdField, TeacherNameField, AddressField, WorkingHoursField, DepartmentField, YearsOfExperienceField, GradedScoreField, SalaryField, SpecializationField, AcademicQualificationsField, PerformanceIndexField, NewSalaryField, NewPerformanceIndexField;
    private JButton AddLecturerButton, AddTutorButton, GradeAssignmentButton, SetSalaryButton, RemoveTutorButton, DisplayButton, ClearButton;
    private JComboBox<String> WorkingTypeComboBox, EmploymentStatusComboBox;
    private ArrayList<Teacher> teachersList;

    //creating a constructor for initializing the instance variables
    public TeacherGUI() 
    {
        //creating an arraylist to hold teacher objects
        teachersList = new ArrayList<>();
        //Creating Frame
        frame = new JFrame("Teacher Management System");
        frame.setSize(1920,1080);
        frame.setLayout(null);
        
        //Importing the colors using custom color
        Color Light = new Color(243,248,255);
        Color Pinkish = new Color(44,0,62);
        Color Purplish = new Color(198,207,255);
        Color Blueish = new Color(222,236,255);
        Color Darkblue = new Color(16,44,87);
        
        //Changing the background color of frame
        frame.getContentPane().setBackground(Light);
        
        //Title
        TitleLabel = new JLabel("Teacher Management System");
        TitleLabel.setBounds(600,0,350,30);
        frame.add(TitleLabel);
        TitleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        TitleLabel.setForeground(Darkblue);
        
        //Teacher Heading
        TeacherHeadingLabel = new JLabel("Teacher:");
        TeacherHeadingLabel.setBounds(370,35,100,30);
        frame.add(TeacherHeadingLabel);
        TeacherHeadingLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        TeacherHeadingLabel.setForeground(Darkblue);
        
        //Teacher id
        TeacherIdLabel = new JLabel("Teacher id:");
        TeacherIdLabel.setBounds(370,70,120,30);
        TeacherIdField = new JTextField();
        TeacherIdField.setBounds(520,70,150,30);
        frame.add(TeacherIdLabel);
        frame.add(TeacherIdField);
        TeacherIdLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        TeacherIdLabel.setForeground(Darkblue);
        TeacherIdField.setBackground(Blueish);
        
        //Teacher name
        TeacherNameLabel = new JLabel("Teacher name:");
        TeacherNameLabel.setBounds(770,70,120,30);
        TeacherNameField = new JTextField();
        TeacherNameField.setBounds(920,70,150,30);
        frame.add(TeacherNameLabel);
        frame.add(TeacherNameField);
        TeacherNameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        TeacherNameLabel.setForeground(Darkblue);
        TeacherNameField.setBackground(Blueish);
        
        //Address
        AddressLabel = new JLabel("Address:");
        AddressLabel.setBounds(370,105,120,30);
        AddressField = new JTextField();
        AddressField.setBounds(520,105,150,30);
        frame.add(AddressLabel);
        frame.add(AddressField);
        AddressLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        AddressLabel.setForeground(Darkblue);
        AddressField.setBackground(Blueish);
        
        //Working Type
        WorkingTypeLabel = new JLabel("Working Type:");
        WorkingTypeLabel.setBounds(770,105,120,30);
        String[] workingtype = {"Full-time", "Part-time"};
        WorkingTypeComboBox = new JComboBox<>(workingtype);
        WorkingTypeComboBox.setBounds(920,105,150,30);
        frame.add(WorkingTypeLabel);
        frame.add(WorkingTypeComboBox);
        WorkingTypeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        WorkingTypeLabel.setForeground(Darkblue);
        WorkingTypeComboBox.setBackground(Purplish);
        WorkingTypeComboBox.setFont(new Font("Segoe UI", Font.BOLD, 13));
        WorkingTypeComboBox.setForeground(Pinkish);
        
        //Employment Status
        EmploymentStatusLabel = new JLabel("Employment Status:");
        EmploymentStatusLabel.setBounds(370,140,120,30);
        String[] employmentstatus = {"Active", "Passive"};
        EmploymentStatusComboBox = new JComboBox<>(employmentstatus);
        EmploymentStatusComboBox.setBounds(520,140,150,30);
        frame.add(EmploymentStatusLabel);
        frame.add(EmploymentStatusComboBox);
        EmploymentStatusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        EmploymentStatusLabel.setForeground(Darkblue);
        EmploymentStatusComboBox.setBackground(Purplish);
        EmploymentStatusComboBox.setFont(new Font("Segoe UI", Font.BOLD, 13));
        EmploymentStatusComboBox.setForeground(Pinkish);
        
        //Working Hours
        WorkingHoursLabel = new JLabel("Working Hours:");
        WorkingHoursLabel.setBounds(770,140,120,30);
        WorkingHoursField = new JTextField();
        WorkingHoursField.setBounds(920,140,150,30);
        frame.add(WorkingHoursLabel);
        frame.add(WorkingHoursField);
        WorkingHoursLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        WorkingHoursLabel.setForeground(Darkblue);
        WorkingHoursField.setBackground(Blueish);
    
        
        //Lecturer Heading
        LecturerHeadingLabel = new JLabel("Lecturer:");
        LecturerHeadingLabel.setBounds(370,210,120,30);
        frame.add(LecturerHeadingLabel);
        LecturerHeadingLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        LecturerHeadingLabel.setForeground(Darkblue);
        
        //Department
        DepartmentLabel = new JLabel("Department:");
        DepartmentLabel.setBounds(370,245,120,30);
        DepartmentField = new JTextField();
        DepartmentField.setBounds(520,245,150,30);
        frame.add(DepartmentLabel);
        frame.add(DepartmentField);
        DepartmentLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        DepartmentLabel.setForeground(Darkblue);
        DepartmentField.setBackground(Blueish);
        
        //Years of Experience
        YearsOfExperienceLabel = new JLabel("Year of Experience:");
        YearsOfExperienceLabel.setBounds(770,245,120,30);
        YearsOfExperienceField = new JTextField();
        YearsOfExperienceField.setBounds(920,245,150,30);
        frame.add(YearsOfExperienceLabel);
        frame.add(YearsOfExperienceField);
        YearsOfExperienceLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        YearsOfExperienceLabel.setForeground(Darkblue);
        YearsOfExperienceField.setBackground(Blueish);
        
        //Graded Score
        GradedScoreLabel = new JLabel("Graded Score:");
        GradedScoreLabel.setBounds(370,280,120,30);
        GradedScoreField = new JTextField();
        GradedScoreField.setBounds(520,280,150,30);
        frame.add(GradedScoreLabel);
        frame.add(GradedScoreField);
        GradedScoreLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        GradedScoreLabel.setForeground(Darkblue);
        GradedScoreField.setBackground(Blueish);
        
        //Grade Assignment Button
        GradeAssignmentButton = new JButton("Grade Assignment");
        GradeAssignmentButton.setBounds(920,280,150,30);
        frame.add(GradeAssignmentButton);
        GradeAssignmentButton.setBackground(Purplish);
        GradeAssignmentButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        GradeAssignmentButton.setForeground(Pinkish);
        
        //making the button functional
        GradeAssignmentButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    // Check if any of the fields are empty
                    if (TeacherIdField.getText().isEmpty() || GradedScoreField.getText().isEmpty() || DepartmentField.getText().isEmpty() || YearsOfExperienceField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; 
                }

                // Taking input values of created fields in GUI
                int teacherId = Integer.parseInt(TeacherIdField.getText());
                int gradedScore = Integer.parseInt(GradedScoreField.getText());
                String department = DepartmentField.getText();
                int yearsOfExperience = Integer.parseInt(YearsOfExperienceField.getText());

                // Storing the entered data in a String variable to display it
                String enteredData = "Teacher Id: " + teacherId + "\n" + "Graded Score: " + gradedScore + "\n" + "Department: " + department + "\n" + "Years of Experience: " + yearsOfExperience;

                // Checking if there is a lecturer object with the entered teacherId value
                Lecturer lecturer = null;
                for (Teacher teacher : teachersList) 
                {
                    if (teacher instanceof Lecturer && teacher.getteacherId() == teacherId) 
                    {
                        lecturer = (Lecturer) teacher;
                        break;
                    }   
                }

                // Calling the grade assignment method if the lecturer with the given teacherId is found, else showing an appropriate message
                if (lecturer != null) 
                {
                    lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);

                    // Displaying the stored value of entered data along with a suitable message
                    JOptionPane.showMessageDialog(frame, enteredData, "Graded the assignment successfully", JOptionPane.INFORMATION_MESSAGE);
                } 
                else 
                {
                    // Displaying an error message if the given teacherId is not found
                    JOptionPane.showMessageDialog(frame, "Given TeacherId not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch (NumberFormatException ex) 
            {
                // Using catch block to handle cases of invalid integer values
                JOptionPane.showMessageDialog(frame, "Please enter proper values for Teacher Id, Graded Score, and Years of Experience.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

        
        //Add a Lecturer Button
        AddLecturerButton = new JButton("Add a Lecturer");
        AddLecturerButton.setBounds(920,305,150,30);
        frame.add(AddLecturerButton);
        AddLecturerButton.setBackground(Purplish);
        AddLecturerButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        AddLecturerButton.setForeground(Pinkish);
        
        //making the button functional
        AddLecturerButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    //checking if any of the input fields in the GUI are empty
                    if (TeacherIdField.getText()=="" || TeacherNameField.getText()=="" || AddressField.getText()=="" ||
                    DepartmentField.getText()=="" || YearsOfExperienceField.getText()=="" || GradedScoreField.getText()=="") 
                    {
                        JOptionPane.showMessageDialog(frame, "Empty Fields Found!", "Error!", JOptionPane.ERROR_MESSAGE);
                        return; 
                    }

                    // Taking input values of created fields in GUI
                    int teacherId = Integer.parseInt(TeacherIdField.getText());
                    String teacherName = TeacherNameField.getText();
                    String address = AddressField.getText();
                    String workingType = (String) WorkingTypeComboBox.getSelectedItem();
                    String employmentStatus = (String) EmploymentStatusComboBox.getSelectedItem();
                    String department = DepartmentField.getText();
                    int yearsOfExperience = Integer.parseInt(YearsOfExperienceField.getText());
                    int gradedScore = Integer.parseInt(GradedScoreField.getText());

                    // Creating Lecturer object with the input values
                    Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, department, yearsOfExperience);
                    lecturer.setgradedScore(gradedScore);

                    // Adding the lecturer object into the ArrayList
                    teachersList.add(lecturer);

                    // Displaying a message in GUI
                    JOptionPane.showMessageDialog(frame, "Lecturer successfully added to the ArrayList", "Success", JOptionPane.INFORMATION_MESSAGE);
                } 
                catch (NumberFormatException ex) 
                {
                    // Using catch block to handle cases of invalid integer values
                    JOptionPane.showMessageDialog(frame, "Please enter proper values for Teacher ID, Years of Experience and Graded Score!", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        //Tutor Heading
        TutorHeadingLabel = new JLabel("Tutor:");
        TutorHeadingLabel.setBounds(370,375,120,30);
        frame.add(TutorHeadingLabel);
        TutorHeadingLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        TutorHeadingLabel.setForeground(Darkblue);
        
        //Salary
        SalaryLabel = new JLabel("Salary:");
        SalaryLabel.setBounds(370,410,120,30);
        SalaryField = new JTextField();
        SalaryField.setBounds(520,410,150,30);
        frame.add(SalaryLabel);
        frame.add(SalaryField);
        SalaryLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        SalaryLabel.setForeground(Darkblue);
        SalaryField.setBackground(Blueish);
        
        //Specialization
        SpecializationLabel = new JLabel("Specialization:");
        SpecializationLabel.setBounds(770,410,120,30);
        SpecializationField = new JTextField();
        SpecializationField.setBounds(920,410,150,30);
        frame.add(SpecializationLabel);
        frame.add(SpecializationField);
        SpecializationLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        SpecializationLabel.setForeground(Darkblue);
        SpecializationField.setBackground(Blueish);
        
        //Academic Qualifications
        AcademicQualificationsLabel = new JLabel("Academic Qualifications:");
        AcademicQualificationsLabel.setBounds(370,445,150,30);
        AcademicQualificationsField = new JTextField();
        AcademicQualificationsField.setBounds(520,445,150,30);
        frame.add(AcademicQualificationsLabel);
        frame.add(AcademicQualificationsField);
        AcademicQualificationsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        AcademicQualificationsLabel.setForeground(Darkblue);
        AcademicQualificationsField.setBackground(Blueish);
        
        //Performance Index
        PerformanceIndexLabel = new JLabel("Performance Index:");
        PerformanceIndexLabel.setBounds(770,445,130,30);
        PerformanceIndexField = new JTextField();
        PerformanceIndexField.setBounds(920,445,150,30);
        frame.add(PerformanceIndexLabel);
        frame.add(PerformanceIndexField);
        PerformanceIndexLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        PerformanceIndexLabel.setForeground(Darkblue);
        PerformanceIndexField.setBackground(Blueish);
        
        //New Salary
        NewSalaryLabel = new JLabel("New Salary:");
        NewSalaryLabel.setBounds(370,490,120,30);
        NewSalaryField = new JTextField();
        NewSalaryField.setBounds(520,490,150,30);
        frame.add(NewSalaryLabel);
        frame.add(NewSalaryField);
        NewSalaryLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        NewSalaryLabel.setForeground(Darkblue);
        NewSalaryField.setBackground(Blueish);
        
        //New Performance Index
        NewPerformanceIndexLabel = new JLabel("New Performance Index:");
        NewPerformanceIndexLabel.setBounds(370,530,150,30);
        NewPerformanceIndexField = new JTextField();
        NewPerformanceIndexField.setBounds(520,530,150,30);
        frame.add(NewPerformanceIndexLabel);
        frame.add(NewPerformanceIndexField);
        NewPerformanceIndexLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        NewPerformanceIndexLabel.setForeground(Darkblue);
        NewPerformanceIndexField.setBackground(Blueish);
        
        
        //Add Tutor Button
        AddTutorButton = new JButton("Add a Tutor");
        AddTutorButton.setBounds(920,480,150,30);
        frame.add(AddTutorButton);
        AddTutorButton.setBackground(Purplish);
        AddTutorButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        AddTutorButton.setForeground(Pinkish);
        
        //making the button functional
        AddTutorButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    //checking if any of the input fields in the are empty
                    if (TeacherIdField.getText()=="" || TeacherNameField.getText()=="" || AddressField.getText()=="" ||
                    SpecializationField.getText()=="" || AcademicQualificationsField.getText()=="" || PerformanceIndexField.getText()=="" ||
                    WorkingHoursField.getText()=="" || SalaryField.getText()=="") 
                    {
                        JOptionPane.showMessageDialog(frame, "Empty Fields Found!", "Error!", JOptionPane.ERROR_MESSAGE);
                        return; 
                    }

                    //Taking input values of created fields in GUI
                    int teacherId = Integer.parseInt(TeacherIdField.getText());
                    String teacherName = TeacherNameField.getText();
                    String address = AddressField.getText();
                    String workingType = (String) WorkingTypeComboBox.getSelectedItem();
                    String employmentStatus = (String) EmploymentStatusComboBox.getSelectedItem();
                    int workingHours = Integer.parseInt(WorkingHoursField.getText());
                    double salary = Double.parseDouble(SalaryField.getText());
                    String specialization = SpecializationField.getText();
                    String academicQualifications = AcademicQualificationsField.getText();
                    int performanceIndex = Integer.parseInt(PerformanceIndexField.getText());

                    // Creating Tutor object with the input values
                    Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);

                    // Adding the Tutor object into the ArrayList
                    teachersList.add(tutor);

                    // Displaying a message in GUI
                    JOptionPane.showMessageDialog(frame, "Tutor successfully added to the ArrayList.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }   
                    catch (NumberFormatException eq) 
                    {
                        // Using catch block to handle cases of invalid integer values
                        JOptionPane.showMessageDialog(frame, "Please enter proper values for Teacher ID, Performance Index and Salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
            }
        });
            
        // Remove Tutor Button
        RemoveTutorButton = new JButton("Remove Tutor");
        RemoveTutorButton.setBounds(920, 505, 150, 30);
        frame.add(RemoveTutorButton);
        RemoveTutorButton.setBackground(Purplish);
        RemoveTutorButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        RemoveTutorButton.setForeground(Pinkish);

        // making the button functional
        RemoveTutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                // checking if any of the input fields in the GUI are empty
                if (TeacherIdField.getText()=="" || WorkingHoursField.getText()=="" || NewPerformanceIndexField.getText()=="") 
                {
                    JOptionPane.showMessageDialog(frame, "Empty Fields Found!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return; 
                }

                try 
                {
                    // taking input values of created fields in GUI
                    int teacherId = Integer.parseInt(TeacherIdField.getText());
                    int workingHours = Integer.parseInt(WorkingHoursField.getText());
                    int newPerformanceIndex = Integer.parseInt(NewPerformanceIndexField.getText());

                    // checking if there is a tutor object with the entered teacherId value
                    Tutor tutor = null;
                    for (Teacher teacher : teachersList) 
                    {
                        if (teacher instanceof Tutor && teacher.getteacherId() == teacherId) 
                        {
                            tutor = (Tutor) teacher;
                            break;
                        }
                    }

                    //calling the set salary method if the tutor with given teacherId is found, else showing appropriate message
                    if (tutor != null) 
                    {
                        tutor.checkCertification(newPerformanceIndex, workingHours);
                        if (!tutor.isCertified()) 
                        {
                            tutor.removeTutor();
                            JOptionPane.showMessageDialog(frame, "Tutor removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(frame, "Tutor is certified and cannot be removed.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                    else 
                    {
                        // displaying an error message if the given teacherId is not found
                        JOptionPane.showMessageDialog(frame, "Given TeacherId not found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                catch (NumberFormatException ex) 
                {
                    // Using catch block to handle cases of invalid integer values
                    JOptionPane.showMessageDialog(frame, "Please enter proper values for teacher Id, working hours and performance index.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Set Salary Button
        SetSalaryButton = new JButton("Set Salary");
        SetSalaryButton.setBounds(920,530,150,30);
        frame.add(SetSalaryButton);
        SetSalaryButton.setBackground(Purplish);
        SetSalaryButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        SetSalaryButton.setForeground(Pinkish);
        
        //making the button functional
        SetSalaryButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    // Checking if any of the input fields in the GUI are empty
                    if (TeacherIdField.getText()=="" || NewSalaryField.getText()=="" || NewPerformanceIndexField.getText()=="") 
                    {
                        JOptionPane.showMessageDialog(frame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; 
                    }

                    // Taking input values of created fields in GUI
                    int teacherId = Integer.parseInt(TeacherIdField.getText());
                    double newSalary = Double.parseDouble(NewSalaryField.getText());
                    int newPerformanceIndex = Integer.parseInt(NewPerformanceIndexField.getText());

                    // Checking if there is a tutor object with the entered teacherId value
                    Tutor tutor = null;
                    for (Teacher teacher : teachersList) 
                    {
                        if (teacher instanceof Tutor && teacher.getteacherId() == teacherId) 
                        {
                            tutor = (Tutor) teacher;
                            break;
                        }
                    }       

                    // Calling the set salary method if the tutor with the given teacherId is found, else showing an appropriate message
                    if (tutor != null) 
                    {
                        tutor.setsalary(newSalary, newPerformanceIndex);
                        // Retrieving the updated salary using the getter method
                        double updatedSalary = tutor.getnewsalary();

                        // Storing the value of updatedSalary in a String to display it in the message dialog
                        String updatedSalaryMessage = "Updated Salary: " + updatedSalary;

                        // Displaying a suitable message along with updatedSalary
                        JOptionPane.showMessageDialog(frame, "Set Salary of Tutor successfully \n" + updatedSalaryMessage, "Success", JOptionPane.INFORMATION_MESSAGE);
                    } 
                    else 
                    {
                        // Displaying an error message if the given teacherId is not found
                        JOptionPane.showMessageDialog(frame, "Given TeacherId not found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                    catch (NumberFormatException ex) 
                    {
                          // Using catch block to handle cases of invalid integer values
                        JOptionPane.showMessageDialog(frame, "Please enter proper values for Teacher Id, New Salary, and New Performance Index.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
            }
        });

        
        //Display Button
        DisplayButton = new JButton("Display");
        DisplayButton.setBounds(370,600,150,30);
        frame.add(DisplayButton);
        DisplayButton.setBackground(Purplish);
        DisplayButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        DisplayButton.setForeground(Pinkish);
        
        //making the display button functional
        DisplayButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try{
                //displaying suitable information about the lecturer and tutors
                    for (Teacher teacher : teachersList) //iterating through arraylist using for each loop
                    {
                        if (teacher instanceof Lecturer) //checking if there is Lecturer object, if found displaying it appropriately
                        {
                            String displayLecturer = "Teacher Name: "+teacher.getteacherName()+"\n"+"Address: "+teacher.getaddress()+"\n"+"Department: "+"\n"+((Lecturer) teacher).getdepartment()+"\n"+"Years of Experience: "+((Lecturer) teacher).getyearsOfExperience()+"\n"+"Graded Score: "+((Lecturer) teacher).getgradedScore();
                            JOptionPane.showMessageDialog(null, displayLecturer, "Lecturer:", JOptionPane.INFORMATION_MESSAGE);
                        }
                else if (teacher instanceof Tutor) 
                {
                    String displayTutor = "Teacher Name: "+teacher.getteacherName()+"\n"+"Address: "+teacher.getaddress()+"\n"+"Specialization: "+((Tutor) teacher).getspecialization()+"\n"+"Academic Qualifications: "+((Tutor) teacher).getacademicQualifications()+"\n"+"Performance Index: "+((Tutor) teacher).getPerformanceIndex()+"\n"+"Salary: "+((Tutor) teacher).getsalary();
                    JOptionPane.showMessageDialog(null, displayTutor, "Tutor:", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e1) 
        {
        JOptionPane.showMessageDialog(frame, "An unexpected error occurred: ","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }); 
        //Clear Button
        ClearButton = new JButton("Clear");
        ClearButton.setBounds(920,600,150,30);
        frame.add(ClearButton);
        ClearButton.setBackground(Purplish);
        ClearButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        ClearButton.setForeground(Pinkish);
        
        //making the clear button functional
        ClearButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    JOptionPane.showMessageDialog(ClearButton, "Clear all fields?", "Clear", JOptionPane.WARNING_MESSAGE);
                    //Setting Text Fields to empty
                    TeacherIdField.setText("");
                    TeacherNameField.setText("");
                    AddressField.setText("");
                    WorkingHoursField.setText("");
                    DepartmentField.setText("");
                    YearsOfExperienceField.setText("");
                    GradedScoreField.setText("");
                    SalaryField.setText("");
                    SpecializationField.setText("");
                    AcademicQualificationsField.setText("");
                    PerformanceIndexField.setText("");
                    NewSalaryField.setText("");
                    NewPerformanceIndexField.setText("");
                } catch (Exception er)
                {
                    JOptionPane.showMessageDialog(frame, "An unexpected error occurred: ","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        frame.setVisible(true);
}
//creating a main method
    public static void main(String[]args) {
        new TeacherGUI();
        }
}
