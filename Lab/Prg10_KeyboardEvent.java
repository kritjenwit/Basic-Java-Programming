import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "KeyboardEvent" width = 400 height = 400> </applet> */

public class Prg10_KeyboardEvent extends implements KeyListener{
    String str = "";
    
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    
    public void keyTyped(KeyEvent e){
        str += e.getKeyChar();
        repaint(0);
    }
    
    public void keyPressed(KeyEvent e){
        showStatus("KEY PRESS");
    }
    
    public void keyReleased(KeyEvent e){
        showStatus("KEY RELEASE");
    }
    
    public void paint(Graphics g){
        g.drawString(str,15,15);
    }
    
}