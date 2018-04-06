import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet 
code="MyMouseApplet.class"
width=800 height=800>
</applet>
*/
public class MyMouseApplet extends Applet implements MouseMotionListener
{
	int x,y;
	public void init()
	{
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("("+x+","+y+")",x,y);
	
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		//dummy method;
	}
}

