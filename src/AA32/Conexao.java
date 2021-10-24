package AA32;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Conexao {
	public static void send(Socket socket, Object o) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(o);

		} catch (Exception e) {
			System.out.println("Deu pau no ObjectOutputStream");
		}
	}

	public static Object receive(Socket socket) {
		ObjectInputStream in;
		Object o=null;
		try {
			in = new ObjectInputStream(socket.getInputStream());
			o = in.readObject();
		} catch (Exception e) {
			System.out.println("Excecao na leitura do InputStream: " + e);
		}
		return o;
	}
}
