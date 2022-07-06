package com.memoriaDinamica;
import javax.swing.*;
import java.util.ArrayList;
public class TDA_ArrayList {
    public void listar(){
        ArrayList<String> lista = new ArrayList<String>();

        String frase, resultado;

        do{
            frase = JOptionPane.showInputDialog(null, "Ingrese una frase");
            //agregar frase a lista
            lista.add(frase);
            resultado = JOptionPane.showInputDialog(null, "Desea ingresar otra frase? (si/no)");
        }while (!resultado.equals("si"));

        //mostrar lista
        for (String frase1 : lista) {
            System.out.println(frase1);
        }
    }



}
