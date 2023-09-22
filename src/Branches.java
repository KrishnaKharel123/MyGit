public class Branches
{
static String stephan,walter,Edwin;




public static void main(String[] args)
{

    stringcomparison();

}


public static void stringcomparison(){

    stephan="Stephen Edwin King";
    walter="Walter Winchell";
    Edwin="stephen edwin king";

    boolean comparison1 = stephan.equalsIgnoreCase(walter);
    boolean comparison2 = stephan.equalsIgnoreCase(Edwin);
    System.out.println("\"" + stephan + "\"" + " equals " + "\"" + walter + "\"" + "?" + " " + comparison1);
    System.out.println("\"" + stephan + "\"" + " equals " + "\"" + Edwin + "\"" + "?" + " " + comparison2);







}







}
