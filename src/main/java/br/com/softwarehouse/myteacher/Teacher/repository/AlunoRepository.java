package br.com.softwarehouse.myteacher.Teacher.repository;

import br.com.softwarehouse.myteacher.Teacher.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository< Aluno, Long> {
}
