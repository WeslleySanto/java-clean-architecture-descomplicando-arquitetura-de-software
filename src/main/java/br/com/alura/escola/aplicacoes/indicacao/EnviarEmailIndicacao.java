package br.com.alura.escola.aplicacoes.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	void enviarPara(Aluno indicado);
}
