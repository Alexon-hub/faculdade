package br.com.softwarehouse.myteacher.Teacher.services;

import br.com.softwarehouse.myteacher.Teacher.models.Aluno;
import br.com.softwarehouse.myteacher.Teacher.repository.AlunoRepository;
import br.com.softwarehouse.myteacher.Teacher.requests.AlunoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAllAlunos(){
        return alunoRepository.findAll();
    }

    public Long createAluno(AlunoRequest alunoRequest) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoRequest.getNome());
        return alunoRepository.save(aluno).getId();
    }

    public Long deleteAluno(Long id) {
        if(alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
        }
        return id;
    }
}
