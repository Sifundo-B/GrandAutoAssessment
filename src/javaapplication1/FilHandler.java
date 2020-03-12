/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
//import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcuser
 */
public class FilHandler {
     String fileName = "Students.txt";        
        String fileName1 = "Results.txt";
        
    public List<Student> getStudents(Student z) throws IOException 
    {
    System.out.println("Reading from file.");
    StringBuilder text = new StringBuilder();
    String NL = System.getProperty("line.separator");
    Scanner scanner = new Scanner(new File("Students.txt"));
    String[] studentsDetails = new String[7];
    Student s = new Student();
    List<Student>studentlist=new ArrayList<Student>();
    try {
         while (scanner.hasNextLine())
         {             
           String Val = scanner.nextLine();
           studentsDetails = Val.split(",");
           z.lastname=studentsDetails[0];
           z.firstname=studentsDetails[1];
           z.course=studentsDetails[2];
           z.test1=Double.parseDouble(studentsDetails[3]);
           z.test2=Double.parseDouble(studentsDetails[4]);
           z.summative=Double.parseDouble(studentsDetails[5]);
           z.exam=Double.parseDouble((studentsDetails[6])) ;
           
           s.addDetails(z,studentlist);
           
           System.out.println(z.firstname);
         }
    }
    finally{
      scanner.close();
    }
    System.out.println("Text read in: " + text);

    
    return studentlist;
  }
    
    public void WriteResults(Student std, List<Student>studentlist) throws IOException 
    {
        String fileName = "Result.txt";
        try{
            PrintWriter pr = new PrintWriter(fileName);
            for(Student d:getStudents(std))
            {
                pr.print(Double.toString(std.calculateFinalMark(studentlist,std)) );
            }
            pr.close();
            System.out.println("Done");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();;
        }
    }
}
