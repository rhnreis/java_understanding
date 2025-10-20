//applet em java

//pacote do nucleo java
import java.awt.Graphics;

//Pacote de extensao do java
import javax.swing.JFrame;

public class WellcomeApplet extends JFrame{

    //Construtor
    public WellcomeApplet(){
        super("Welcome to Java Programming");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    // Método paint: desenha texto na janela
    @Override

    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Welcome to Java Programming", 100, 100);
    }
    // Método main: ponto de entrada do programa
    public static void main(String[] args) {
        new WellcomeApplet();
    }
}
