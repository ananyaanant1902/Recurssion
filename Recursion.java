package dsa;
import java.util.*;
public class Recursion {



  static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int numbers(int n){
      if(n==1){
          return 1;
      }
      System.out.println(n);
      return numbers(n-1);
    }

    static void print(int n){

      if(n==0){
         // System.out.println();
          return;
      }
      print(n-1);
        System.out.println(n);
    }

    static long powers(int x, int n){
      if(x==0){
          return 1;
      }
      return n*powers(x-1,n);
    }
    //more optimized
    static int powers2(int x, int n){
      if(n==0){
          return 1;
        }
      if(n%2==0){
          return powers2(x,n/2)*powers2(x,n/2);

      }
      else{
          return x*powers2(x,n/2)*powers2(x,n/2);
      }
    }

    static void printFun(int n){
      if(n<1){
          return ;
      }
      System.out.println(n);
      printFun(n-1);
      System.out.println(n);
     // return;
    }

    static int fibonacci(int n){
        if (n == 0)
            return 0;

        // Stop condition
        if (n == 1 || n == 2)
            return 1;

            // Recursion function
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    static int sum(int n){
      if(n==1){
          return 1;
      }
      return n+sum(n-1);
    }

    static void firstOccurrence(int[] arr,int key, int size, int i) {
        if (i == size) {
            return ;
        }
        if (arr[i] == key) {
            System.out.println(i);
            return;
        }
        firstOccurrence(arr, key, size, ++i);

    }

    static int fun(int x, int y){
        if (x == 0) {
            return y;
        }
        return fun(x-1,x+y);
    }

    static int fun1(int n)
    {
        if (n == 1)
            return 0;
        else
            return 1 + fun1(n / 2);
    }



    static void printingPattern(int n)
    {
        if(n==0){
            return;
        }for(int i=0;i<n;i++){
        System.out.print("*");
    }
        System.out.println();
        printingPattern(n-1);

    }


    static void recusrionBinary(int k){
      if(k==0){
          return;
      }

      recusrionBinary(k/2);
        System.out.print(k%2+" ");
    }
    public static void main(String[] args) {
        System.out.println(powers2(2,5));
        print(5);
      //  System.out.println(sum(5));
      /*  printingPattern(4);
        int[] arr={1,2,3,4,5,6,7,8,5,4,3};
        recusrionBinary(10);*/
      // firstOccurrence(arr,5,arr.length,0);
       // towerOfHanoi(3,'A','B','C');
      //  System.out.println(fibonacci(5));
        /*for(int i=0;i<=4;i++){
            System.out.println(fibonacci(i));
        }*/

      //  System.out.println(powers(5,3));
    //   printFun(5);
        // System.out.println(numbers(5));
      //  print(5);
       //  System.out.println(fibonacci(15));
      /* int n1=0;
       int n2=1;
       int n3=0;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<=4;i++) {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }*/
    }
}
