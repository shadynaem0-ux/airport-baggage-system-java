
package project;

import java.util.Scanner;
public class Project {

    
    public static void main(String[] args)
    {
     int weight,overweight,numOfPeaple,sum=0;
     char category;
     Scanner input=new Scanner (System.in);
     System.out.println("category of F the Allawed weightis 30 kg");
     System.out.println("category of B the Allawed weightis 25 kg");
     System.out.println("category of E the Allawed weightis 20 kg");
     System.out.println("Enter the number of peaple");
     numOfPeaple = input.nextInt();
     
      for(int i=1;i<=numOfPeaple;i++){
       System.out.println("enter your category for passinger num" + i);
       category =input.next().charAt(0);
        System.out.println("enter your bag whigt");
       weight = input.nextInt();
       if(weight<0){System.out.println("the number must be positive");continue;
       }
        switch (category)
        {
            
            case'F' :
            case'f' :
                 if(weight>30){
                   System.out.println("  over whigt");
                   overweight =weight-30;
                   System.out.println("you will cost"+(overweight*10) + "$");
                   sum+=overweight*10;
                 } else 
                   System.out.println("pass");
                     break;
             case'b':
             case'B' :
               if(weight>25){
                   System.out.println("  over weight");
                   overweight =weight-25;
                   System.out.println("you will cost"+(overweight*10) +"$");
                   sum+=overweight*10;
               } else 
                    System.out.println(" pass");
                       break;
              case'e': 
              case'E' :
               if(weight>20){
                   System.out.println("over weight");
                   overweight = weight-20;
                   System.out.println("you will cost"+(overweight*10) +"$");
                   sum+=overweight*10;
               } else 
                    System.out.println("  pass"); 
                       break;
              default :
                  System.out.println("non valid");
                    i--;   
        } 
     
     }
               System.out.println("the sum of tax is "+sum+"$");
               
    }}
