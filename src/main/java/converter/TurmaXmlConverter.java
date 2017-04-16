package converter;

import java.io.File;


import model.Aluno;
import model.Alunos;
import model.Disciplina;
import model.Disciplinas;
import model.Nota;
import model.Notas;
import model.Turma;

public class TurmaXmlConverter {

	private ConverterXml<Turma> converterTurma = new ConverterXml<Turma>(Turma.class, Aluno.class, Alunos.class,
			Disciplinas.class, Disciplina.class, Notas.class, Nota.class);

	public Turma toObject(File XMLfile) {
		return converterTurma.deXmlParaObject(XMLfile);
	}
	
}
