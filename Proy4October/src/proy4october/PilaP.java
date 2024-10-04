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
public class PilaP {
    private int max=20;
    private Propietario v[]=new Propietario[max+1];
    private int tope;
    
    PilaP()
    {
        tope=0;
    }
    boolean esvacia ()
    {
        if (tope == 0)
            return (true);
        return (false);
    }
    boolean esllena ()
    {
        if (tope == max)
            return (true);
        return (false);
    }
    int nroelem ()
    {
        return (tope);
    }
    void adicionar (Propietario elem)
    {
        if (!esllena ())
        {
            tope++;
            v [tope] = elem;
        }
        else
            System.out.println ("Pila llena");
    }
    Propietario eliminar ()
    {
        Propietario elem=null;
        if (!esvacia ())
        {
            elem = v [tope];
            tope--;
        }
        else
            System.out.println ("Pila vacia");
        return (elem);
    }
    void mostrar ()
    {
        if (esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            
            PilaP aux = new PilaP ();
            while (!esvacia ())
            {
                Propietario elem = this.eliminar ();
                aux.adicionar (elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    void vaciar (PilaP a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());

    }
}
