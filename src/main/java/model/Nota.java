package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Nota {

	@XmlAttribute
	private String valor;

	public Nota() {
	}

	public Nota(String valor) {
		super();
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
