package org.serratec.modelos;

public class Participante extends Pessoa {
	private String email;
	
	public Participante(String nome, String cpf, String email) {
		super(nome, cpf);
		this.email = email;
	}



	public String getEmail() {
		return email;
	}

	
	@Override
	public void exibirDados() {
		System.out.println("Participante: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Email: " + getEmail());
	}

}
