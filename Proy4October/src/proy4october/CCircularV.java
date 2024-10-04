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
public class CCircularV {
    private int max=50;
    private Vacunador v[]=new Vacunador[max+1];
    private int ini,fin;
    CCircularV()
    {
        ini=fin=0;
    }
    int nroelem ()
    {
        return ((max + fin - ini) % max);
    }
    boolean esvacia ()
    {
        if (nroelem () == 0)
            return (true);
        return (false);
    }
    boolean esllena ()
    {
        if (nroelem () == max - 1)
            return (true);
        return (false);
    }
    void adicionar (Vacunador elem)
    {
        if (!esllena ())
        {

            fin = (fin + 1) % max;
            v [fin] = elem;
        }
        else
            System.out.println ("Cola circular llena");
    }
    Vacunador eliminar ()
    {
        Vacunador elem = null;
        if (!esvacia ())
        {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem () == 0)
                ini = fin = 0;
        }
        else
            System.out.println ("Cola circular vacia");
        return (elem);
    }
    void mostrar ()
    {
        Vacunador elem;
        if (esvacia ())
            System.out.println ("Cola vacia xxx");
        else
        {
            CCircularV aux = new CCircularV ();
            while (!esvacia ())
            {
                elem = eliminar ();
                aux.adicionar (elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }
    void vaciar (CCircularV a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());

    }
}
