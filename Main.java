//import java.awt.Color;
//import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main extends JFrame {

  ImageIcon iconPEDRA = new ImageIcon(getClass().getResource("PEDRA.png"));
  ImageIcon iconPAPEL = new ImageIcon(getClass().getResource("PAPEL.png"));
  ImageIcon iconTESOURA = new ImageIcon(getClass().getResource("TESOURA.png"));

  JLabel lPEDRA = new JLabel(iconPEDRA);
  JLabel lPAPEL = new JLabel(iconPAPEL);
  JLabel lTESOURA = new JLabel(iconTESOURA);

  int posPEDRAx = 05;
  int posPEDRAy = 10;
  int posPAPELx = 100;
  int posPAPELy = 10;
  int posTESOURAx = 190;
  int posTESOURAy = 00;

  public Main() {
    editarJanela();
    editarComponentes();
  }

  public void editarComponentes() {
    lPEDRA.setBounds(posPEDRAx, posPEDRAy, 100, 84);
    lPAPEL.setBounds(posPAPELx, posPAPELy, 100, 84);
    lTESOURA.setBounds(posTESOURAx, posTESOURAy, 90, 100);
  }

  public void editarJanela() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(275, 120);
    setLocationRelativeTo(null);
    setVisible(true);
    add(lPEDRA);
    add(lPAPEL);
    add(lTESOURA);
    setLayout(null);
    
  }

  public static void main(String[] args) {
    new Main();

  }
}