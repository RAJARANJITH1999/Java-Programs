import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet 
code="MyKeyApplet.class"
width=800 height=800>
</applet>
*/
public class MyKeyApplet extends Applet implements KeyListener
{
	int x,y;
	public void init()
	{
		this.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent ke)
	{
		showStatus("key Down");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("key up");
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("key typed:"+ke.getKeyChar());
	}
}

