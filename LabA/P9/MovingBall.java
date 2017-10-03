import java.applet.*;
import java.awt.*;

/*<applet code = "MovingBall.class" width = "400" height = "400"></applet>*/

public class MovingBall extends Applet implements Runnable{
    int x,y,dx,dy;
    Thread t;
    boolean flag;

    public void init() {
        setBackground(Color.blue);
        x=100;
        y=20;
        dx=10;
        dy=10;
    }

    public void start(){
        flag = true;
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }

    public void run(){
        while (flag) {
            Rectangle r = new Rectangle();
            r.width = dx;
            r.height= dy;
            r.setBounds(x,y,dx,dy);

            if ((x+dx <= 0)||(x+dx >= r.width)){
                dx = -dx;
            }
            if ((y+dy <= 0)||(y+dy >= r.height)){
                dy = -dy;
            }

            x+= dx;
            y+= dy;
        
            repaint();

            try {
                Thread.sleep(300);
            }
            catch (InterruptedException err) {}

        }
    }

    public void stop(){
        t=null;
        flag=false;
    }
}