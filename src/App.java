import javax.swing.JFrame;
public class App {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay(); // whole game will be implemented inside this class
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("BrickBreakerGame");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}
