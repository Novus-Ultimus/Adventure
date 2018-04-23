package adventure.of.a.lifetime;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;

public class gif extends JPanel {
//
//    private List<Icon> list = new ArrayList<Icon>();
//    private JLabel labels = new JLabel();
//    private Timer timer = new Timer(1000, new ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            update();
//        }
//    });
//
//    public gif() {
//        this.setLayout(new GridLayout(1, 0));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_00_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_01_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_02_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_03_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_04_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_05_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_06_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_07_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_08_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_09_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_10_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_11_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_12_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_13_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_14_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_15_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_16_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_17_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_18_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_19_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_20_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_21_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_22_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_23_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_24_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_25_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_26_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_27_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_28_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_29_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_30_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_31_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_32_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_33_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_34_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_35_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_36_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_37_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_38_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_39_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_40_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_41_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_42_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_43_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_44_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_45_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_46_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_47_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_48_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_49_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_50_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_51_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_52_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_53_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_54_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_55_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_56_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_57_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_58_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_59_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_60_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_61_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_62_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_63_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_64_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_65_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_66_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_67_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_68_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_69_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_70_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_71_delay-0.05s.png"));
//                    list.add(new ImageIcon("Images\\tenor gif\\frame_72_delay-0.05s.png"));
//        for (Icon icon : list) {
//            JLabel label = new JLabel(icon);
//            labels.add(label);
//            this.add(label);
//        }
//        timer.start();
//    }
//
//    private void update() {
//        Collections.shuffle(list);
//        labels.setIcon(list.get(0));
//    }
//
//    public void display() {
//        JFrame f = new JFrame("And he Winner is...");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.add(this);
//        f.pack();
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//
//            @Override
//            public void run() {
//                new gif().display();
//            }
//        });
//    }
}