/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Juan Diego Roman
 */
public class Principal {

    public static void main(String[] args) {
        
        /*var columnas = 0;
        var filas = 0;
        var i = 0;
        var j=0;

        var lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        filas = lectura.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        columnas = lectura.nextInt();

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                var matriz = new int[filas][columnas];
                System.out.println("Ingrese el valor en la posicion : " );
                matriz[i][j] = lectura.nextInt();
            }
            j=0;
        }
        System.out.println(lectura.nextInt());*/

        var arreglo1 = new Arreglo();
        var arreglo2 = new Arreglo();
        var vector1 = arreglo1.crearVector(5);
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        var vector2 = arreglo2.crearVector(5);
        for (int j = 0; j < vector2.length; j++) {
            System.out.println(vector2[j]);
        }
        var sumaA = new Arreglo();
        var suma1 = sumaA.sumaVector(vector1, vector2);

        var arreglo3 = new Arreglo();
        var arreglo4 = new Arreglo();
        var matriz1 = arreglo3.crearMatriz(5, 5);
        for (int k = 0; k < vector1.length; k++) {
            for (int m = 0; m < vector1.length; m++) {

                System.out.println(matriz1[k][m]);
            }
        }

        var matriz2 = arreglo4.crearMatriz(5, 5);
        for (int l = 0; l < vector2.length; l++) {
            for (int n = 0; n < vector2.length; n++) {
                System.out.println(matriz2[l][n]);
            }
        }
        var sumaB = new Arreglo();
        var suma2 = sumaA.sumaMatriz(matriz1, matriz2);
    }
}
