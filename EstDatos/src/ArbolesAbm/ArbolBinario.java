package ArbolesAbm;

/**
 *
 * @author William Villamil
 */


/**Un ABM es un árbol binario que en su raíz guarda el menor valor (y los árboles izquierdo y derecho tienen la
misma propiedad). Por ejemplo, el siguiente árbol binario es un ABM:
 2
 5 4
 8 5 7
a) Escribir un método de encabezamiento:
boolean esABM(Nodo x)
que entregue true si el árbol binario de raíz x corresponde a un ABM (o false si no)
b) Escribir un método de encabezamiento
Nodo juntar(Nodo x, Nodo y)
que entregue un nuevo ABM uniendo los ABMs de raices x e y. */



public class ArbolBinario {
    public NodoBinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }
    
    public boolean estaVacia() {
        return (raiz == null);
    }
    
    public void insertar(int info) {
        if (estaVacia()) {
            NodoBinario nuevo = new NodoBinario();
            nuevo.info = info;
            nuevo.der = new ArbolBinario();
            nuevo.izq = new ArbolBinario();
            raiz = nuevo;
        } else {
            if (info > raiz.info) { 
                (raiz.der).insertar(info);
            }
            if (info < raiz.info) {
                (raiz.izq).insertar(info);
            }
        }
    }
    
    public void preOrden() {
        if (!estaVacia()) {
            System.out.print(raiz.info + " ");
            raiz.izq.preOrden();
            raiz.der.preOrden();
        }
    }
    
    public void enOrden() {
        if (!estaVacia()) {
            raiz.izq.enOrden();
            System.out.print(raiz.info + " ");
            raiz.der.enOrden();
        }
    }
    
    public void posOrden() {
        if (!estaVacia()) {
            raiz.izq.posOrden();
            raiz.der.posOrden();
            System.out.print(raiz.info + " ");
        }
    }
    
    //Punto A
    public boolean esABM(NodoBinario nodo){
        //Caso arbol vacio
        if(nodo == null)
            return true;
        //Caso arbol sin subarboles
        if(nodo.izq == null && nodo.der == null)
            return true;
        //Caso izquierdo vacio
        if(nodo.izq == null)
            return nodo.info <= nodo.der.info && esABM(nodo.der);
        //Caso arbol derecho vacio
        if(nodo.der == null)
            return nodo.info <= nodo.izq.info && esABM(nodo.izq);
        //Caso general
        return nodo.info <= nodo.izq.info && nodo.info <= nodo.der.info && esABM(nodo.izq) && esABM(nodo.der);
    }
    
    //Punto B
    public NodoBinario juntar(NodoBinario n1, NodoBinario n2){
        //Caso amboas arboles vacios
        if(n1 == null && n2 == null)
            return null;
        //Caso arbol izquierdo vacio
        if(n1 == null)
            return new NodoBinario(n2.info, juntar(n2.izq, null), juntar(n2.der, null));
        //Caso arbol derecho vacio
        if(n2 == null)
             return new NodoBinario(n1.info, juntar(n1.izq, null), juntar(n1.der, null));
        //Caso general
        if(n1.info <= n2.info)
             return new NodoBinario(n1.info, juntar(n1.izq, null), juntar(n2, null));
        else
            return  new NodoBinario(n2.info, juntar(n1, null), juntar(n2.izq, null));
    }
}
