package com.junior.vetores;

import java.util.Arrays;

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

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor já está cheio, não é possível adicionar mais elementos");
        }
    }
    
    //Método para buscar uma posição no vetor
    public String buscar(int posicao) throws Exception {
        
        if(posicao >= 0 && posicao > tamanho) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        return this.elementos[posicao];
    }

    //Metodo para definir o tamanho do vetor
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0;i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
    
    
}
