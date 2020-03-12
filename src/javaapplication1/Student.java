/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;


import java.util.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author mcuser
 */
public class Student {
    public String lastname;
    public String firstname, course;
    public double test1, test2, summative, exam, finalMark, grade;
    
    public Student()
    {
        lastname="";
        firstname="";
        course="";
        test1=0;
        test2=0;
        summative=0;
        exam=0;
        finalMark=0;
        grade=0;
    }
    
    public Student(String lastname, String firstname,String course,double test1, double test2, double summative, double exam)
    {
        this.lastname = lastname;
        this.firstname=firstname;
        this.course = course;
        this.test1=test1;
        this.test2=test2;
        this.summative=summative;
        this.exam = exam;
    }
    
    public List<Student>getStudents(List<Student> s)
    {
        return s;
    }
    
    public void addDetails(Student s, List<Student> list)
    {        
        list =new ArrayList<Student>();
        list.add(s);
    }
    
    public double calculateFinalMark(List<Student>s, Student st)
    {
        double mark= 0;
    
        mark = ((st.test1 + st.test2 + st.summative)/3)*0.4+st.exam*0.6;
        
        
        return mark;
    }
}
