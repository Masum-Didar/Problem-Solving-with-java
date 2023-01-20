package Recursion;

public class FibonacciSeries {
    public int count = 0;
    int fib(int x){
        count++;
        if (x==0){
            return 0;
        }
        else if (x==1 || x==2)
        {
            return 1;
        }
        else
            return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args) {
        int x = 5;
        FibonacciSeries obj = new FibonacciSeries();
        obj.fib(x);
        for (int i=0; i<=x; i++){
            System.out.print(obj.fib(i)+" ");
        }
        System.out.println(obj.count);

    }
}
