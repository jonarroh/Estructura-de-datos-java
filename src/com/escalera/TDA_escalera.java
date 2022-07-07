package com.escalera;

public class TDA_escalera {
    public static void main(String[] args) throws Exception {
        downStair(-9);
        System.out.println("Llegaste al final");

    }

    public static void downStair(int escalones) throws Exception {
        var escalones_restantes = (escalones == 0 || escalones < 0);
        if(!escalones_restantes) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                throw new Exception("error");
            }
            System.out.println("Descendiendo..."+escalones);
            downStair(escalones - 1);

        }
    }
    }
