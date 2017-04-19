package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {
	@XmlElementWrapper(name = "listaDeNotas")
	private List<Nota> notas;

	public List<Nota> getNotas() {
		return notas;
	}

	@XmlAttribute
	private String nome;

	public Disciplina() {
	}

	public Disciplina(List<Nota> notas, String nome) {
		super();
		this.notas = notas;
		this.nome = nome;
	}

	public Disciplina(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
