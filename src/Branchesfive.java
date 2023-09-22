import java.sql.SQLOutput;

public class Branchesfive
{
    public static void main(String[] args)
    {

     Branchesfive practice = new Branchesfive();   ////object
     practice.modules();
     practice.increment();
     practice.decrement();




    }

    public void modules()            ////should be 0
    {
    float a= 1;
    float b= 2;



        System.out.println(a%b);

    }


    public void increment()        ////just to increase by 1
    {

    int a=100;

    System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

    }



   public void decrement()
   {

       int a =101;
       System.out.println(--a);

   }







}


