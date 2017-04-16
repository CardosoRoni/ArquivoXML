package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Notas {
	
	@XmlElementWrapper(name = "listaDeNotas")
	private List<Nota> notas;

}
