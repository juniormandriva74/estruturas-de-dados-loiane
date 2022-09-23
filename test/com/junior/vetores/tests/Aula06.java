package com.junior.vetores.tests;

import com.junior.vetores.Vetor;

public class Aula06 {
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor(10);
        
        vetor.adicionar("Elemento1");
        vetor.adicionar("Elemento2");
        vetor.adicionar("Elemento3");
        
        System.out.println(vetor.verificar("ELemento5"));
    }
}
