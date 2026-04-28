package Q12;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");

        frame.setSize(300, 200);
        frame.setLocation(100, 50); // X=100, Y=50

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
