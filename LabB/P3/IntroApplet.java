import java.awt.*;
import java.applet.*;

/* <applet code = "IntroApplet.class" width = "400" height = "400" ></applet> */

public class IntroApplet extends Applet{
    String str;

    public void init(){
        str = "Krit";
        str = "Welcome " +str+ " to Java";
    }

    public void paint(Graphics g){
        g.drawString(str,10,10);
    }

}