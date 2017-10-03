import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "KeyBoardEvents.class" width = "400" height = "400"></applet>*/

public class KeyBoardEvents extends Applet implements KeyListener
{
    String msg=" ";
    public void init()
    {
        addKeyListener(this);
        requestFocus();
    }
    public void keyTyped(KeyEvent ke)
    {
        msg=msg+ke.getKeyChar();
        repaint();
    } 
   public void paint(Graphics g)
    {
        g.drawString(msg,100,50);
    } 
    public void keyReleased(KeyEvent ke)
    {
        msg="KEY RELEASED : ";
        repaint();
    }
    public void keyPressed(KeyEvent ke)
    {
        int k=ke.getKeyCode();
        switch(k)
        {
            case KeyEvent.VK_F1:msg="F1";
                break;
            case KeyEvent.VK_F2:msg="F2";
                break;
            case KeyEvent.VK_F3:msg="F3";
                break;
            case KeyEvent.VK_PAGE_UP:msg="Pageup";
                break;
            case KeyEvent.VK_PAGE_DOWN:msg="Pagedown";
                break;
            case KeyEvent.VK_LEFT:msg="Left arrow";
                break;
            case KeyEvent.VK_RIGHT:msg="Right arrow";
                break;
        }
        repaint();
    }
	
}
