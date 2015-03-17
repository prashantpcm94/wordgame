package javaapplication3;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class game extends Applet implements Runnable,KeyListener
{
    Thread t=null;
    Random r=new Random();
    public void init()
    {
        setBackground(Color.black);
        setForeground(Color.RED);
        t=new Thread(this);
        t.start();        
    } 
    public void keyReleased(KeyEvent ke){}
     public void keyTyped(KeyEvent ke){}
    int x=0;
    int[] a=new int[10];
    int[] b=new int[10];
    public void start()
    {
      addKeyListener(this);
      requestFocus();        
    }
    int sc=0;
    public void run()
    {
        try
        {
            for(;;)
            {
                if(y==0)
                {
                    for(int i=0;i<10;i++)
                    a[i]=r.nextInt(26)+1;
                }
                if(z==10)
                {
                    for(int i=0;i<10;i++)
                    a[i]=r.nextInt(26)+1;
                }
               repaint();
               Thread.sleep(1000);
              
            }
        }
        catch(InterruptedException e){}
    }
    int d=50;int y=0,z=0;
    boolean e=true;
    public void f(String s,Graphics g)
    {
        d+=20;
        if(e)
        {
            g.drawString(s, d, 50+y);
            e=false;
        }
        else
        {
            g.drawString(s, d, 30+y);
            e=true;
        }
      
    }
    public void g(int n)
    {
        for(int i=0;i<10;i++)
        {
            if(a[i]==n)
            {
                a[i]=0;
                sc+=5;
                z++;
                repaint();
                return;
            }
        }
        sc-=5;
         repaint();
    }
    public void keyPressed(KeyEvent ke)
    {
        int k=ke.getKeyCode();
        switch(k)
        {
            case KeyEvent.VK_A:g(1);break;
            case KeyEvent.VK_B:g(2);break;
            case KeyEvent.VK_C:g(3);break;
            case KeyEvent.VK_D:g(4);break;
            case KeyEvent.VK_E:g(5);break;
            case KeyEvent.VK_F:g(6);break;
            case KeyEvent.VK_G:g(7);break;
            case KeyEvent.VK_H:g(8);break;
            case KeyEvent.VK_I:g(9);break;
            case KeyEvent.VK_J:g(10);break;
            case KeyEvent.VK_K:g(11);break;
            case KeyEvent.VK_L:g(12);break;
            case KeyEvent.VK_M:g(13);break;
            case KeyEvent.VK_N:g(14);break;
            case KeyEvent.VK_O:g(15);break;
            case KeyEvent.VK_P:g(16);break;
            case KeyEvent.VK_Q:g(17);break;
            case KeyEvent.VK_R:g(18);break;
            case KeyEvent.VK_S:g(19);break;
            case KeyEvent.VK_T:g(20);break;
            case KeyEvent.VK_U:g(21);break;
            case KeyEvent.VK_V:g(22);break;
            case KeyEvent.VK_W:g(23);break;
            case KeyEvent.VK_X:g(24);break;
            case KeyEvent.VK_Y:g(25);break;
            case KeyEvent.VK_Z:g(26);break;                            
        }
    }
    public void paint(Graphics g)
    {
        d=0;
        y+=50;
        if(y>500)
        {
            y=0;
        }
        g.drawString("SCORE=>"+sc, 250, 400);
        for(int i=0;i<10;i++)
        {
            switch(a[i])
            {
                case 1:f("A",g);break;
                case 2:f("B",g);break;
                case 3:f("C",g);break;
                case 4:f("D",g);break;
                case 5:f("E",g);break;
                case 6:f("F",g);break;
                case 7:f("G",g);break;
                case 8:f("H",g);break;
                case 9:f("I",g);break;
                case 10:f("J",g);break;
                case 11:f("K",g);break;
                case 12:f("L",g);break;
                case 13:f("M",g);break;
                case 14:f("N",g);break;
                case 15:f("O",g);break;
                case 16:f("P",g);break;
                case 17:f("Q",g);break;
                case 18:f("R",g);break;
                case 19:f("S",g);break;
                case 20:f("T",g);break;
                case 21:f("U",g);break;
                case 22:f("V",g);break;
                case 23:f("W",g);break;
                case 24:f("X",g);break;
                case 25:f("Y",g);break;
                case 26:f("Z",g);break;
                default :f("",g);break;
            }
        }
    }
 
}
