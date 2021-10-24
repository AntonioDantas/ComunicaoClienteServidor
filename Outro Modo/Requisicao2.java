/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasocket;

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