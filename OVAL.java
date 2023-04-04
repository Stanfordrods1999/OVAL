import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.Math;
public class OVAL extends JFrame implements MouseListener,MouseMotionListener
{
    TextField xc=new TextField();
    TextField yc=new TextField();
    int x=0;
    int y=0;
    public OVAL()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
        xc.setEditable(false);
        yc.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseMoved(MouseEvent e)
    {
       
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g=getGraphics();
        System.out.println("DRAGGED");
        g.drawLine(x,y,e.getX(),e.getY());
        x=e.getX();
        y=e.getY();
    }
    public void mouseEntered(MouseEvent e)
    {
       
    }
    public void mouseExited(MouseEvent e)
    {
       
    }
     public void mousePressed(MouseEvent e) {  
         
    }  
    public void mouseReleased(MouseEvent e) {  
         
    }  
    public void mouseClicked(MouseEvent e)
    {
        Graphics g1=getGraphics();
        int r;int g;int b;
        Random random=new Random();
        r=random.nextInt(255);
        g=random.nextInt(255);
        b=random.nextInt(255);
        System.out.println(r+""+g+""+b);
        Color c=new Color(r,g,b);
        g1.setColor(c);
        int x=e.getX();
        int y=e.getY();
        xc.setText(""+x);
        yc.setText(""+y);
        add(xc);
        add(yc);
        revalidate();
        g1.fillOval(x,y,50,50);
    }
    public static void main(String args[])
    {
        OVAL ob=new OVAL();
    }
}