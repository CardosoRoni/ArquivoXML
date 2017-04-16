package test;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

import converter.TurmaXmlConverter;
import model.Turma;

public class TurmaConverterTest {
	public static void main(String[] args) {
		
	}

	@Test

	public void deveConverter() {
	
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(new File("D:/topicos banco de dados/boletimTurma.xml"));
		assertNotNull(turma);
	           System.out.println("boletimTurma.xml  "); 
	     
	         
	
	}
	           
}
