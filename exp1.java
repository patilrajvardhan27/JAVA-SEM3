package com.name.pan;  
public class exp1 {  	public static void main(String[] args) { 		
    //Initialize some x value 		
    int x = 25; 		
    //int x = -1; 		
    try { 			
        //Check whether the value is negative or not 			
        //If it is then throw exception 			
        if(x < 0) 				
        throw new NegativeException("Negative value exception"); 			
        try { 				
            //Check whether value is in the given range or not 				
            //If it is in the range of 0 to 25 then throw exception 				
            if(x >=0 && x<=25) 					
            throw new RangeValidException("Value is not in the range"); 			} 		
            //Catch exceptions 			
            catch(RangeValidException ex) { 				
                System.out.println(ex); 			
            } 		
        } 		
                catch(NegativeException ex) { 			
                    System.out.println(ex); 		
                } 		
                    finally { 			System.out.println("Final block executed"); 	
                	} 	
                }  
            }

