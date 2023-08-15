/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author SG702-15
 */
public class Computador extends Electronico {
    
    public enum SistemasOperativo{ 
    
    Debian, Ubuntu, Mandriva, Sabayon, Fedora
    }
    
    private SistemasOperativo SistemasOp;  

    public Computador( SistemasOperativo sistemasOp ,double pPrecio, Gama pGama ) {
        super(pGama, pPrecio);
        SistemasOp = sistemasOp;
    }
   } 

