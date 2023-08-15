package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario {

    private MARCA marca;

    public enum MARCA {
        MARCA_GEF, MARCA_POLO, MARCA_NAUTICA
    }

    public Camisa(MARCA pMarca, Talla pTalla, double pPrecio) {
        super(pTalla, pPrecio);
        marca = pMarca;
    }

    public String toString() {
        return "Camisa " + marca + " Talla " + talla + "($ " + precio + ")";
    }
}
