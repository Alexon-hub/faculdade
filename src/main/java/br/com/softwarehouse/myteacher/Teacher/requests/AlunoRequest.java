package br.com.softwarehouse.myteacher.Teacher.requests;

public class AlunoRequest {

    private String nome;
    private Integer peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
