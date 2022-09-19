package com.junior.vetores.tests;

import com.junior.vetores.Vetor;

public class Aula03 {
    
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);
        
        try {
            vetor.adicionar("Elemento1");
            vetor.adicionar("Elemento2");
            vetor.adicionar("Elemento3");
        } catch(Exception e) {
        }
        
        
        
    }
    
}
