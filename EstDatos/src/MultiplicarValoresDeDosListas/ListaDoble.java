package MultiplicarValoresDeDosListas;

/**
 *
 * @author William Villamil
 */
public class ListaDoble <L>{
    NodoDoble <L> inicio;
    NodoDoble <L> ultimo;

    public void agregarNodoEnElFinal(L dato){
       NodoDoble <L> nodo = new NodoDoble <L>();
       nodo.setInformacion(dato);
       
       if(inicio == null){
           inicio = nodo;
           ultimo = nodo;
       }
       else{
           nodo.setAnterior(ultimo);
           ultimo.setSiguiente(nodo);
           ultimo = nodo;
       }
    }
    
    public void agregarNodoEnElInicio(L dato){
        NodoDoble <L> nodo = new NodoDoble <L>();
        nodo.setInformacion(dato);
        
        if(inicio == null){
           inicio = nodo;
           ultimo = nodo;
       }
       else{
           inicio.setAnterior(nodo);
           nodo.setSiguiente(inicio);
           inicio = nodo;
       }
    }
    
   /** public void multiplicar(ListaDoble lista1,ListaDoble lista2,ListaDoble lista3){
        NodoDoble nuevo = lista1.getInicio();
        while(nuevo != null){
            NodoDoble tmp = lista2.getInicio();
            while(tmp!=null){
                lista3.agregarNodoEnElFinal(nuevo.getInformacion()*tmp.getInformacion());
                tmp = tmp.getSiguiente();
            }
            Falta..
        }
    }
    * */

    public NodoDoble<L> getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble<L> inicio) {
        this.inicio = inicio;
    }

    public NodoDoble<L> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble<L> ultimo) {
        this.ultimo = ultimo;
    }
    
    public void mostrarLista(){
        NodoDoble <L> auxiliar = inicio;
        while(auxiliar != null){
        System.out.println(auxiliar.getInformacion());
        auxiliar = auxiliar.getSiguiente();
        }
    }
}
