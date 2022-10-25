package MultiplicarValoresDeDosListas;

/**
 *
 * @author William Villamil
 */
public class Main {
    public static void main (String [] args){
        ListaDoble listaA = new ListaDoble();
        ListaDoble listaB = new ListaDoble();
        ListaDoble listaL = new ListaDoble();
        
        listaA.agregarNodoEnElInicio(1);
        listaA.agregarNodoEnElInicio(3);
        listaA.agregarNodoEnElInicio(5);
        listaA.agregarNodoEnElInicio(0);
        
        listaB.agregarNodoEnElInicio(1);
        listaB.agregarNodoEnElInicio(2);
        listaB.agregarNodoEnElInicio(3);
        listaB.agregarNodoEnElInicio(4);
        
        
        //METODO PARA MULTIPLICAR ELELMENTOS DE DOS LISTAS
        NodoDoble auxiliar = listaA.ultimo;
        
        while(auxiliar != null){                                                                               //Cuando nodo es diferente de null
            NodoDoble temporal = listaB.ultimo;                                                                //Se crea un nodo temporal y se convertiria en el ultimo de la lista B
            
            while(temporal != null){                                                                           //Cuando el nodo nuevo es diferente de null
                listaL.agregarNodoEnElInicio((int)temporal.getInformacion()*(int)auxiliar.getInformacion());   //Agregar a una lista nueva la multiplicacion entre el nodo B y el nodo A
                temporal = temporal.anterior;                                                                  //Nodo B pasaría a ser el anterior a él
            }
            auxiliar = auxiliar.anterior;                                                                      //Nodo A pasaría a ser el anterior a él
        }
        listaL.mostrarLista();
    }
}
