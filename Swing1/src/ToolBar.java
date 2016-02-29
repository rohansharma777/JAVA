import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener {
	private static final long serialVersionUID = -2774364211932299911L;
	private JButton newgame, resume;
	private TextPanel textPanel;
	public ToolBar(){
		newgame = new JButton("Start New Game");
		resume = new JButton("Resume Game");
		resume.addActionListener(this);
		newgame.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(newgame);
		add(resume);
	}
	
	public void setTextPanel(TextPanel textPanel){
		this.textPanel = textPanel;;
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		if(clicked == newgame){
			textPanel.appendText("Starting new game!\n");
		}
		else if(clicked == resume){
			textPanel.appendText("Resuming game!\n");
		}
		
	}
}
