package reseptikortisto;

import java.util.ArrayList;

/**
 *
 * @author Pirjo
 */

public class Reseptikortisto {
    
    private String resepti;
    private ArrayList<Resepti> reseptit;

    public Reseptikortisto(String resepti, ArrayList<Resepti> reseptit) {
        this.resepti = resepti;
        this.reseptit = reseptit;
    }

    public String getResepti() {
        return resepti;
    }

    public void setResepti(String resepti) {
        this.resepti = resepti;
    }

    public ArrayList<Resepti> getReseptit() {
        return reseptit;
    }

    public void setReseptit(ArrayList<Resepti> reseptit) {
        this.reseptit = reseptit;
    }
    
  
    
}
