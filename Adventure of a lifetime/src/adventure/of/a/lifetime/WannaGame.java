package adventure.of.a.lifetime;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WannaGame implements ActionListener {

    private static JFrame frame = new JFrame("Question Corner");
    private static JButton Yes = new JButton("Yes"), No = new JButton("No");
    JLabel label = new JLabel("<html>You in the back that's staring off into space,<br/> yes i'm talking to you<br/>Wanna play a game?<html>", SwingConstants.CENTER);

    int height = 300;
    int width = 200;

    public WannaGame Frame() {
        frame.setBounds(0, 0, height, width);
        frame.setLayout(null);

        label.setBounds(0, 0, height, 50);
        label.setFont(new Font("イワタ中ゴシック", 1, 10));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        JPanel ButtonPad = new JPanel();
        GridLayout panelLayout = new GridLayout(1, 2);
        ButtonPad.setLayout(panelLayout);
        ButtonPad.setBounds(0, 65, height - 15, 100);

        ButtonPad.add(Yes);
        Yes.addActionListener(this);
        ButtonPad.add(No);
        No.addActionListener(this);

        frame.add(label);
        frame.add(ButtonPad);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        return null;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Yes) {
            WannaGame WG = new WannaGame();
            AdvFrame game = new AdvFrame(WG);
        } else if (e.getSource() == No) {
            JOptionPane.showMessageDialog(frame, "Are you sure, not that it matters to me...");
            frame.setVisible(false); //you can't see me!
            frame.dispose();
        }
    }
}
