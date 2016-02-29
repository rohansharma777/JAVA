import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	private static final long serialVersionUID = -9023722755946279095L;
	private JTextArea textArea;
	
	public TextPanel(){
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	public void appendText(String s){
		textArea.append(s);
	}
}
