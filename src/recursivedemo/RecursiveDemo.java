/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivedemo;

public class RecursiveDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        RecursiveDemo x = new RecursiveDemo();

        System.out.println(x.sum(5));
        System.out.println(x.fact(5));
        System.out.println(x.Multi(5, 4));
        System.out.println(x.Fibo(0));
        x.SolveHanoi(4,'A','B','C');

    }

    public int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public int Multi(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }

        return a + Multi(a, b - 1);
    }

    public int Fibo(int n) {
        if (n < 2) {
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
    public void SolveHanoi(int n,char A,char B,char C ){
        if(n==0){
        return;
        }
        SolveHanoi(n-1, A, C, B);
        System.out.println("Move disk "+n+"from " +A+ " to " +C);
         SolveHanoi(n-1, B, A, C);
         
    }
    

}
