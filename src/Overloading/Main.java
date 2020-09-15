package Overloading;

public class Main {


    public static void main(String[] args) {
        //Ambiguous method, compile time error
//       overloadMehod(20,20);
     }
   public static void overloadMehod(int i,float f){
       System.out.println("int float method run");
   }
   public static void overloadMehod( float f,int i){
       System.out.println("float int method run");
   }
}