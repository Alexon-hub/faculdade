package br.com.softwarehouse.myteacher.Teacher.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nome;

    @Size(min = 10,max = 250)
    private Integer peso;

    @Column(columnDefinition = "integer default 0")
    private BigDecimal ap1;

    @Column(columnDefinition = "integer default 0")
    private BigDecimal ap2;

    @Column(columnDefinition = "integer default 0")
    private BigDecimal ap3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public BigDecimal getAp1() {
        return ap1;
    }

    public void setAp1(BigDecimal ap1) {
        this.ap1 = ap1;
    }

    public BigDecimal getAp2() {
        return ap2;
    }

    public void setAp2(BigDecimal ap2) {
        this.ap2 = ap2;
    }

    public BigDecimal getAp3() {
        return ap3;
    }

    public void setAp3(BigDecimal ap3) {
        this.ap3 = ap3;
    }
}
