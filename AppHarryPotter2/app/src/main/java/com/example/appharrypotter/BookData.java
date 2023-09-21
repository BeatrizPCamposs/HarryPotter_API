package com.example.appharrypotter;

public class BookData {
    private String IdBooks;
    private String titulo;
    private String sumario;
    private String autor;
    private String ano_lancamento;
    private String ordem;
    private String cover;
    private String numPaginas;

    public BookData(String IdBooks, String titulo, String sumario, String autor, String ano_lancamento, String ordem, String cover, String numPaginas) {
        this.IdBooks = IdBooks;
        this.titulo = titulo;
        this.sumario = sumario;
        this.autor = autor;
        this.ano_lancamento = ano_lancamento;
        this.ordem = ordem;
        this.cover = cover;
        this.numPaginas = numPaginas;
    }

    public String getIdBooks() {
        return IdBooks;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSumario() {
        return sumario;
    }

    public String getAutor() {
        return autor;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public String getOrdem() {
        return ordem;
    }

    public String getCover() {
        return cover;
    }

    public String getNumPaginas() {
        return numPaginas;
    }
}

