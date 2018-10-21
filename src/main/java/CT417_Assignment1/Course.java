/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT417_Assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;


/**
 *
 * @author scotty k
 */
public class Course {
    
    
    
    private String Course_name;
    private ArrayList<Module> modules_in_course;
    private ArrayList<Student> students_in_course;
    
    DateTime Accademic_Start_date = new DateTime();
    DateTime Accademic_End_date = new DateTime();
    
    
    public Course( String course_name, ArrayList<Module> modules, ArrayList<Student> students, DateTime Asd, DateTime Aed){
        Course_name = course_name;
        modules_in_course = modules;
        students_in_course = students;
        Accademic_Start_date = Asd;
        Accademic_End_date = Aed;
    }

    public String getCourse_name() {
        return Course_name;
    }
    

    public void setAccademic_Start_date(DateTime Accademic_Start_date) {
        this.Accademic_Start_date = Accademic_Start_date;
    }

    public void setAccademic_End_date(DateTime Accademic_End_date) {
        this.Accademic_End_date = Accademic_End_date;
    }
    
    
    
}
