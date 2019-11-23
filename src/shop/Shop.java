package shop;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
while   (true){
    System.out.println("entr 1 for insert 2 to see:");
        String chose = sc.next();
             
        switch (chose) {
            case "1": {
                inputing(chose);
                break;
            }
            case "2":{
                see pr= new see();
                pr.printing();
                break;}

            default:
                break;
        }
see l=new see();


}
    }

    public static void inputing(String cho) {
Scanner x=new Scanner(System.in);
        System.out.println("enter name");
String name =x.next();
 System.out.println("enter price:");
 
double price =x.nextDouble();
 System.out.println("enter comment:");
String com =x.next();
 System.out.println("enter comdition:");
String condition=x.next();
        insert obj = new insert();
        obj.setName(name);
        
        obj.setprice(price);
       
           obj.setcondition(condition);
         
        obj.setcom(com);
     
    iteme p = new see();
        if(cho.equals("1")){System.out.println("done");}
        else{
        p.printing();}

    }

    

    

}
