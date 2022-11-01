package com.junior.vetores.tests;

import com.junior.vetores.Vetor;

public class Aula07 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);
        
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");
        
        System.out.println(vetor);
        
        vetor.adiciona(0, "A");
        
        System.out.println(vetor);
        
    }
}
