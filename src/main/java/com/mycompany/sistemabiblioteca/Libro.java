/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALFREDOBAUTISTAROMER
 */
public class Libro {
      
    //atributos
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private int anioPublicacion;
    private boolean disponible;
    
    static ArrayList<Libro> libros  = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    //Constructor 
    public Libro(String isbn, String titulo, String autor,String genero, int anioPublicacion) {
    this.isbn            = isbn;
    this.titulo          = titulo;
    this.autor           = autor;
    this.genero          = genero;
    this.anioPublicacion = anioPublicacion;
    this.disponible      = true;
}
    //Getters
    public String getIsbn()            { return isbn; }
    public String getTitulo()          { return titulo; }
    public String getAutor()           { return autor; }
    public String getGenero()          { return genero; }
    public int    getAnioPublicacion() { return anioPublicacion; }
    public boolean isDisponible()      { return disponible; }

    //Setters
    public void setIsbn(String isbn)                     { this.isbn = isbn; }
    public void setTitulo(String titulo)                 { this.titulo = titulo; }
    public void setAutor(String autor)                   { this.autor = autor; }
    public void setGenero(String genero)                 { this.genero = genero; }
    public void setAnioPublicacion(int anioPublicacion)  { this.anioPublicacion = anioPublicacion; }
    public void setDisponible(boolean disponible)        { this.disponible = disponible; }
        
    @Override
    public String toString() {
        return "ISBN: " + isbn
             + " | Título: "  + titulo
             + " | Autor: "   + autor
             + " | Estado: "  + (disponible ? "Disponible" : "Prestado");
    }
    
    
    static void registrarLibro() {
        System.out.print("ISBN   : "); String isbn   = scanner.nextLine();
        System.out.print("Título : "); String titulo = scanner.nextLine();
        System.out.print("Autor  : "); String autor  = scanner.nextLine();
        System.out.print("Género : "); String genero = scanner.nextLine();
        int anio = leerEntero("Año   : ");

        if (buscarPorIsbn(isbn) != null) {
            System.out.println(" Ya existe un libro con ese ISBN.");
            return;
        }

        libros.add(new Libro(isbn, titulo, autor, genero, anio));
        System.out.println(" Libro registrado.");
    }

    static void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println(" No hay libros registrados.");
            return;
        }
        for (Libro libro : libros)
            System.out.println(libro);
    }

    static Libro buscarPorIsbn(String isbn) {
        for (Libro libro : libros)
            if (libro.getIsbn().equalsIgnoreCase(isbn)) return libro;
        return null;
    }

    static void actualizarLibro() {
        System.out.print("ISBN a actualizar: ");
        Libro libro = buscarPorIsbn(scanner.nextLine());
        if (libro == null) { System.out.println(" No encontrado."); return; }

        System.out.print("Nuevo título [" + libro.getTitulo() + "]: ");
        String titulo = scanner.nextLine();
        if (!titulo.isBlank()) libro.setTitulo(titulo);

        System.out.print("Nuevo autor [" + libro.getAutor() + "]: ");
        String autor = scanner.nextLine();
        if (!autor.isBlank()) libro.setAutor(autor);

        System.out.println(" Libro actualizado.");
    }

}
