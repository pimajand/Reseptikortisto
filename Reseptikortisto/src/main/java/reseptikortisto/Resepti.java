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
    private String kuvaus;
    private String sijainti;

    public Resepti(String nimi, String kuvaus, String sijainti) {
        this.nimi = nimi;
        this.kuvaus = kuvaus;
        this.sijainti = sijainti;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String resepti) {
        this.nimi = resepti;
    }
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
