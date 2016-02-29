import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class get_site_name {

	public static void main(String[] args) throws IOException {
		URL obj = new URL("http://www.gtu.ac.in/");
		URLConnection con = obj.openConnection();
	int l	=con.getContentLength();
	System.out.println(l);
	if(l==0){
		System.out.println("End of file");
	}else{
		int ch;
		InputStream in = con.getInputStream();
		while( (ch =in.read())!=-1){
			System.out.print((char)ch);
		}
		
	}

				
			}
	}


