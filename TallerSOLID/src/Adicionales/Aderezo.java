/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    protected String nombre;
    
    public abstract void setNombre();
    
	@Override
	public String toString() {
		return (nombre.toUpperCase()) ;
	}
    
    public String getNombre() {
    	return nombre;
    }
    //MALVAVISCOS,FRUTILLA,CREMA
}
