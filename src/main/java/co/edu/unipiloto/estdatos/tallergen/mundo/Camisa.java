package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario{

	public enum MARCA
        {
        MARCA_GEF,MARCA_POLO,MARCA_NAUTICA
        }
	private String marca;
	
	public Camisa(String pMarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pMarca;
	}
	
	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}
