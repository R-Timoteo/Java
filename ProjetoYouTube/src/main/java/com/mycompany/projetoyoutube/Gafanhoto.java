/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoyoutube;

/**
 *
 * @author timoteo
 */
public class Gafanhoto extends Pessoa  {
    private String login;
    private int totAssitido;

    /**
     *
     * @param nome
     * @param sexo
     * @param idade
     * @param login
     */
    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssitido=0;
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n+ login=" + login + ", totAssitido=" + totAssitido + '}';
                
    }

       
}
