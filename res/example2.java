/*
jrop test java file
*/

//test on jrop
package jrop_data;


import java.util.*;
import java.lang.*;

class example1{
	public example1(){

		super();
	}
	public	void output(){
		byte abyte = 5;
        short ashort = -9025;
        int anint = 50000;
        long along =80293492394903L;
        float afloat = 5.0f;
        double adouble = 3.1423746387;
        char char1 = 'a', char2 = 'b', char3 ='c';
        
        boolean longFloatComparison = (along == afloat),
        byteIntComparision = (abyte <= anint),
        doubleShortComparison = (adouble != ashort),
        charComparison1 = (char1 == char3),
        charComparison2 = (char3 < char2);
        
        boolean expr = 15%4*7+15 >= 1 || 7<12 || !(-8!=7&&7<-10&&5>7);
        System.out.println("Copare long & float :" + longFloatComparison);
        System.out.println("Compare byte & int : " + byteIntComparision);
        System.out.println("Compare double & short:" + doubleShortComparison);
        System.out.println("Copare char1 & char3 :" + charComparison1);
        System.out.println("Compare char3  & char2 : " + charComparison2);
        System.out.println("value of long expression:" + expr +"\n\n");
        
	}
}

class example2{
	public example2(){

		super();
	}
	public void output(){
		
		String string1 = "aardvarks";
        int comp1, comp2, comp3, comp4;
        
        comp1 =string1.compareTo("boa constrictors");
        comp2 =string1.compareTo("aardvarks");
        comp3 = string1.compareTo("Aardvarks");
        comp4 = string1.compareTo("aardvarks are cooler");
        
        System.out.println(comp1 + "," + comp2 + "," + comp3 + "," + comp4 +"\n\n");
        

	}
}

class example3{
	public example3(){
		
		super();
	}
	public void output(){
        String string1 = "aardvarks";
        boolean comp1, comp2, comp3, comp4;
        
        comp1 =string1.compareTo("boa constrictors");
        comp2 =string1.compareTo("aardvarks");
        comp3 = string1.compareTo("Aardvarks");
        comp4 = string1.compareTo("aardvarks are cooler");
        
        System.out.println(comp1 + "," + comp2 + "," + comp3 + "," + comp4 +"\n\n");
        

		}
}


class example4{
	public example4(){
		
		super();
	}
	public void output(){
        
        final int RATE = 5000;
        int pay, hours;
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter time :");
        hours= input.nextInt();
        
        if(hours > 8)
            pay = RATE * 8 + (int)(1.5*RATE*(hours-8));
        else
            pay = RATE * hours;
         
        System.out.printf("Salary is %d. \n\n",pay);        
        
        
		}
}


class example5{
	public example5(){
		
		super();
	}
	public void output(){
        
        int income, tax;
        Scanner input  = new Scanner(System.in);
        
        System.out.print("Enter your income :");
        income= input.nextInt();
        
        if(income <= 1000){
            tax = (int)(0.09 *income);
        }
        else if(income <= 4000){
            tax = (int)(0.18 * income);
        }
        else if(income < 8000){
            tax = (int)(0.27 *income);
        }
        else{
            tax = (int)(0.36 * income);
        }
        System.out.printf("Total tax is %d. \n\n",tax);        
        
      
		}
}


class example6{
	public example6(){
		
		super();
	}
	public void output(){
            Scanner input= new Scanner(System.in);
            
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            
            if(number % 2 == 0 && number % 3 == 0){
                System.out.println(number + "is divisible by 2 and 3.\n\n");
            }
             if(number % 2 == 0 || number % 3 == 0){
                System.out.println(number + "is divisible by 2 or 3.\n\n");
            }
             if(number % 2 == 0 ^ number % 3 == 0){
                System.out.println(number + "is divisible by 2 or 3, but not both\n\n");
            }
            
		}
}


class example7{
	public example7(){
		
		super();
	}
	public void output(){
        String month = "february";
        int monthNumber = 0;
        switch(month){
            case "january":
            case "January":
                monthNumber = 1;
                break;
            case "february":
            case "February":
                monthNumber = 2;
                break;
            case "march":
            case "March":
                monthNumber =3 ;
                break;
        }
        System.out.println(monthNumber);          
              
    }	
    
}





class example8{
	public example8(){
		
		super();
	}
	public void output(){
        int month;
        int year = 2009;
        int days = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your a number:");
        month = scan.nextInt();
        
        switch(month){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if(((year%4 ==0)&&(year%100 !=0))||(year%400 ==0)){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;
           default:
            days = 0;
            
        }
          System.out.println("Number of days in month " + month +"is" + days+"\n\n");   
		}
}



class example9{
	public example9(){
		
		super();
	}
	public void output(){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter three points :");
                double x1 = input.nextDouble();
                double y1 = input.nextDouble();
                double x2 = input.nextDouble();
                double y2 = input.nextDouble();
                double x3 = input.nextDouble();
                double y3 = input.nextDouble();
                
                double A = Math.sqrt((x2-x3)*(x2-x3)+(y1-y3)*(y1-y3));
        double B = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double C = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    
        System.out.println("The three angles are" + Math.round(A*100)/100.0 + "," +
        Math.round(B*100)/100.0 +"," + Math.round(C*100)/100.0) ;       
		}
}



class example10{
	public example10(){
		
		super();
	}
	public void output(){
        int n;
        int i=1;
        Scanner scan  = new Scanner(System.in);
        System.out.print("Mul?");
        n = scan.nextInt();
        while ( i <= 9){
            System.out.println(n + "*" + i + "= " + n * i);
            i++;
        }
        System.out.println("\n\n\n");
		}
}


class example11{
	public example11(){
		
		super();
	}
	public void output(){
        int x,y,r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two inteers: ");
        x = scan.nextInt();
        y = scan.nextInt();
        if(x<y){
            r = x; x =y; y =r;
        }
        while(y != 0){
            r = x%y; x =y; y =r; 
        }
        System.out.println("The greatest commo divsor is " + x +"\n\n");
        
		}
}

class example12{
	public example12(){
		
		super();
	}
	public void output(){
        int answser = 7;
        int guess;
        int tries  = 0;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Your guess?");
            guess = scan.nextInt();
            tries++;
            if(guess > answser){
                System.out.println("Larger , try again");
                
            }
            else if(guess < answser){
               System.out.println("Smaller, try again");
                
            }
        }
            while(guess != answser);
            
            System.out.println("Matched in " + tries +"try(ies).");
        
        
		}
}


class exampledo{
    public exampledo(){
        super();
    }
    public void output(){
         int n = 10;
        while(n > 0){
           System.out.println(n);
            n = n - 3;
        }
        
        n = 10;
        do{
           System.out.println(n);
            n = n - 3;
        }while(n > 0);
    }
}