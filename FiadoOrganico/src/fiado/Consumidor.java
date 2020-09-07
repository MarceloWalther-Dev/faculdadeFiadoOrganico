package fiado;

import java.util.ArrayList;

public class Consumidor {
	
	private String nome;
	private ArrayList<Integer> fiados;
	private String telefone;
	
	
	
	public Consumidor(String nome, ArrayList<Integer> fiados, String telefone) {
		
		this.nome = nome;
		this.fiados = fiados;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void registraFiado(int valor) {
		this.fiados.add(valor);
	}


	public ArrayList<Integer> getFiados() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return fiados;
	}


	
	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void adiciona(ArrayList<Integer> fiados, int valor) {
		fiados.add(valor);
	}
		
}
