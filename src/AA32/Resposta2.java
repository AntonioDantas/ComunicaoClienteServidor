/*
 * DISCIPLINA: SISTEMAS DISTRIBUIDOS 
 * ATIVIDADE AA3.2
 * PROFESSOR: Dr. Helio Crestana Guardia
 * TUTOR: Doutorando Igor Maldonado Floôr
 *  
 * ALUNO: MARCIO ROGERIO PORTO - RA 581020
 */

package AA32;

public class Resposta2 implements java.io.Serializable
{
	private int tipo;
	private long resultadoTime;
	private String resultadoDayTime;        
	
	public Resposta2(int tipo, String resultadoDayTime, long resultadoTime)
	{
		this.tipo = tipo;
		this.resultadoDayTime = resultadoDayTime;
		this.resultadoTime = resultadoTime;                
	}
	public Resposta2()
	{
		// nao faz nada
	}
	public int getTipo()
	{
		return tipo;
	}
	public String getResultadoDayTime()
	{
		return resultadoDayTime;
	}

        public long getResultadoTime()
	{
		return resultadoTime;
	}
        
        public void setTipo(int novoTipo)
	{
		tipo = novoTipo;
	}
	public void setResultadoDayTime(String novoDayTime)
	{
		resultadoDayTime = novoDayTime;
	}
	public void setResultadoTime(long novoTime)
	{
		resultadoTime = novoTime;
	}
}