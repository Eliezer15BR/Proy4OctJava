/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy4october;

import java.nio.channels.FileChannel;

/**
 *
 * @author estudiante
 */
public class Vacunador {
    private String fecha, nombre;

    public Vacunador() {
    }
    public Vacunador(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar(){
        System.out.println("fecha: "+fecha+" nombre: "+nombre);
    }
    
}
