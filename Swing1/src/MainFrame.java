import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 2269971701250845501L;
	private TextPanel textPanel;
	private ToolBar toolbar;
	public MainFrame(){
		super("Hello World");
		setSize(800, 700);
		setLayout(new BorderLayout());
		toolbar = new ToolBar();
		textPanel = new TextPanel();
		add(textPanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		toolbar.setTextPanel(textPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

