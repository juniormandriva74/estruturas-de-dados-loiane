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
    
    //Aula 07 - Adicionar elememento em qualquer pocicao do vetor.
    public boolean adiciona(int posicao, String elemento) {
        if(posicao >= 0 && posicao > tamanho) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        //Mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }
    
    //Método para buscar uma posição no vetor
    public String buscar(int posicao) throws Exception {
        
        if(posicao >= 0 && posicao > tamanho) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        
        return this.elementos[posicao];
    }
    
    //Método para verificar se existe um elemento no vetor
    public int verificar(String elemento) {
        for(int i=0; i<this.tamanho; i++) {
            if(this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        
        return -1;
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
