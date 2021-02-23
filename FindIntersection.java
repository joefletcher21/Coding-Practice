/*

Find Intersection
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.
Examples
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13
Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10

*/

import java.util.*; 
import java.io.*;

class Main {

  //assuming there are no duplicates
  public static String FindIntersection(String[] strArr) {
    String[] array1 = strArr[0].split(", ");
    String[] array2 = strArr[1].split(", ");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    String duplicates = "";
    for(int i = 0; i < array1.length; i++){
      map.put(array1[i], 1);
    }
    for(int i = 0; i < array2.length; i++){
      if(map.containsKey(array2[i]))
        duplicates += array2[i] + ",";
    }

    if(duplicates == "")
      duplicates = "false";
    else
      duplicates = duplicates.substring(0,duplicates.length()-1);


    return duplicates;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
