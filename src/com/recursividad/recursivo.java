package com.recursividad;

public class recursivo {
    public double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }



    }
}
