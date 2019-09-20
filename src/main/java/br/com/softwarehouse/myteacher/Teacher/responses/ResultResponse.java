package br.com.softwarehouse.myteacher.Teacher.responses;

import br.com.softwarehouse.myteacher.Teacher.models.MetricasEnum;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ResultResponse {

    private Map<MetricasEnum, BigDecimal> metricas = new HashMap<>();

    public void addMetrica(MetricasEnum nome, BigDecimal valor) {
        metricas.put(nome, valor);
    }

    public void addMetrica(MetricasEnum nome, Double valor) {
        addMetrica(nome, BigDecimal.valueOf(valor));
    }

    public Map getValores() {
        return this.metricas;
    }

}
