public class Driver{
 public static void main(String[]args){
  String a;
  String b;
  String whole;
  String part;
  
  //Can you think of why the test cases use variables instead of literal strings?
  
  //Single test case myCompareTo:
  a="cat";
  b="dog";
  System.out.println("Expected "+ a.CompareTo(b) +" vs my function: "+StringMethods.myCompareTo(a,b)); 
   
  //Single test case myIndexOf:
  whole = "Hello";
  part = "He";
  System.out.println("Expected "+ whole.indexOf(part) +" vs my function: "+Stringmethods.myIndexOf(whole,part));  
   
   
 }
}
