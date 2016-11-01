/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Simon
 */
public class User implements  Serializable {

    private String username;
    private String password;
    private String salt;

    private String vorname;
    private String nachname;

    private Adresse home;
    private Warenkorb warenkorb;

    public User(String name, String salt, String password, Adresse home) {
        this.username = name;
        this.salt = salt;
        this.password = password;
        this.home = home;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Adresse getHome() {
        return home;
    }

    public String getSalt() {
        return salt;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    

}
