package Chapter9;

/*Info
 * Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 5
 * Date: November 21, 2017
 * Updated: November 25, 2017 - Rev 2.0
 * 
 * Program:  Chapter 9 - Page 676 Programming Challenge 5  - Course Grades
 * 
 */

import java.text.DecimalFormat;

// Class that will hold all grade objects for the course

public class CourseGrades
{
    // variables
	
	private 
	
	Essay classEssay;										// Essay Object
    FinalExam classFinal;									// Final Exam object
    GradedActivity classLab;								// Graded Activity Object
    PassFailExam classPfExam;								// Pass Fail Exam object
 
     
    // grades array
    
 GradedActivity[] grades = {classEssay, classFinal, classLab, classPfExam };

   // constructor
    
    public 
    
    // Updated November 25, 2017, changed the default constructor
    // to not need any extra arguments so that they don't need to 
    // be called in CourseGradesDemo  new CourseGrade object.
    
    CourseGrades()
    {
    	setEssay(classEssay);
    	setFinalExam(classFinal);
        setLab(classLab);
        setPassFailExam(classPfExam);
        
        
    }

  //setters
    
    void setEssay(Essay classEssay)
    {
        this.classEssay = classEssay;
    }
    
    void setFinalExam(FinalExam classFinal)
    {
        this.classFinal = classFinal;
    }
    
    void setLab(GradedActivity classLab)
    {
        this.classLab = classLab;
    }

    void setPassFailExam(PassFailExam classPfExam)
    {
        this.classPfExam = classPfExam;
    }

    

   //  toString Method
   public String toString()
    {
        DecimalFormat f = new DecimalFormat("0.0");
        return "CourseGrades:\n" +
        		"Lab Score: " + f.format(classLab.getScore()) +"   Grade: "+ classLab.getGrade() +
        		"\nPass/Fail Exam Score: " + f.format(classPfExam.getScore()) +"   Grade: "+ classPfExam.getGrade() +
                "\nEssay Score: " + f.format(classEssay.getScore()) +"   Grade: "+ classEssay.getGrade() +
                "\nFinal Exam Score: " + f.format(classFinal.getScore()) +"   Grade: "+  classFinal.getGrade();
    }
}