public class BranchesThree
{
 static String dog,newstring;



 public static void main(String[] args)
 {

     lazydog();


 }

 public static void lazydog()
 {
     dog = "The quick brown fox jumps over the lazy dog";
     newstring = dog.substring(10, 26);
     System.out.println("Old = " +dog);
     System.out.println("New = " +newstring);
}







}
