/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Santi
 */
public class Persona {
    // Atributos
    private int edad;
    private String nombre;
    
    public Persona() {
        
    }
    
    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public String getNombre() {
       return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}