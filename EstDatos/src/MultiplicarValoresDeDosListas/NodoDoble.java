package MultiplicarValoresDeDosListas;

/**
 *
 * @author William Villamil
 */
public class NodoDoble <I>{
      I informacion;
  NodoDoble <I> siguiente;
  NodoDoble <I> anterior;

public NodoDoble (){
}  

    public I getInformacion() {
        return informacion;
    }

    public void setInformacion(I informacion) {
        this.informacion = informacion;
    }

    public NodoDoble<I> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<I> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<I> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<I> anterior) {
        this.anterior = anterior;
    }
}
