import java.io.*;
import java.util.*;
class Airline 
{
 
  public static void main(String args[])
  {

        int k=150;
        int v=150;
        int r=300;
        int g=300;
        int x=500;
        int ch,c;
        double jio=2500.00;
        double h;
               String cq;
         ArrayList<String> abj=new ArrayList<String>();
         ArrayList<String> bbj=new ArrayList<String>();
         ArrayList<String> cbj=new ArrayList<String>();
         ArrayList<String> dbj=new ArrayList<String>();
         ArrayList<String> ebj=new ArrayList<String>();
        int ArrayList []=new int [10];
        Scanner ino=new Scanner(System.in);
        System.out.println("**********************************************************************");
        System.out.println("*                                                                    *");
        System.out.println("*                        WELCOME TO GOWTHAM AIRWAYS                  *");
        System.out.println("*                                                                    *");
        System.out.println("**********************************************************************");
       
        do
        {
 System.out.println("\n\n\n\n                         1.AVAILABILITY\n                         2.FARE DETAILS\n                         3.BOOK\n                         4.DISPLAY\n                         5.CANCEL\n                         6.EXIT");
            System.out.println("Enter your option");
            ch=ino.nextInt();
            switch(ch)
            {
               case 1:
                      
                       Scanner i=new Scanner(System.in);
                       System.out.println("                          ____********________");
                       System.out.println("                         1.Chennai To Coimbatore\n                         2.Chennai To Madurai\n                         3.Chennai To Delhi\n                         4.Chennai To Mumbai\n                         5.Chennai To Malaysia");
                       System.out.println("Enter your Choice");              
                        c=i.nextInt();
                       switch(c)
                       {
                         case 1:
                               System.out.println("Seats available :\n"+k);
                               
                               break;
                         case 2:
                               System.out.println("Seats available :\n"+v);
                               
                               break;
                         case 3:
                               System.out.println("Seats available :\n"+r);                              
                               break;
                         case 4:
                               System.out.println("Seats available :\n"+g);
                               
                               break;
                         case 5:
                               System.out.println("Seats available :\n"+x);
                               
                               break;
                       }
                       break;

               case 2:
                      
                     
                       Scanner p=new Scanner(System.in);
                       System.out.println("                          ____********________");
                       System.out.println("                         1.Chennai To Coimbatore\n                         2.Chennai To Madurai\n                         3.Chennai To Delhi\n                         4.Chennai To Mumbai\n                         5.Chennai To Malaysia");
                       System.out.println("Enter your Choice");            
                       c=p.nextInt();
                       switch(c)
                       {
                         case 1:
                                 h= (jio * 1.2087);
                               System.out.println("Rs:"+h);
                               break;
                         case 2:
                                 h= (jio*0.97171);
                               System.out.println("Rs:"+h);
                               break;

                         case 3:
                                 h= jio*3.8;
                               System.out.println("Rs:"+h);
                               break;

                         case 4:
                                 h= jio*2.4;
                               System.out.println("Rs:"+h);
                               break;

                         case 5:
                                 h= 7.0*jio;
                               System.out.println("Rs:"+h);
                               break;
                       }
                       break;

               case 3:
                      
                       long mobile;
                       String name,gen;
                       int age;                        
                       Scanner q=new Scanner(System.in);
                       System.out.println("Welcome to Gowtham Airways");
                       System.out.println("Enter your Name ");
                       name=q.next();
                       System.out.println("Enter your Age");
                       age=q.nextInt();
                       System.out.println("Enter your Gender");
                       gen=q.next();
                       System.out.println("Enter your  Mobile Number");            
                       mobile=q.nextLong();
                       System.out.println("                          ____********________");
                       System.out.println("                         1.Chennai To Coimbatore\n                         2.Chennai To Madurai\n                         3.Chennai To Delhi\n                         4.Chennai To Mumbai\n                         5.Chennai To Malaysia");
                       System.out.println("Enter your Choice");            
                       c=q.nextInt();
                       
                     
                       switch(c)
                       {
                         case 1:
                               System.out.println("*********************************************************************");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Welcome to Gowtham Airways                        ");
                               System.out.println("*                 Total seat available:"+k+"                        ");
                               System.out.println("*                 NAME:"+name+"                                     ");
                               System.out.println("*                 AGE:"+age+"                                       ");
                               System.out.println("*                 GENDER:"+gen+"                                    ");
                               System.out.println("*                 CONTACT NUMBER:"+mobile+"                         ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                                 h= jio*1.2807;
                               System.out.println("*                 Successfully booked ticket from Chennai to Coimbatore");
                               System.out.println("*                  Seat Number:"+(151-k)+"                            ");
                               System.out.println("*                 Flight Schedule: 15-AUGUST-2019  0030hours      ");
                               System.out.println("*                Boarding Point: MEENAMBAKKAM INTERNATIONAL AIRPORT");
                               System.out.println("*                 Destination Point: COIMBATORE DOMESTIC AIRPORT   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Total Fare :Rs"+h+"                               ");
                               System.out.println("*                                                                   ");
                               System.out.println("********************************************************************");

                               k=k-1;
                               System.out.println("Remaining Seats available are:"+k);
                                abj.add(name);                     
                                 
                             
                               break;
                         case 2:

                               System.out.println("*********************************************************************");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Welcome to Gowtham Airways                        ");
                               System.out.println("*                 Total seat available:"+v+"                         ");
                               System.out.println("*                 NAME:"+name+"                                      ");
                               System.out.println("*                 AGE:"+age+"                                        ");
                               System.out.println("*                 GENDER:"+gen+"                                     ");
                               System.out.println("*                 CONTACT NUMBER:"+mobile+"                          ");
                                 h= jio*0.97171;
 
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Successfully booked ticket from Chennai to Madurai ");
                               System.out.println("*                  Seat Number:"+(151-v)+"                            ");
                               System.out.println("*                 Flight Schedule: 04-AUGUST-2019  1945hours      ");
                               System.out.println("*                Boarding Point: MEENAMBAKKAM INTERNATIONAL AIRPORT");
                               System.out.println("*                 Destination Point: MADURAI DOMESTIC AIRPORT   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                              System.out.println("*                 Total Fare :Rs"+h+"                                ");
                               System.out.println("*                                                                   ");
                               System.out.println("*********************************************************************");
                               v=v-1;
                               System.out.println("Remaining Seats available are:"+v);
                                bbj.add(name);                     
                                 
                                                        
                               break;

                         case 3:

                               System.out.println("*********************************************************************");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Welcome to Gowtham Airways                        ");
                               System.out.println("*                 Total seat available:"+r+"                         ");
                               System.out.println("*                 NAME:"+name+"                                      ");
                               System.out.println("*                 AGE:"+age+"                                        ");
                               System.out.println("*                 GENDER:"+gen+"                                     ");
                               System.out.println("*                 CONTACT NUMBER:"+mobile+"                          ");
                                 h= jio*3.8;

                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Successfully booked ticket from Chennai to Delhi   ");
                               System.out.println("*                   Seat Number:"+(301-r)+"                            ");
                               System.out.println("*                 Flight Schedule: 11-AUGUST-2019  0615hours      ");
                               System.out.println("*                Boarding Point: MEENAMBAKKAM INTERNATIONAL  AIRPORT");
                               System.out.println("*              Destination Point: INDIRA GANDHI INTERNATIONAL AIRPORT ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Total Fare :Rs"+h+"                                ");
                               System.out.println("*                                                                   ");
                               System.out.println("*********************************************************************");
                               r=r-1;
                               System.out.println("Remaining Seats available are:"+r);
                                cbj.add(name);                     
                              
                                 
                               break;

                         case 4:

                               System.out.println("*********************************************************************");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Welcome to Gowtham Airways                        ");
                               System.out.println("*                 Total seat available:"+g+"                         ");
                               System.out.println("*                 NAME:"+name+"                                      ");
                               System.out.println("*                 AGE:"+age+"                                        ");
                               System.out.println("*                 GENDER:"+gen+"                                     ");
                               System.out.println("*                 CONTACT NUMBER:"+mobile+"                          ");
                                 h= jio*2.4;

                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Successfully booked ticket from Chennai to Mumbai ");
                               System.out.println("*                  Seat Number:"+(301-g)+"                            ");
                               System.out.println("*                 Flight Schedule: 8-AUGUST-2019  1300hours      ");
                               System.out.println("*                Boarding Point: MEENAMBAKKAM INTERNATIONAL AIRPORT");
                               System.out.println("*               Destination Point: CHATRAPATHI SHIVAJI INTERNATIONAL AIRPORT");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Total Fare :Rs"+h+"                                ");
                               System.out.println("*                                                                   ");
                               System.out.println("*********************************************************************");
                               g=g-1;
                               System.out.println("Remaining Seats available are:"+g);
                                dbj.add(name);                     
                           
                      
                               break;

                         case 5:

                               System.out.println("*********************************************************************");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Welcome to Gowtham Airways                        ");
                               System.out.println("*                 Total seat available:"+x+"                         ");
                               System.out.println("*                 NAME:"+name+"                                      ");
                               System.out.println("*                 AGE:"+age+"                                        ");
                               System.out.println("*                 GENDER:"+gen+"                                     ");
                               System.out.println("*                 CONTACT NUMBER:"+mobile+"                          ");
                                 h= jio*7.0;

                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Successfully booked ticket from Chennai to Malaysia ");
                               System.out.println("*                  Seat Number:"+(501-x)+"                            ");
                                    
                               System.out.println("*                 Flight Schedule: 22-AUGUST-2019  1020hours      ");
                               System.out.println("*                Boarding Point: MEENAMBAKKAM INTERNATIONAL AIRPORT");
                               System.out.println("*                 Destination Point: MALAYSIA INTERNATIONAL AIRPORT");
                               System.out.println("*                                                                   ");
                               System.out.println("*                                                                   ");
                               System.out.println("*                 Total Fare :Rs"+h+"                                ");
                               System.out.println("*                                                                   ");
                               System.out.println("*********************************************************************");
                               x=x-1;
                               System.out.println(" Remaining Seats available are:"+x);
                                ebj.add(name);                     
                             
                      
                               break;

                       }
                       break;
             case 4:
                       Scanner oop=new Scanner(System.in);
                       System.out.println("                         ____***************____");
                       System.out.println("                         1.Covai Passengers\n                         2.Madurai Passengers\n                         3.Delhi  Passengers\n                         4.Mumbai  Passengers\n                         5.Malaysian Passengers");
                       System.out.println("Enter your Choice");            
                       c=oop.nextInt();
                       switch(c)
                       {
                         case 1:
                                    System.out.println("Passenger travelling from Chennai to Coimbatore are:\n"+abj);
                                     break;
                         case 2:
                                    System.out.println("Passenger travelling from Chennai to Madurai are:\n"+bbj);
                                     break;
                         case 3:
                                    System.out.println("Passenger travelling from Chennai to Delhi are:\n"+cbj);
                                     break;
                         case 4:
                                    System.out.println("Passenger travelling from Chennai to Mumbai are:\n"+dbj);
                                     break;
                         case 5:
                                    System.out.println("Passenger travelling from Chennai to Malaysia are:\n"+ebj);
                                     break;            
                         }
                         break;



        case 5:                                         
                       Scanner poo=new Scanner(System.in);
                       System.out.println("                          ____********________");
                       System.out.println("                         1.COIMABATORE PASSENGER\n                         2.MADURAI PASSENGER\n                         3.DELHI PASSENGER\n                         4.MUMBAI PASSENGER\n                         5.MALAYSIA PASSENGER");
                       System.out.println("Enter your Choice");            
                       c=poo.nextInt();
                       switch(c)
                       {
                         case 1:
                                     Scanner qw=new Scanner(System.in);
                                     System.out.println("Enter the name to be deleted");
                                     cq=qw.next();
                                   if(abj.remove(cq))
                                     {
                                      ++k;
                                     System.out.println("*********************************************");
                                     System.out.println("*                                           *");
                                     System.out.println("*          Successfully Canceled            *");
                                     System.out.println("*                                           *");
                                     System.out.println("**********************************************");
                                      System.out.println("Remaining seats available are:"+k);
                                      }
                                     else{
                                        System.out.println("The name doesnot exsist......So enter a valid name");
                                       }
                                       break;
                         case 2:
                                     Scanner qq=new Scanner(System.in);
                                     System.out.println("Enter the name to be deleted");
                                     cq=qq.next();
                                     if(bbj.remove(cq))
                                      {
                                     System.out.println("*********************************************");
                                     System.out.println("*                                           *");
                                     System.out.println("*          Successfully Canceled            *");
                                     System.out.println("*                                           *");
                                     System.out.println("**********************************************");
                                      ++v;
                                      System.out.println("Remaining seats available are:"+v);
                                      }
                                     else{
                                        System.out.println("The name doesnot exsist......So enter a valid name");
                                       }
                                      break;
                         case 3:
                                     Scanner qe=new Scanner(System.in);
                                     System.out.println("Enter the name to be deleted");
                                     cq=qe.next();
                                     if(cbj.remove(cq))
                                     {
                                     System.out.println("*********************************************");
                                     System.out.println("*                                           *");
                                     System.out.println("*          Successfully Canceled            *");
                                     System.out.println("*                                           *");
                                     System.out.println("**********************************************");
                                      ++r;
                                      System.out.println("Remaining seats available are:"+r);
                                      }
                                     else{
                                        System.out.println("The name doesnot exsist......So enter a valid name");
                                       }
                                      break;
                         case 4:
                                     Scanner qt=new Scanner(System.in);
                                     System.out.println("Enter the name to be deleted");
                                     cq=qt.next();
                                     if(dbj.remove(cq)){
                                     System.out.println("*********************************************");
                                     System.out.println("*                                           *");
                                     System.out.println("*          Successfully Canceled            *");
                                     System.out.println("*                                           *");
                                     System.out.println("**********************************************");
                                      ++g;
                                      System.out.println("Remaining seats available are:"+g);
                                      }
                                     else{
                                        System.out.println("The name doesnot exsist......So enter a valid name");
                                       }
                                      break;
                         case 5:
                                     Scanner qu=new Scanner(System.in);
                                     System.out.println("Enter the name to be deleted");
                                     cq=qu.next();
                                     if(ebj.remove(cq)){
                                     System.out.println("*********************************************");
                                     System.out.println("*                                           *");
                                     System.out.println("*          Successfully Canceled            *");
                                     System.out.println("*                                           *");
                                     System.out.println("**********************************************");
                                      ++x;
                                      System.out.println("Remaining seats available are:"+x);
                                      }
                                     else{
                                        System.out.println("The name doesnot exsist......So enter a valid name");
                                       }
                                      break;
                         }
                      break;


           case 6:
                    
                     break;
                    
            }        

        }while(ch!=6);         
     }
}
