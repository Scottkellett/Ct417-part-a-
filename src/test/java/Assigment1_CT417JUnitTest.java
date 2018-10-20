/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CT417_Assignment1.Student;
import CT417_Assignment1.Module;
import CT417_Assignment1.Course;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import static org.joda.time.format.ISODateTimeFormat.date;

/**
 *
 * @author scotty k
 */
public class Assigment1_CT417JUnitTest {
    
    Student Test = new Student( "scott kellett",21, null, 0 ,null,null);
    Module Ct417 = new Module("software engineering","CT417",null, null);
    Course ECE= new Course("electrical + C Engineering",null, null,null,null);
    
    //-----JUint test for STUDENT on GetUsername method
    private String result_username;

    @Test
    public void TestGetUsername() {
        String expected_Username ="scott kellett21";
      
        
        result_username = Test.getUsername();
        
        assertEquals(expected_Username , result_username);
    }
    //----------JUnit Test for Module testing: do ArrayLists Work
    @Test
    public void moduleTest(){
        
       ArrayList<Student> student_array = new ArrayList<Student>();
       student_array.add(Test);
       ArrayList<Course> Course_array= new ArrayList<Course>();
       Course_array.add(ECE);
       
       Ct417.setStudents_Registered(student_array);
       Ct417.setcourses_Associated_With(Course_array);
       
       if(student_array.size()== Course_array.size()){
            assertEquals(Course_array.size(),1,0.001); 
       //this piece of code checks if both arraysList contain the one element I added.
       }
       
    }
     //----- test joda time for course test 
    @Test
    public void CourseTest(){
        
        //joda time object created from normal format
        DateTime Acca_start = new DateTime(2018, 8, 1, 0, 0, 0, 0);
        
        //then convert this datetime obj to a string 
        DateTimeFormatter Acca_start_format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        String Acca_start_String = Acca_start_format.print(Acca_start);
        
        
       
        
        //joda time object created from string format
        //AccastartTest = Accademic Start date test variable 
        DateTime AccaStartTest = new DateTime("2018-08-01T00:00:00.000+01:00");
        
        //then convert this datetime obj to a string 
        DateTimeFormatter AccastartTest_format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        String AccastartTest_String = AccastartTest_format.print(AccaStartTest);
        
        
         
         assertEquals(AccastartTest_String,Acca_start_String); 
        
        
        
    }
    
    
    
}
