package org.example;
import java.util.*;

public class Prueba {

    private int num1;
    private int num2;
    private int num3;

    public Prueba(int num1, int num2, int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public Prueba(){

    }

    public int Suma(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = in.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = in.nextInt();
        System.out.println("Ingrese otro número: ");
        int num3 = in.nextInt();
        int suma = num1 + num2 + num3;
        return suma;
    }
}
