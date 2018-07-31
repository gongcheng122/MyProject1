package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 15;
        int m = 2;
        int n;

        n = i+m;
        System.out.println("plus:"+n);

        n/=2;
        System.out.println(""+n);

        n%=2;
        System.out.println(n);

        double j;
        j = n +0.0;
        System.out.println("int + double = double:"+j);

      //  n = n +0.0; error n is int;

        int h =1;
        if(++h ==12){
            System.out.println("h has been 12");
        }else {
            h++;
        }
        System.out.println(h);

        while(h!=15){
            ++h;
        }
        System.out.println(h);

        int a = 1;
        int b = 2;
        int c;

        c = a>b?a:b;

        System.out.println("a = 1, b = 2, a>b?a:b" +  c );

        // A>B?A:B this can avoid the error sometimes
        int A =1;
        int B =0;
        int C;

        C = B!=0?A/B:A*B;
        System.out.println(C);

        //C++ diff with ++C
        int D;
        D = C++;
        System.out.println("C is 0, D=C++, D now is : "+D+"; C now is : "+C);

        D = ++C;
        System.out.println("D=C++, D now is : "+D+"; C now is : "+C);

    }
}
