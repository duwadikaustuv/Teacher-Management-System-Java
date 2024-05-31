Project Overview

The project is a Teacher Management System GUI application written in Java using Swing for the user interface. It allows for managing different types of teachers: Lecturers and Tutors. The system provides functionalities to add, remove, grade assignments, set salaries, display details, and clear fields.
Classes and Their Explanation

    TeacherGUI Class

        Purpose: This is the main GUI class that handles the user interface, events, and manages data.

        Functionality:
            Creates a JFrame and sets up a GUI layout using absolute positioning.
            Provides fields to input details for teachers (common and specific to Lecturers and Tutors).
            Handles buttons for adding Lecturers, Tutors, grading assignments, setting salaries, removing Tutors, and displaying/clearing fields.
            Uses JOptionPane for message dialogs to show success or error messages.
            Manages a list of teachers (teachersList) to store instances of Lecturer and Tutor.

        Key Components:
            JFrame and JPanel for the main window and layout.
            JLabels and JTextFields for input fields.
            JButtons for performing actions like adding, removing, grading, setting salaries, displaying, and clearing.
            JComboBoxes for selecting working type and employment status.

    Teacher Class
        Purpose: An abstract class to represent a general Teacher.
        Functionality:
            Contains common attributes such as teacherId, teacherName, address, workingType, and employmentStatus.
            Provides getters and setters for these attributes.
            Forces subclasses to implement the toString method.

    Lecturer Class (extends Teacher)
        Purpose: Represents a specific type of Teacher - Lecturer.
        Functionality:
            Inherits from Teacher and adds attributes specific to Lecturer like department, yearsOfExperience, and gradedScore.
            Implements gradeAssignment method to handle grading assignments.
            Overrides toString method to provide a formatted string representation.

    Tutor Class (extends Teacher)
        Purpose: Represents another type of Teacher - Tutor.
        Functionality:
            Inherits from Teacher and adds attributes specific to Tutor like workingHours, salary, specialization, academicQualifications, and performanceIndex.
            Implements checkCertification and removeTutor methods for managing tutor certification and removal.
            Overrides toString method to provide a formatted string representation.

    Summary
       This GUI application provides functionality to add Lecturer and Tutor objects to a list, grade assignments for Lecturers, set salaries for Tutors, remove Tutors from the list, 
       display all teachers, and clear input fields. It uses swing components and JOptionPane for input, output, and notifications. The teachersList stores objects of type Teacher, 
       Lecturer, and Tutor, utilizing inheritance and polymorphism to manage different types of teachers.
