/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT417_Assignment1;

import java.util.ArrayList;

/**
 *
 * @author scotty k
 */
public class Module {
    private String module_name;
    private String module_ID;
    private ArrayList<Student> Students_Registered;
    private ArrayList<Course> Courses_Associated_With;
    
    public Module(String name, String ID, ArrayList<Student> students_registered, ArrayList<Course> Courses_associated_with){
        module_name = name;
        module_ID = ID;
        Students_Registered = students_registered;
        Courses_Associated_With = Courses_associated_with;     
    }

    public void setStudents_Registered(ArrayList<Student> Students_Registered) {
        this.Students_Registered = Students_Registered;
    }

    public void setcourses_Associated_With(ArrayList<Course> Courses_Associated_With) {
        this.Courses_Associated_With = Courses_Associated_With;
    }
}
