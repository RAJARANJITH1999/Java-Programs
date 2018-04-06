import java.applet.*;
import java.awt.*;
 
public class ShapeApplet extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.BLACK);    //setting background as BLACK
        g.setColor(new Color(255,255,255));
        g.drawLine(10, 10, 400, 10);  //g.drawLine(x1, y1, x2, y2);     
        g.setColor(Color.red);
        g.drawRect(30,30,200,100);    //g.drawRect(x, y, w, h);
        g.setColor(new Color(80,10,124));
        g.drawOval(30,30,200,100);    //g.drawOval(x, y, w, h);
        g.setColor(Color.BLUE);
        g.drawArc(100, 20, 300, 300, 0, 90);    //g.drawArc(x, y, w, h, Starting Angle, Further Angle);
    }   
}
/*
<applet code="ShapeApplet" width="500" height="200"></applet>
*/