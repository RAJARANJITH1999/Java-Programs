import java.applet.*;
import java.awt.*;
 
public class ShapeFillApplet extends Applet
{
    public void paint(Graphics g)
    {
			int x[] = { 70, 150, 190, 80, 100 };
		int y[] = { 80, 110, 160, 190, 100 };
		g.drawPolygon (x, y, 5);
	  
		int x1[] = { 210, 280, 330, 210, 230 };
		int y1[] = { 70, 110, 160, 190, 100 };
		g.fillPolygon (x1, y1, 5);
	
        setBackground(Color.WHITE);    //setting background as BLACK
        g.setColor(Color.YELLOW);
        g.drawLine(163, 398, 503, 510);  //g.drawLine(x1, y1, x2, y2);     
        g.setColor(Color.red);
        g.fillRect(791,390,200,100);    //g.fillRect(x, y, w, h);
        g.setColor(new Color(80,10,124));
        g.fillOval(390,450,200,100);    //g.fillOval(x, y, w, h);
        g.setColor(Color.BLUE);
        g.fillArc(400, 540, 300, 300, 0, 90);    //g.fillArc(x, y, w, h, Starting Angle, Further Angle);
    }   
}
/*
<applet code="ShapeFillApplet" width="500" height="200"></applet>
*/