import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class network_client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num,temp;
		try{
			@SuppressWarnings("resource")
			Socket socket = new Socket("127.0.0.1", 7777);
			@SuppressWarnings("resource")
			Scanner sc_serv = new Scanner(socket.getInputStream());
			PrintStream prstr = new PrintStream(socket.getOutputStream());
			System.out.println("Enter any no.");
			num = sc.nextInt();
			prstr.println(num);
			temp = sc_serv.nextInt();
			System.out.println(temp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
