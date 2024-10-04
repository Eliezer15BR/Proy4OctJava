/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy4october;

/**
 *
 * @author estudiante
 */
public class Propietario {
    private String nombre,ci,direccion,zona,celular;
    private CCircularM ColaMascota=new CCircularM();

    public Propietario() {
    }

    public Propietario(String nombre, String ci, String direccion, String zona, String celular,CCircularM a) {
        this.nombre = nombre;
        this.ci = ci;
        this.direccion = direccion;
        this.zona = zona;
        this.celular = celular;
        this.ColaMascota=a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public CCircularM getColaMascota() {
        return ColaMascota;
    }

    public void setColaMascota(CCircularM ColaMascota) {
        this.ColaMascota = ColaMascota;
    }
    public void mostrar(){
        System.out.println(nombre+" "+ci+" "+direccion+" "+zona+" "+celular);
        ColaMascota.mostrar();
    }
    
}
