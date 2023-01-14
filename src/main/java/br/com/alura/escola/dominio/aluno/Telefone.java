package br.com.alura.escola.dominio.aluno;

public class Telefone {
    
    private String ddi;
    private String ddd;

    private String numero;

    public String getDdd() {
        return this.ddd;
    }

    public String getNumero() {
        return this.numero;
    }
    
    public Telefone(String ddd, String numero)
    {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Numero são obrigatórios.");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido.");
        }
        
        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido.");
        }

        this.ddd = ddd;
        this.numero = numero;
    }


}
