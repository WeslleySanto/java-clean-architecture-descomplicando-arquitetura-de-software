package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	public static void main(String[] args) {
		String nome = "Fulano";
		String cfp = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunoEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cfp, email));
	}
}
