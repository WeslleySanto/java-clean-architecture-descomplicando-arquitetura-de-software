package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunoEmMemoria repositorio = new RepositorioDeAlunoEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		String nome = "Fulano";
		String email = "fulano@email.com";
		String cpf = "123.456.789-00"; 
		
		MatricularAlunoDto dados = new MatricularAlunoDto(nome, cpf, email);
		
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF(cpf));
		assertEquals("Fulano", nome);
		assertEquals("123.456.789-00", cpf);
		assertEquals("fulano@email.com", email);
	}

}
