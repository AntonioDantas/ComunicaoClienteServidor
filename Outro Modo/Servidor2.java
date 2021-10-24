/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasocket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor2 {
    static ServerSocket serversocket;
    static Socket client_socket;
    static Conexao c;
    static String msg;
    
    public Servidor2() {
        try {
            serversocket = new ServerSocket(9600, 5);
            System.out.println("Criei o Servidor2 Socket");
        } catch (Exception e) {
            System.out.println("Nao criei o Servidor2 socket...");
        }
    }

    public static void main(String args[]) {
        Requisicao2 msgReq2;
        Resposta2   msgRep2;
        int visits=0;
        new Servidor2();
        c = new Conexao();
        while (true) {
            if (connect()) { 
               msgReq2 = (Requisicao2)c.receive(client_socket);
               
               char op = msgReq2.getTipo();
               // APAGAR DANTAS System.out.println("Servidor recebeu msgReq2.tipo:" + msgReq2.getTipo());                
               msgRep2 = new Resposta2();
               
               switch(op)
               {
               	   case 'D':
                        // APAGAR DANTAS System.out.println("Entrei no CASE D, com msg.tipo:" + msgReq2.getTipo());  
               	        msgRep2.setTipo(1);
                        String dataAtual = new java.text.SimpleDateFormat("EEEE, MMMM, dd, YYYY, hh:mm:ss-zzz").format(new java.util.Date());                        
               	        msgRep2.setResultadoDayTime(dataAtual);
               	        break;
               	   case 'T':
                        // APAGAR DANTAS System.out.println("Entrei no CASE T, com msg.tipo:" + msgReq2.getTipo());                       
               	        msgRep2.setTipo(2);
                        Date data = new Date();
                        long numeroData = data.getTime();                        
               	        msgRep2.setResultadoTime(numeroData);
               	        break;

               }
               // APAGAR DANTAS System.out.println("Sai do swithc com resultados:" + msgRep2.getResultadoDayTime() + " " + msgRep2.getResultadoTime());
               c.send(client_socket, msgRep2);
               // APAGAR DANTAS System.out.println("Sai do swithc com resultados:" + msgRep2.getTipo());               
            } else {
                try {
            	    serversocket.close();
            	    break;
                } catch (Exception e) {
                    System.out.println("Nao desconectei...");
                }
            }
        } 
    }

    static boolean connect() {
        boolean ret;
        try {
            client_socket = serversocket.accept();
		    return true;
		} catch (Exception e) {
			System.out.println("Erro de connect..." + e.getMessage());
			return false;
        }
    }	
}
