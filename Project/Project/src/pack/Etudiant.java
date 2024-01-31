
package pack;

import java.io.Serializable;


public class Etudiant implements Serializable {
    
    private String code , mdp , nom ,email , ville ; 
    private boolean male ; 
    private String [] langues = new String[3] ; 

    // Code : 
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Mdp :
    
    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    // Nom :
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Email :
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Ville :
    
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    // Genre ( male ) : 
    
    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    // Langues :
    
    public String[] getLangues() {
        return langues;
    }

    public void setLangues(String[] langues) {
        this.langues = langues;
    }

    
     
     
    // Constructor Etudiant :
    
    public Etudiant() {}


    public Etudiant(String code, String mdp, String nom, String email, String ville, boolean male) {
        this.code = code;
        this.mdp = mdp;
        this.nom = nom;
        this.email = email;
        this.ville = ville;
        this.male = male;
    }
    
    
  
    
    
}
