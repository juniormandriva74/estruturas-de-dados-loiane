package com.junior.vetores;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    
    //Construtor
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    //Adicionando método melhorado para registrar o tamanho real
    //do vetor.
    
    public void adicionar(String elemento) throws Exception {
        
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor já está cheio, não é possível adicionar mais elementos");
        }
    }
        
        
    
    /*
    // Adicionando método para adicionar elementos no final do vetor
    public void adcionar(String elemento) {
        for(int i=0; i<this.elementos.length; i++) {
            if(this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/
}
