/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CT417_Assignment1;

import org.joda.time.DateTime;

/**
 *
 * @author scotty k
 */
public class Student {
    
    private String Name;
    private int Age;
    private int iD;
    private String Username;
    private String Courses;
    private String[] modules_registered_for;
    
    DateTime Dob= new DateTime();
    
    
    public Student(String name, int age, DateTime DOB, int ID,String courses , String[] MRF){
        Name = name;
        Age = age;
        Dob = DOB;
        iD = ID;
        Courses = courses;
        modules_registered_for= MRF;
        
    }
    
    public String toString(int Age){
        
        return String.format("%d", Age);
    }
    
    
    public String getUsername(){
        
        Username = Name.concat(toString(Age));
        return Username;
    }
}
