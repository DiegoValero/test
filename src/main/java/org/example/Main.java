package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //  RETOS

        //  Retos.factorial();
        //  Retos.contadorPalabras();
        //  Retos.contadorCaracteres();
        //  Retos.palindromo(); // leer lo mismo al derecho y revez
        //  Retos.ordenarListaNumeros(new int[]{5, 2, 9, 1, 5, 6});

        int[][] matriz = {
                {5, 9, 3},
                {2, 7, 1},
                {8, 6, 4}
        };

        //  System.out.println(Retos.encontrarMayorMatriz(matriz));
        //  System.out.println(Retos.contarVocales("Hola contar vocales"));
        //  Retos.dibujarTriangulo(10);
        //  Retos.dibujarCuadrado(10);
        //  Retos.dibujarRombo(10);
        //  Retos.parImpar();


        //  System.out.println(Retos.encontrarMayor(new int[]{5, 2, 9, 1, 5, 6}));
        //   System.out.println(Retos.sumarLista(new int[]{5, 2, 9, 1, 5, 6}));
        //    System.out.println(Retos.encontrarPrimerCaracterUnico("hola"));

        String texto = "este es un ejemplo de texto en texto que contiene varias palabras ejemplo ejemplo";

        HashMap<String, Integer> resultado = Retos.contarPalabras(texto);
        for (String palabra : resultado.keySet()) {
            System.out.println(palabra + ": " + resultado.get(palabra));
        }
        // POM
        Persona persona1 = new Persona("Juan", 30);
        //  persona1.saludar();

        //  arrayHasMap();

    }

    public static void contarHastaNConWhile(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }
    }

    public List<String> crearListaDeNombres() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        return nombres;
    }

    public static void arrayLisy() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Luis");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    public static void arrayHasMap() {
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Pedro", 30);
        edades.put("Luis", 28);

        System.out.println("La edad de Pedro es: " + edades.get("Pedro"));

    }

    private void metodos() {
        // arrray
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // constante
        final double PI = 3.14159;

        // Variable
        int edad = 25;
        String nombre = "Diego";

        // Switch case
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            // Más casos si es necesario
            default:
                System.out.println("Día no válido");
        }

        // While
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Do While
        int contador2 = 0;
        do {
            System.out.println("Contador: " + contador2);
            contador2++;
        } while (contador2 < 5);

        // For
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }
    }
}