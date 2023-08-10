package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Retos {

    public static void factorial() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        sc.close();
    }

    public static void contadorPalabras() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split("\\s+");
        int cantidadPalabras = palabras.length;

        System.out.println("La frase tiene " + cantidadPalabras + " palabras.");
        sc.close();
    }

    public static void contadorCaracteres() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split("");
        int cantidadPalabras = palabras.length;

        System.out.println("La palabra tiene " + cantidadPalabras + " caracteres.");
        sc.close();
    }

    public static void palindromo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        boolean esPalindromo = palabra.equalsIgnoreCase(palabraInvertida);

        if (esPalindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        sc.close();
    }

    public static void ordenarListaNumeros(int[] numeros) {
        Arrays.sort(numeros);
        System.out.println("Lista ordenada: " + Arrays.toString(numeros));
    }


    public static int encontrarMayorMatriz(int[][] matriz) {
        int mayor = Integer.MIN_VALUE;

        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num > mayor) {
                    mayor = num;
                }
            }
        }

        return mayor;
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static void dibujarTriangulo(int size) {
        for (int i = size; i >= 1; i--) {
            // Imprimir espacios en blanco para desplazar los asteriscos hacia la derecha
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos para formar el triángulo invertido
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Cambiar de línea para la siguiente fila del triángulo
        }
    }

    public static void dibujarCuadrado(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void dibujarRombo(int size) {
        int espacios = size - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            espacios--;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        espacios = 1;

        for (int i = 1; i <= size - 1; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            espacios++;

            for (int j = 1; j <= 2 * (size - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void parImpar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        sc.close();
    }


    public static int encontrarMayor(int[] nums) {
        int mayor = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public static int sumarLista(int[] nums) {
        int suma = 0;
        for (int num : nums) {
            suma += num;
        }
        return suma;
    }

    public static char encontrarPrimerCaracterUnico(String str) {
        // Crear un HashMap para contar las apariciones de cada caracter
        HashMap<Character, Integer> contador = new HashMap<>();

        // Contar las apariciones de cada caracter
        for (char c : str.toCharArray()) {
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }

        // Encontrar el primer caracter no repetido
        for (char c : str.toCharArray()) {
            if (contador.get(c) == 1) {
                return c;
            }
        }
        return '-';
    }
    public static HashMap<String, Integer> contarPalabras(String texto) {
        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        String[] palabras = texto.split("\\s+");
        for (String palabra : palabras) {
            contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
        }
        return contadorPalabras;
    }


}
