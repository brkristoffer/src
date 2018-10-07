import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class MyButton extends JButton implements ActionListener {
	private String text1;
	private String text2;
	private Color color1;
	private Color color2;

	public MyButton(String textIn1, String textIn2, Color colorIn1, Color colorIn2){
		super(textIn1);

		addActionListener(this);
		text1 = textIn1;
		text2 = textIn2;
		color1 = colorIn1;
		color2 = colorIn2;
		setBackground(color1);
		setOpaque(true);
		setBorderPainted(false);
	}

	private void toggleState(){
		if (getText()==text1) {
			setText(text2);
			setBackground(color2);
		}
		else if (getText()==text2) {
			setText(text1);
			setBackground(color1);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e){
		toggleState();
	}
}
