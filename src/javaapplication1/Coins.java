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
public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArr = {0,0,1,0};
        System.out.println("\nFlip: " + result(myArr));
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
            count = (c1/c2)-2;
        }
        else if(c2>c1){
            count = (c2/c1)-2;
        }
        
        return count;
    }
}

    