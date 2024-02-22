/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoyoutube;

/**
 *
 * @author timoteo
 */
public class Vizualizacao {
    private Gafanhoto espectador;
    private Video Filme;

    public Vizualizacao(Gafanhoto espectador, Video Filme) {
        this.espectador = espectador;
        this.Filme = Filme;
        this.espectador.setTotAssitido(this.espectador.getTotAssitido() +1);
        this.Filme.setViews(this.Filme.getViews() +1);
    }
    
    public void Avaliar(){
        this.Filme.setAvaliacao(5);
    }
    
    public void Avaliar(int nota){
        this.Filme.setAvaliacao(nota);
    }
    
    public void Avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.Filme.setAvaliacao(tot);                    
    }
    
    
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return Filme;
    }

    public void setFilme(Video Filme) {
        this.Filme = Filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador=" + espectador + ", Filme=" + Filme + '}';
    }
    
    
}
