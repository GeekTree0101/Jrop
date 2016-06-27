/*
jrop test java file
*/

//test on jrop
package jrop_data;


import java.util.*;
import java.lang.*;



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

class debud{
    public debud(){
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