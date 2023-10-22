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
public class Licuadora extends Electrodomestico
        implements Aparatos {

    private String nom;
    private String velocidades;
    private String voltaje;
    private String modelo;



    @Override
    public String getNombre() {
        return "Nombre de licuadora " + nom + " | velocidades: " + velocidades +" | Voltaje: " + voltaje+ " | Modelo " + modelo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }
    /**
     * @return the precio
     */
    public String getVelocidades() {
        return velocidades;
    }

    /**
     * @param precio the precio to set
     */
    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }

    @Override
    public void aparatos() {

    }

}
