/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasocket;

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