package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
      Gato gato=new Gato();
        System.out.println(gato);
        Livro livro = new Livro("O problema dos 3 Corpos", 300);
        System.out.println(livro);
        /*  int a=6;
        int b=3;
        int s=a+b;
        System.out.println("A soma entre "+a+" e "+b+" é igual a :"+s);
        System.out.println("Hello World!");*/
    }
}

class Livro{
    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }

}