package br.com.softwarehouse.myteacher.Teacher.resources;

import br.com.softwarehouse.myteacher.Teacher.responses.ResultResponse;
import br.com.softwarehouse.myteacher.Teacher.services.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class EstatisticaResource {

    @Autowired
    private EstatisticaService estatisticaService;

    @GetMapping(value = "/estatitica/media")
    public ResponseEntity<ResultResponse> calcularMediaAritimetica(@RequestBody List<BigDecimal> valores){
        return ResponseEntity.ok(estatisticaService.calculaMediaAritimetica(valores));
    }

    @GetMapping(value = "/estatitica/alunos/media")
    public ResponseEntity<ResultResponse> calcularMediaAritimeticaAlunos(){
        return ResponseEntity.ok(estatisticaService.calculaMediaAritimeticaAlunos());
    }
}
