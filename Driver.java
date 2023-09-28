public class Driver{
 public static void main(String[]args){
   System.out.println("Expected 0, my function: "+StringMethods.myCompareTo("Hello","Hello")); 
   System.out.println("Expected a negative number, my function: "+StringMethods.myCompareTo("A","B")); 
   System.out.println("Expected -1, my function: "+Stringmethods.myIndexOf("Hello","he"));  
   System.out.println("Expected 1, my function: "+Stringmethods.myIndexOf("Hello","el")); 
   
 }
}
