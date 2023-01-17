package br.com.alura.escola.dominio.aluno;

public interface CrifradorDeSenha {
	String cifrarSenha(String senha);
	boolean validarSenhaCrifrada(String senhaCifrada, String senha);
}
