package com.junior.vetores.tests;

import com.junior.vetores.Vetor;

public class Aula04 {
    
    public static void main(String[] args) {
       Vetor vetor = new Vetor(10);
        
        try {
            vetor.adicionar("Elemento1");
            vetor.adicionar("Elemento2");
            vetor.adicionar("Elemento3");
        } catch(Exception e) {
            
        }     
        
        System.out.println(vetor.tamanho());
        
        System.out.println(vetor);
    }
    
}
