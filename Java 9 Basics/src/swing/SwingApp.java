package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingApp
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new SwingApp();
			}
		});
	}
	
	public SwingApp()
	{
		JFrame jFrame=new JFrame("Swing Demo App");
		jFrame.setLayout(new FlowLayout());
		jFrame.setSize(640, 480);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jLabel=new JLabel("Label");
		JButton jButton=new JButton("Press");
		
		jFrame.add(jLabel);
		jLabel.add(jButton);
		
		jFrame.setVisible(true);
	}
}