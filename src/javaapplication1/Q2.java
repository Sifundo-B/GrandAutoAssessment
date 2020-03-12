/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.io.IOException;
import java.util.*; 
/**
 *
 * @author mcuser
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
        // TODO code application logic here
         FilHandler fh = new FilHandler();
          Student s = new Student();          
          List<Student>list=new ArrayList<Student>();
          fh.WriteResults(s, list);
          for(Student d:fh.getStudents(s))
          {
              System.out.println(d.lastname);
          }
    }
    
}
