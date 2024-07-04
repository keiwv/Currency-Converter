package com.menu;


import java.util.Scanner;

public class Menu {

    protected int option;

    public int getOption() {
        option = -1;
        Scanner sc = new Scanner(System.in);
        while(option <= 0 || option >= 8)
        {
            options();
            option = sc.nextInt();
        }
        return option;
    }

    private void options() {
        System.out.println("*************************************");
        System.out.println("Sea bienvenido/a al conversor de monedas!\n");
        System.out.println("1) Dólar =>> Peso Argentino");
        System.out.println("2) Peso Argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.println("*************************************");
        System.out.println("Por favor, selecciona una opción: ");
    }
}
