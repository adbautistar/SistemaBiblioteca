/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabiblioteca;

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
    
}
