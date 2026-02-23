/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabiblioteca;

import static com.mycompany.sistemabiblioteca.Libro.actualizarLibro;
import static com.mycompany.sistemabiblioteca.Libro.buscarPorIsbn;
import static com.mycompany.sistemabiblioteca.Libro.eliminarLibro;
import static com.mycompany.sistemabiblioteca.Libro.listarLibros;
import static com.mycompany.sistemabiblioteca.Libro.registrarLibro;
import static com.mycompany.sistemabiblioteca.Libro.scanner;

/**
 *
 * @author ALFREDOBAUTISTAROMER
 */
public class SistemaBiblioteca {

  public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n1. Registrar  2. Listar  3. Buscar  4. Actualizar  5. Eliminar  0. Salir");
            opcion = leerEntero("Opción: ");
            switch (opcion) {
                case 1 -> registrarLibro();
                case 2 -> listarLibros();
                case 3 -> 
                {
                    System.out.print("ISBN a buscar: ");
                    String isbn = scanner.nextLine();
                    Libro encontrado = buscarPorIsbn(isbn);
                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("✘ No se encontró ningún libro con ese ISBN.");    

                }
                case 4 -> actualizarLibro();
                case 5 -> eliminarLibro();
            }
        } while (opcion != 0);
    }

    static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Ingrese un número válido.");
            }
        }
    } 
}