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
public class Plancha extends Electrodomestico
        implements Aparatos {

    private String nom;
    private String temperatura;
    private String tipop;

   
   

    @Override
    public String getNombre() {
         String tipoText;
        if ("a vapor".equals(tipop)) {
        tipoText = "a vapor";
    } else if ("sin vapor".equals(tipop)) {
        tipoText = "sin vapor";
    } else {
        tipoText = "Tipo desconocido";
    }
        
        
        return "Nombre de plancha: " + nom + " | Temperatura: " + temperatura + " | Tipo: " + tipoText;
    }

    /**
     * @return the color
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param color the color to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the precio
     */
    public String getTemperatura() {
        return temperatura;
    }

    /**
     * @param precio the precio to set
     */
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
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
