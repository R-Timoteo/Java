/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetoyoutube;

/**
 *
 * @author timoteo
 */
public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[]= new Video[3];
        v[0]= new Video("Aula 01 POO");
        v[1]= new Video("Aula 12 Php");
        v[2]= new Video("Aula 03 python");
        
        Gafanhoto g[]= new Gafanhoto [2];
        g[0]= new Gafanhoto("humels","m", 5 , "homer");
        g[1]= new Gafanhoto("zuniga","f", 4 , "quebra");
        
        
        Vizualizacao vis[] = new Vizualizacao[5];
        vis [0] = new Vizualizacao(g[0], v[2]);
        vis [0].Avaliar();
        System.out.println(vis[0].toString());
        
        vis [1] = new Vizualizacao(g[0], v[1]);
        vis [0].Avaliar(87.0f);
        System.out.println(vis[1].toString());
    }
}
