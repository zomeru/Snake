import java.awt.Color;

import javax.swing.JFrame;

public class Game {

    Game() {
        JFrame obj = new JFrame();
        Snake snake = new Snake();
        obj.setBounds(10, 10, 905, 700);
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(snake);
    }

    public static void main(String[] args) {
        new Game();
//        JFrame obj = new JFrame("Snake");
//        Snake snake = new Snake();
//        obj.setBounds(10, 10, 905, 700);
//        obj.setBackground(Color.DARK_GRAY);
//        obj.setResizable(false);
//        obj.setVisible(true);
//        obj.setLocationRelativeTo(null);
//        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        obj.add(snake);
    }
}
