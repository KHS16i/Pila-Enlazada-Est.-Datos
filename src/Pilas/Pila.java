
package Pilas;

/**
 *
 * @author khs16
 */
public class Pila {

    private nodoPila cima;

    public Pila() {
        cima = null;
    }

// Metodo para saber cuando la pila esta vacia
    public boolean estaVacia() {
        return cima == null;
    }

// Metodo para insertar un elemento en la Pila
    public void insertar(int valor) {
        //se crea un nuevo elemento de tipo pila con su estructura y su valor
        nodoPila nuevo = new nodoPila(valor);
        //se establece que la referencia siguiente del nuevo elemento será el que actualmente es la cima
        nuevo.siguiente = cima;
        //se establece la cima con el valor del nuevo elemento creado en la pila
        cima = nuevo;
    }

// Metodo para sacar un elemento en la Pila
    public int sacar() {
        //se crea un nuevo elemento de tipo entero y se le asigna el valor de la cima
        int auxiliar = cima.dato;
        //a la cima se le indica que su nuevo valor será su nodo siguiente en la pila
        cima = cima.siguiente;

        //se retorna el valor del elemento que antes era la cima
        return auxiliar;
    }

    //Metodo para mostar la lista
    public void mostrarlista() {
        //se crea un elemento de tipo pila llamado recorrer y se le da el valor de la cima
        nodoPila recorrer = cima;
        System.out.println();

        //si el valor de recorrer es nulo quiere decir que no hay nodos en la pila
        if (recorrer == null) {
            //se imprime en pantalla el mensaje y se sale del método
            System.out.print("Existen elementos en la pila");
            return;
        }

        //mientras el valor de recorrer sea distinto de nulo
        while (recorrer != null) {
            //se imprime en pantalla el valor del nodo y se avanza al siguiente nodo dentro de la pila
            System.out.print("[" + recorrer.dato + "]>");
            recorrer = recorrer.siguiente;
        }
    }

//Método para devolver el tamaño de la pila
    public void tamano() {
        //se crea un nuevo elemento de tipo pila y se le asigna el valor de la cima
        nodoPila recorrer = cima;
        System.out.println();
        //variable para contar el número de nodos y definir el tamaño de la pila
        int tamano = 0;

        //mientras recorrer sea distinto de nulo....
        while (recorrer != null) {
            //se aumenta el valor del tamaño y avanza al siguiente nodo dentro de la pila
            tamano = tamano + 1;
            recorrer = recorrer.siguiente;
        }

        //se imprime en pantalla el valor final de la variable tamaño 
        System.out.print("El tamaño de la pila es de [" + tamano + "] elementos");

    }

//método para devolver el nodo que representa la cima de la pila
    public void cima() {
        //se crea un elemento de tipo pila y se le asigna el valor de la cima
        nodoPila recorrer = cima;
        System.out.println();

        //se imprime en pantalla el valor de la cima
        System.out.print("La cima de la pila es: [" + recorrer.dato + "]");

    }

//método para vaciar por completo la pila
    public void vaciar() {
        System.out.println();

        //se crea un ciclo que recorre la lista asignando el valor del nodo siguiente que se llegue al final de la pila
        while (cima != null) {
            //a la cima se le asigna el valor de su siguiente nodo, hasta que llegue a null y represente el proceso de vaciado de la pila
            cima = cima.siguiente;
        }

    }

}

