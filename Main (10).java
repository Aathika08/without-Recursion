/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Main{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i) 
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;
     
 }}}
