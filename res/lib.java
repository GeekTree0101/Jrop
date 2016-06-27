/*
JAVA lib

using Jrop
package name = jrop_data

*/
package jrop_data;

//******************************************************************
//
//                          import module
//       
//******************************************************************

import java.lang.*;
import java.util.*;



//******************************************************************
//
//                          class section
//       
//******************************************************************

class libtest{
    
	public libtest(){super();}
    
    //TODO:Script your code on output()
	public	void output(){
    //output() is be a main function
        
           scanner();
           format();
           split();


	}

//******************************************************************
//
//                          Lib section
//       
/*
    public void INSERTNAME(){
        try{
        System.out.println("INSERTNAME");
        
        //Index section
        
        //code section
     
      
 
        }
        catch(Exception e){
            
            //error output
            
            System.out.println("[Error log] \n" + e);
        }
    }

*/
//******************************************************************    
    
    
    public void scanner(){
        try{
        System.out.println("SCANNER");
        /*
        Scanner
        
        trim() remove front-end void 
        nextLine() read line data
        next() read input data
        
        */
        
        Scanner s = new Scanner(System.in);
        System.out.print("id :");
        String id = s.nextLine().trim();
        System.out.println(id);
        }
        catch(Exception e){
            System.out.println("[Error log] \n" + e);
        }
    }
    
    
    public void format(){
        try{
        System.out.println("FORMAT");
        /*
        format
        Integer.parseInt() string -> int
        Integer.toHexString() int -> string
        Float.parseFloat() string -> float
        
        String.format("%~~~",val);
        */
        int val = 50;
        float val2 = 1234.234f;
        
        System.out.format("%d, %o, 0x%02X, %3.3f \n", val,val,val,val2);
         }
        catch(Exception e){
            System.out.println("[Error log] \n" + e);
        }
    }
    
    public void split(){
        try{
        System.out.println("SPLIT");
        /*
        somting.split('some')
        */
        Scanner s = new Scanner(System.in);
        System.out.print("id :");
        String id = s.nextLine().trim();
        String arrey [] = id.split(" ");
        
        for(int i = 0; i < arrey.length; i++ ){
            System.out.println(arrey[i]);
        }
         }
        catch(Exception e){
            System.out.println("[Error log] \n" + e);
        }
        
    }
}
