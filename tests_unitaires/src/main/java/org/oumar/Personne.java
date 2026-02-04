package org.oumar;

public class Personne {

    private String name;
    private String firstname;
    private int old;
    private String adresse;

    public Personne(String name, String firstname, int old, String adresse) {
        this.name = name;
        this.firstname = firstname;
        this.old = old;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getOld() {
        return old;
    }

    public String getAdresse() {
        return adresse;
    }

}
