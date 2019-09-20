package br.com.softwarehouse.myteacher.Teacher.requests;

import br.com.softwarehouse.myteacher.Teacher.models.PesoNotaEnum;

import java.math.BigDecimal;

public class NotaPeso {

    private BigDecimal nota;
    private PesoNotaEnum peso;

    public NotaPeso(BigDecimal nota, PesoNotaEnum peso) {
        this.nota = nota;
        this.peso = peso;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public PesoNotaEnum getPeso() {
        return peso;
    }

    public BigDecimal getNotaXPeso(){
        return  this.nota.multiply(BigDecimal.valueOf(this.peso.getPeso()));
    }
}
