import java.awt.*;
import java.applet.*;

/* <applet code = "AppletParam.class" width = "400" height = "400" ></applet> */

public class AppletParam extends Applet{
    String str="";
    public void init(){
        str = getParameter("string");        
        str = "Hello " +str+ " Welcome to Java";
    }

    public void paint(Graphics g){
        g.drawString(str,10,10);
    }

}