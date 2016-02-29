import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class network_server {

	public static void main(String[] args) throws IOException {
		int num;
		@SuppressWarnings("resource")
		ServerSocket serv_socket = new ServerSocket(7777);
		Socket rep_serv = serv_socket.accept();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(rep_serv.getInputStream());
		num = sc.nextInt();
		
		int temp = num*2;
		PrintStream prt_str = new PrintStream(rep_serv.getOutputStream());
		prt_str.println(temp);

}
}