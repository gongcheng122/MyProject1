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

    }
}

/*class A<z> {
    int z;
    int x = 15;
    int y = 6;
    z = x+y;


}*/