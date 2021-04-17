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
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class RemoveDuplicates
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter ten integers: ");
      ArrayList < Integer > list = new ArrayList < Integer > ();
    for (int k = 0; k < 10; k++)
      {
	int val = sc.nextInt ();
	  list.add (val);
      }
    removeDuplicate (list);
  }
  public static void removeDuplicate (ArrayList < Integer > list)
  {

    ArrayList < Integer > uniqueList = new ArrayList < Integer > ();

  for (Integer element:list)
      {


	if (!uniqueList.contains (element))
	  {

	    uniqueList.add (element);
	  }
      }
    int size = uniqueList.size ();
     System.out.print("The distinct integers are: ");
    for (int i = 0; i < size; i++)
      {
       System.out.print (uniqueList.get (i) + " " );
      }
  }
}
