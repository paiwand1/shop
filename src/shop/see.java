package shop;

import java.util.Scanner;

public class see extends insert  implements iteme{

    public  void printing() {
        Scanner d=new Scanner (System.in);
        if ( com ==null) {
            System.out.println("you have to insert items first ");
            System.out.println(" do you want to insetr itemes yes/no");
        
            String c=d.next();
            if (c.equals("yes")) {
                 Shop sh=new Shop();
            sh.inputing("2");
            
            }
                if(c.equals("no")){
                System.out.println("thanks for you ");}
              
            
        }else{
            System.out.println(" this item is avelabli");
        System.out.println(getName());
        System.out.println(getprice());
        System.out.println(getName());
        System.out.println(getcondition());}

    }
}
