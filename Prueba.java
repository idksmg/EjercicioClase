package org.example;
import java.util.*;

public class Prueba {

    private int numero1;
    private int numero2;

    public Prueba(int num1, int num2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public Prueba(){

    }

    public int Suma(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = in.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = in.nextInt();
        int suma = num1 + num2;
        return suma;
    }
}
