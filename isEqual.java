/*
Question: 

Given two strings with backspace characters, return if they are equal when typed into empty text editors.
Note - Backspace character is represented by #

Eg: 
1) A = ab#c, B = ad#c 
Ans = true

2) A = b###t, B = dr#t
Ans = false

3) A = abcd##ef###g, B = abst###g
Ans = true
  
*/

  public Class Main{
  
  public static void main(String[] args){
    
    String s1;
    String s2;
    System.out.Println("Are the Strings equal? \n" + isEqual(s1,s2));
    
    
  }
  
  public static boolean isEqual(String a, String b){
   
    ArrayList<Character> A = new ArrayList<Character>();
    ArrayList<Character> B = new ArrayList<Character>();
    
    
    for(int i = 0; i < a.length; i++){
     	if(a.charAt(i) == '#' && (A != null))
        A.remove(i-1);
      else
        A.append(a.charAt(i));
    }
    
    for(int i = 0; i < b.length; i++){
     	if(b.charAt(i) == '#' && (B != null))
        B.remove(i-1);
      else
        B.append(B.charAt(i));
    }
    
    if(A.size() != B.size())
      return false;
    
    for(int i = 0; i < A.size(); i++){
     	if(A.get(i) != B.get(i)
         return false;
    }
    return true;
  }
  
}
