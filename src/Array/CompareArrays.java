/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Narendra Kumar Gunturu
 */
import java.util.Scanner;
public class CompareArrays
{
	public static void main(String[] args) {
	 
         Scanner in = null;
	        in = new Scanner(System.in);
           
  
            int array1[][] = new int[3][3];
            int array2[][] = new int[3][3];
  
            System.out.print("Enter list1: ");
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    array1[i][j] = in.nextInt();
            }}
            
            
            System.out.print("Enter list2: ");
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    array2[i][j] = in.nextInt();
            }}
            TestMatrixEquals(array1,array2);

	}
	
	static void TestMatrixEquals(int[][] a,int[][] b)
	{
	    int flag=1;
	    int r1 = a.length;  
        int c1 = a[0].length;  
        
        int r2 = b.length;  
        int c2 = b[0].length;  
 
        if(r1 != r2 || c1 != c2){  
            System.out.println("Arrays are not equal");  
        }  
        else {  
            for(int i = 0; i < r1; i++){  
                for(int j = 0; j < c1; j++){  
                  if(a[i][j] != b[i][j]){  
                      flag = 0;  
                      break;  
                  }  
                }  
            }  
              
            if(flag == 1)  
                System.out.println("The two arrays are strictly identical");  
            else  
                System.out.println("The two arrays are not strictly identical");  
        }  
    }  	
}
