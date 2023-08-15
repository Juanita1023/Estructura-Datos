package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Casillero <T>{

	private T dato;

    public Casillero(T dato) {
        this.dato = dato;
    }

    Casillero() {
    }


    public boolean agregar(T t) {
        if (dato == null) {
            dato = (T) t;
            return true;
        }
        return false;
    }

    public T darProducto() {
        return (T) dato;
    }

    public T despachar() {
        if (dato == null) {
            return dato;
        }

        T nObjeto = dato;
        dato = null;
        return nObjeto;
    }

    public boolean estaDesocupado() {

        if (dato == null) {
            return true;
        }
        return false;

    }
}
