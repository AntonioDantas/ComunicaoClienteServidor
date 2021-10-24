/*
 * DISCIPLINA: SISTEMAS DISTRIBUIDOS 
 * ATIVIDADE AA3.2
 * PROFESSOR: Dr. Helio Crestana Guardia
 * TUTOR: Doutorando Igor Maldonado Floôr
 *  
 * ALUNO: MARCIO ROGERIO PORTO - RA 581020
 */

package AA32;

public class Requisicao2 implements java.io.Serializable
{

	private char tipo;
	
	public Requisicao2(char tipo)
	{
		this.tipo = tipo;
	}
	
	public char getTipo()
	{
		return tipo;
	}
	
}