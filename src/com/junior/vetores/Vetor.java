package com.junior.vetores;

public class Vetor {
    private String[] elementos;
    
    //Construtor
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }
    
    // Adicionando método para adicionar elementos no final do vetor
    public void adcionar(String elemento) {
        for(int i=0; i<this.elementos.length; i++) {
            if(this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}
