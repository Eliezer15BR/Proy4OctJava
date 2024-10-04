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
public class MultiPV {
    private PilaP v[]=new PilaP[100];
    private int n;

    public MultiPV() {
        for (int i=1;i<=39;i++)
            v[i]=new PilaP();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    boolean esvacia(int i){
        return v[i].esvacia();
    }
    
    boolean esllena(int i){
        return v[i].esllena();
    }
    
    int nroelem(int i){
        return v[i].nroelem();
    }
    
    void adicionar(Propietario elem,int i){
        v[i].adicionar(elem);
    }
    
       Propietario eliminar(int i){
        return v[i].eliminar();
    }
    
    void mostrar(int i){
       v[i].mostrar();
    }
    
    void mostrar(){
        for(int i=1;i<=getN();i++){
            System.out.println("\n - Datos de la Pila "+i);
            //mostrar(i);
            v[i].mostrar();
        }
    }

    void vaciar(PilaP Z,int i){
        v[i].vaciar(Z);
    }
    
    void vaciar(int i,int j){
        v[i].vaciar(v[j]);
    }   
}
