import java.awt.*;
import java.applet.*;

public class MyApp extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7322728501837966316L;
	public void init(){
		setBackground(Color.yellow);
	}
public void paint(Graphics g){
    g.drawString("Hello World", 50, 150);
}
}
