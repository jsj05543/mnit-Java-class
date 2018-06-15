package mnit16;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample2 extends Frame
{
   private Label lb;

   public static void main(String[] args)
   {
      Sample2 sm = new Sample2();
   }
   public Sample2()
   {
      super("サンプル");

      lb = new Label("ようこそ。");

      add(lb);

      lb.setForeground(Color.BLUE);
      lb.setFont(new Font("Serif", Font.BOLD, 24));

      addWindowListener(new SampleWindowListener());

      setSize(250, 200);
      setVisible(true);
   }

   class SampleWindowListener extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         System.exit(0);
      }
   }
}
