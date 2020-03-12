/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Random;

/**
 *
 * @author mcuser
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArr= new int[8];
        int x;
        Random z = new Random();
        System.out.println("********BEFORE*********");
        System.out.println("************************");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int)(Math.random()*100);
            System.out.println(myArr[i]);
        }
        System.out.println("*********AFTER********");
        System.out.println("************************");
        
        for (int j = 0; j < myArr.length; j++) {
            sort(myArr,myArr.length);
            System.out.println(myArr[j]);
        }
    }
    private static void sort(int myArr[], int n){
        for (int i = 1; i < n; i++) {
            int j = i;
            int b = myArr[i];
            while((j>0)&&(myArr[j-1]>b)){
                myArr[j] = myArr[j-1];
                j--;
            }
            myArr[j]=b;
        }
    }
}
