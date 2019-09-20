package br.com.softwarehouse.myteacher.Teacher.services;

import br.com.softwarehouse.myteacher.Teacher.models.Aluno;
import br.com.softwarehouse.myteacher.Teacher.models.MetricasEnum;
import br.com.softwarehouse.myteacher.Teacher.repository.AlunoRepository;
import br.com.softwarehouse.myteacher.Teacher.requests.NotaPeso;
import br.com.softwarehouse.myteacher.Teacher.responses.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class EstatisticaService {

    @Autowired
    private AlunoRepository alunoRepository;

    /**
     * Calcula a média aritimética de uma lista de valores
     * @param valores
     * @return
     */
    public ResultResponse calculaMediaAritimetica(List<BigDecimal> valores){
        OptionalDouble media = valores.stream().mapToDouble(v -> v.doubleValue()).average();
        ResultResponse result = new ResultResponse();
        if(media.isPresent()){
            result.addMetrica(MetricasEnum.MEDIA, media.getAsDouble());
        }
        return  result;
    }

    /**
     * Calcula a media aritumética dos pesos dos alunos cadastrados
     * @return
     */
    public ResultResponse calculaMediaAritimeticaAlunos() {
        List<Aluno> allAlunos = alunoRepository.findAll();
        List<BigDecimal> listaIdades = allAlunos.stream().map(a -> BigDecimal.valueOf(a.getPeso())).collect(Collectors.toList());
        return calculaMediaAritimetica(listaIdades);
    }

    public ResultResponse calculaMediaPonderada(List<NotaPeso> valores){
        List<BigDecimal> valoresMedia = valores.stream().map(v -> v.getNotaXPeso()).collect(Collectors.toList());
        return calculaMediaAritimetica(valoresMedia);
    }

}
