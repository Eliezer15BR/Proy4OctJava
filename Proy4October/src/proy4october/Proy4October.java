/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy4october;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Proy4October {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultiPV A=new MultiPV();
        CCircularV B=new CCircularV();
        PilaP a=new PilaP();
        CCircularM b=new CCircularM();
        b.adicionar(new Mascota("felino","tomy","mestiza","rojo","macho","esterilizado", 45));
        b.adicionar(new Mascota("canino","toby","mestiza","rojo","hembra","no esterilizado", 12));
        A.adicionar(new Propietario("Eliseo","12456","Norte","Cementerio","79850",b),1);
         CCircularM c=new CCircularM();
         c.adicionar(new Mascota("felino","osca","fina","negro","macho","esterilizado", 15));
        c.adicionar(new Mascota("canino","leyla","mestiza","cafe","hembra","no esterilizado", 75));
        A.adicionar(new Propietario("Raul","15266","Norte","Portada","46411",c),2);
        CCircularM d=new CCircularM();
         d.adicionar(new Mascota("felino","teina","salvaje","verde","macho","no esterilizado", 13));
        d.adicionar(new Mascota("canino","reina","mestiza","naraja","hembra","esterilizado", 7));
        d.adicionar(new Mascota("canino","rupert","mestiza","cafe","macho","esterilizado", 7));
        A.adicionar(new Propietario("Jonhatan","1786","Norte","Portada","6487",d),3);
        CCircularM e=new CCircularM();
         e.adicionar(new Mascota("felino","john","fino","negro","macho","esterilizado", 11));
        e.adicionar(new Mascota("canino","lula","mestiza","cafe","hembra","no esterilizado", 14));
        A.adicionar(new Propietario("Ricardo","1586","Norte","Camacho","7231",e),4);
        CCircularM f=new CCircularM();
         f.adicionar(new Mascota("felino","yuyi","fina","negro","hembra","esterilizado", 10));
        f.adicionar(new Mascota("canino","tuki","mestiza","cafe","hembra","no esterilizado", 4));
        A.adicionar(new Propietario("Juady","7892","Norte","Portada","77892",f),5);
        A.setN(5);
        
        
        
        B.adicionar(new Vacunador("1/1/2023","María"));
        B.adicionar(new Vacunador("1/1/2023","Luis"));
        B.adicionar(new Vacunador("2/1/2023","Fabricio"));
        B.adicionar(new Vacunador("5/1/2023","Juan"));
        B.adicionar(new Vacunador("5/1/2023","Ana"));
        A.mostrar();
        B.mostrar();
        System.out.println("--------------------------");
        incisob(A, B, "canino", "Fabricio");
        System.out.println("---------------");
        incisoC(A);
    }
    public static void incisob(MultiPV A,CCircularV B,String x,String y){
        int n=B.nroelem();
        int con=0;
        for (int i = 1; i <= n; i++) {
         Vacunador elem=B.eliminar();
         if(elem.getNombre().equals(y)){
         PilaP a=new PilaP();
         while(!A.esvacia(i)){
             Propietario elem2=A.eliminar(i);
             CCircularM elem3=elem2.getColaMascota();
             int k=elem3.nroelem();
             for (int j = 1; j <= k; j++) {
                 Mascota elem4=elem3.eliminar();
                 if(elem4.getEspecie().equals(x)){
                 con=con+1;
                 }
                 elem3.adicionar(elem4);
             }
             a.adicionar(elem2);
         }
         A.vaciar(a, i);
         }
         B.adicionar(elem);
        }
        System.out.println("el vacunador "+y+ " vacuno "+con+" mascotas "+x);
}
    public static void incisoC(MultiPV A){
    PilaP aa=new PilaP();
    int conCan=0;
    int conFel=0;
    int total=0;
        for (int i = 1; i <= A.getN(); i++) {
            while(!A.esvacia(i)){
                Propietario elem=A.eliminar(i);
                CCircularM elem2=elem.getColaMascota();
                
                int k=elem2.nroelem();
                for (int j = 1; j <=k; j++) {
                    Mascota elem3=elem2.eliminar();
                    total++;
                    
                    if(elem3.getEspecie().equals("felino")) {conFel++;}
                    if(elem3.getEspecie().equals("canino")) {conCan++;}
                    elem2.adicionar(elem3);
                }
                 aa.adicionar(elem);
            }
           A.vaciar(aa, i);
        }
        double porc=100/(total*1.0);
        System.out.println(total+"---");
        System.out.println("el porcentaje de caninos es: "+(porc*conCan)+"%");
        System.out.println("el porcentaje de felinos es: "+(porc*conFel)+"%");
        }
}
