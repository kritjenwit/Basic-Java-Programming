import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "MouseEvents.class" width = "400" height = "400"></applet>*/

public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
      String msg=" ";
      public void init()
      {
            addMouseListener(this);
            addMouseMotionListener(this);
      }
    public void paint(Graphics g)
      {
            g.drawString(msg,20,20);
      }
      public void mousePressed(MouseEvent me)
      {
            msg=" MOUSE PRESSED ";
            repaint();
      }
      public void mouseClicked(MouseEvent me)
      {
           msg=" MOUSE CLICKED";
            repaint();
      }
    public void mouseEntered(MouseEvent me)
      {
            msg=" MOUSE ENTERED";
            repaint();
      }
    public void mouseExited(MouseEvent me)
      {
            msg=" MOUSE EXITED";
            repaint();
      }
    public void mouseReleased(MouseEvent me)
      {
            msg=" MOUSE RELEASED";
            repaint();
      }
      public void mouseMoved(MouseEvent me)
      {
            msg=" MOUSE MOVED";
            repaint();
      }
      public void mouseDropped(MouseEvent me)
      {
            msg=" MOUSE DROPPED";
            repaint();
      }
      public void mouseDragged(MouseEvent me)
      {
            msg=" MOUSE DRAGGED";
        repaint();
      }
}
