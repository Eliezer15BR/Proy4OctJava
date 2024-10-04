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
public class Mascota {
    private String especie,nombre,raza,color,sexo,esterilizado;
    private int edad;

    public Mascota() {
    }

    public Mascota(String especie, String nombre, String raza, String color, String sexo, String esterilizado, int edad) {
        this.especie = especie;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.esterilizado = esterilizado;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(String esterilizado) {
        this.esterilizado = esterilizado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrar(){
        System.out.println(especie+" "+nombre+" "+raza+" "+edad+" "+color+" "+sexo);
    }
}
