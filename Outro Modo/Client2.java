package calculadorasocket;

import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client2 {

    static Conexao c;
    static Socket socket;

    public Client2() {
        try {
            socket = new Socket("localhost", 9600);
        } catch (Exception e) {
            System.out.println("Nao consegui resolver o host...");
        }
    }

    public static void main(String[] args) {
        Conexao c = new Conexao();
        new Client2();
        char tipo;
        char opcao = 'Q';
        Scanner input = new Scanner(System.in);
        System.out.println("***    Escolha uma opção   ***");
        System.out.println("T. para formato Time");
        System.out.println("D. para formato DayTime");
        System.out.println("Q. Sair");
        System.out.println("Operação: ");

        opcao = input.next().charAt(0);
    // Apagar dantas    System.out.println("escolhi a opcao:"+ opcao);
        while (opcao != 'Q') {
            if (opcao == 'D') {
                char tipoescolhido = 'D';
                Requisicao2 msgReq2 = new Requisicao2(tipoescolhido);
            // APAGAR DANTAS   System.out.println("Entrei no D, com msg.tipo:" + msgReq2.getTipo());                
                c.send(socket, msgReq2);

            }
            if (opcao == 'T') {
                char tipoescolhido = 'T';
                Requisicao2 msgReq2 = new Requisicao2(tipoescolhido);
                c.send(socket, msgReq2);
              

            }
            if (opcao == 'Q') {
               break;
            } 
            
                Resposta2 msgRep2 = (Resposta2) c.receive(socket);

                if (msgRep2.getTipo() == 1) {
                    System.out.println("Resultado = " + msgRep2.getResultadoDayTime());
                } else if (msgRep2.getTipo() == 2) {
                    System.out.println("Resultado = " + msgRep2.getResultadoTime());;
                } else {
                    System.out.println("Erro no Servidor");
                }            
            
        }

        try {
            socket.close();
        } catch (Exception e) {
            System.out.println("problemas ao fechar socket");
        }
    }
}
