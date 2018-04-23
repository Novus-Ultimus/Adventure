package adventure.of.a.lifetime;

import javax.swing.JFrame;

public class AdvFrame extends JFrame {

    public WannaGame game;
    int WIDTH = 750;
    int HEIGHT = 550;

    public AdvFrame(WannaGame WG) {
        super("Fun Time");
        this.game = WG;
        this.setSize(WIDTH, HEIGHT);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
