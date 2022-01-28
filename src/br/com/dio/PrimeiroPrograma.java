package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        gato Gato1 = new gato("Juninho", "preto",1);
        gato Gato2 = new gato("Lala", "Tricolor", 1);
        System.out.println(Gato1);
        System.out.println(Gato2);

        Livro livro1 = new Livro("O Príncipe", "Maquiavel", 198);
        System.out.println(livro1);
        Livro livro2 = new Livro("Do Espírito das Leis", "Montesquieu", 727);
        System.out.println(livro2);

//        System.out.println("That's what I do. I drink wine, I pet my cats and I know things.");

    }
}

class Livro{
    private String nome;
    private String autor;
    private  Integer numPaginas;

    public Livro(String nome, String autor, Integer numPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
