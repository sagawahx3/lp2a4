package servlet;

import java.util.HashMap;

public final class Agenda {
	
    private static Agenda instance;
    HashMap<String,Contato> contatos = new HashMap<String,Contato>();

	public void addContato(String nome, Contato contato) {
	contatos.put(nome,contato);
	}
	
	public static Agenda getAgenda() {
        if (instance == null) {
            instance = new Agenda();
        }
        return instance;
    }
	
	public HashMap<String,Contato> getContatos() {
        if (contatos == null) {
            contatos = new HashMap<String,Contato>();
        }
        return this.contatos;
    }
	

}