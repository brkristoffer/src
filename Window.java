import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Window extends JFrame{

	// private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		new Window();
		System.out.println(args[0]);
	}

	private Window() {
		super("Kristoffer Brown");

		setVisible(true);
		setSize(400, 100);
		Container container = getContentPane();
		container.setBackground(Color.pink);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		MyButton onOff = new MyButton("on", "off", Color.white, Color.cyan);
		MyButton runStop = new MyButton("run", "stop", Color.green, Color.red);
		add(onOff);
		add(runStop);
	}
}
