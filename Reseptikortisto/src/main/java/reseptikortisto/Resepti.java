/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

/**
 *
 * @author pimajand
 */
public class Resepti {
    
    private String nimi;
    
    private String getNimi;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return nimi;
    }

    /**
     * Set the value of string
     *
     * @param resepti new value of string
     */
    public void setNimi(String resepti) {
        this.nimi = resepti;
    }

    private String ruokalaji;
    private String kuvaus;
    private boolean munaton;
    private boolean maidoton;
    private boolean gluteeniton;
    private String sijainti;
 
    
    
}
