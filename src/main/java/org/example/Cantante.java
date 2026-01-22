package org.example;

public class Cantante {
    private String nome;
    private String nazionalità;
    private String nota_biografica;

    public Cantante(String nome, String nota_biografica, String nazionalità) {
        this.nome = nome;
        this.nota_biografica = nota_biografica;
        this.nazionalità = nazionalità;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    public String getNota_biografica() {
        return nota_biografica;
    }

    public void setNota_biografica(String nota_biografica) {
        this.nota_biografica = nota_biografica;
    }
}

