/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author mcuser
 */
public class Q1_2 {
     public static void main(String[] args) 
    {         
        int[] myArr = {1,1,1,1,1,0};
        System.out.println("==Question 1.2==" +"\nFlip: " + result(myArr));
    }
     public static int result(int[] myArr)
    {
        int c1=0, c2=0;
        int count=0;
        for(int i=0;i<myArr.length;i++)
        {
            if(Integer.toString(myArr[i]).length()>1)
            {
                String val=Integer.toString(myArr[i]);
                for(int x=0;x<val.length();x++)
                {
                    if(val.charAt(x)=='1')
                    {                        
                       c2+=1;
                    }
                    else if(val.charAt(x)=='0')
                    {
                        c1+=1;
                    }
                }
            }
            
            if(myArr[i]==1)
            {
                c2+=1;
            }
            else if(myArr[i]==0)
            {
                c1+=1;
            }
        }
        
        if(c1>c2)
        {
            count = (c1/c2)-1;
        }
        else if(c2>c1){
            count = (c2/c1)-1;
        }
        
        return count;
    }
}
