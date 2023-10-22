/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Waflera extends Electrodomestico
        implements Aparatos {

    private String nom;
    private String marca;
    private String tipop;

   

    @Override
    public String getNombre() {
        
        String tipoText;
        if ("Industrial".equals(tipop)) {
        tipoText = "Industrial";
    } else if ("Hogareño".equals(tipop)) {
        tipoText = "Hogareño";
        
    } else if ("Lujoso".equals(tipop)) {
        tipoText = "Lujoso";
        
    } else{
        tipoText = "Tipo desconocido";
    }
        
        
        return "Nombre waflera: " + nom + " | Marca: " + marca + " | Tipo: " + tipoText;
    }

    /**
     * @return the diseño
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param diseño the diseño to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the precio
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param precio the precio to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
     public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }
    
    
    @Override
    public void aparatos() {

    }

}
