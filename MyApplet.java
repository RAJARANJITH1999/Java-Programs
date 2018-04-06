import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{
	Font font2;
	public void init()
	{
		font2 = new Font("bold and italic", Font.BOLD + Font.ITALIC, 24);
	}
	public void paint(Graphics g)
	{
		
		g.setFont(font2);
		g.drawString("INDIA WON BY 6 WICKETS",200,100);
	}
}

/*
<applet 
code="MyApplet.class"
width=200 height=200>
</applet>
*/