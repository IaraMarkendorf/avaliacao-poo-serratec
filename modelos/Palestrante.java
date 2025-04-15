package org.serratec.modelos;

public class Palestrante extends Pessoa {
	private String temaPalestra;
	
	public Palestrante(String nome, String cpf, String temaPalestra) {
		super(nome, cpf);
		this.temaPalestra = temaPalestra;
	}
	
	public String getTemaPalestra() {
		return temaPalestra;
	}
	
	@Override
    public void exibirDados() {
        System.out.println("Palestrante: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Tema da Palestra: " + getTemaPalestra());
    }
}
