package com.example.exemplorecyclerview;

public class Trabalhador {
    private String nome;
    private float salario;
    private int idade;
    private char sexo;

    public Trabalhador() {
    }

    public Trabalhador(String nome, float salario, int idade, char sexo) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome +
                ", salario R$ " + salario +
                ", idade " + idade +
                ", sexo " + sexo;
    }
}
