package org.example;
import java.util.*;

public class Prueba {

    private int num1;
    private int num2;

    public Prueba(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
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
