package ArbolesAbm;

/**
 *
 * @author William Villamil
 */
public class NodoBinario {
    public int info;
    public ArbolBinario izq, der;


    public NodoBinario(int info){
        this.info = info;
        this.izq = null;
        this.der = null;
    }

    
    public NodoBinario(){
        this.info = 0;
        this.izq = null;
        this.der = null;
    } 

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public ArbolBinario getIzq() {
        return izq;
    }

    public void setIzq(ArbolBinario izq) {
        this.izq = izq;
    }

    public ArbolBinario getDer() {
        return der;
    }

    public void setDer(ArbolBinario der) {
        this.der = der;
    }
}
