/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

public class Fibonacci {
   static long fibo (int n){
       if (n<2){
           return n;
       }else{
           return fibo(n-1) + fibo (n-2);
           
       }
   }
 public static void main (String []args){
     for (int i = 0; i<13 ; i++)
         System.out.print ("("+ i +"):" + Fibonacci.fibo(i) + "\t");
 }
         
}
