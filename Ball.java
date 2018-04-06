import javax.swing.*;
import java.awt.*;
public class Ball extends JPanel{
	int x=0,y=0,dx=1,dy=1;
	private void Move()
	{
		if(x<0)
		 	dx = 1;
		else if(x>=getWidth()-25)
		 	dx = -1;
		else if(y<0)
		 	dy = 1;
		else if(y>=getHeight()-25)
		 	dy = -1;
		x += dx;
		y += dy;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.GREEN);
		g2.fillOval(x,y,30,30);
	}
	public static void main(String[] args) throws InterruptedException{
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame =  new JFrame("MyJava Frame");
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(700,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ball b = new Ball();
		frame.add(b);
		frame.pack();
		while (true) {
			b.Move();
			b.repaint();
			Thread.sleep(3);
		}
	}
}