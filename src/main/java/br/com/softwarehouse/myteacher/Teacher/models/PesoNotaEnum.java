package br.com.softwarehouse.myteacher.Teacher.models;

public enum PesoNotaEnum {
    AP1(20D), AP2(30D), AP3(50D);

    private final Double peso;

    PesoNotaEnum(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }
}
