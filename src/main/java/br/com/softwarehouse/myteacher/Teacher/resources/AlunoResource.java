package br.com.softwarehouse.myteacher.Teacher.resources;

import br.com.softwarehouse.myteacher.Teacher.models.Aluno;
import br.com.softwarehouse.myteacher.Teacher.requests.AlunoRequest;
import br.com.softwarehouse.myteacher.Teacher.responses.AlunoResponse;
import br.com.softwarehouse.myteacher.Teacher.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AlunoResource {

    @Autowired
    private AlunoService alunoService;

    /**
     * Endpoint para lista todos os alunos cadastrados
     * @return List<Aluno>
     */
    @GetMapping(value = "/alunos", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Aluno>> listaAlunos() {
        return ResponseEntity.ok(alunoService.findAllAlunos());
    }

    /**
     * Endpoint para incluir o aluno
     */
    @PostMapping(value = "/alunos")
    public ResponseEntity<Long> inserirAluno(@RequestBody AlunoRequest alunoRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.createAluno(alunoRequest));
    }

    /**
     * Endpoint para excluir o aluno
     */
    @DeleteMapping(value = "/alunos/{id}")
    public ResponseEntity<Long> deleteAluno(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(alunoService.deleteAluno(id));
    }
}
