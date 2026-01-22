package org.example;

public class Cantante {
    private String nome;
    private String nazionalità;
    private int nota_biografica;

    public Cantante(String nome, String nazionalità, int nota_biografica) {
        this.nome = nome;
        this.nazionalità = nazionalità;
        this.nota_biografica = nota_biografica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota_biografica() {
        return nota_biografica;
    }

    public void setNota_biografica(int nota_biografica) {
        this.nota_biografica = nota_biografica;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }
}

