package model;

public class Socio {

	private String nome;
	private String localidade;
	int contacto;
	
	public Socio(String nome, String localidade, int contacto) {
		super();
		this.nome = nome;
		this.localidade = localidade;
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public int getContacto() {
		return contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	
	
}
