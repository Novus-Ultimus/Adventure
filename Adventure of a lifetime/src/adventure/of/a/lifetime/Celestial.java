package adventure.of.a.lifetime;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Celestial {
    
    private JLabel label;

    private List<BufferedImage> images;
    private int currentPic = 0;
    
//    private Timer timer = new Timer(1000, new ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            update();
//        }
//    });
    
    public void Celestia() throws InterruptedException {
		JFrame frame = new JFrame("Celestial Being");
		
		int height = 584;
		int width = 822;
		
		frame.setBounds(0, 0, height, width);
		frame.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images\\Celestial.png");
		frame.setIconImage(img.getImage());
		
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Images\\Celestial.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);

		TimeUnit.SECONDS.sleep(6);

		frame.dispose();
	}

    public void cat() throws InterruptedException {

		JFrame frame = new JFrame("Cat Pic");
		
		frame.setBounds(0, 0, 960, 540);
		frame.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images\\adorable cat.png");
		frame.setIconImage(img.getImage());
		
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Images\\\\adorable cat.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);

		TimeUnit.SECONDS.sleep(10);

		frame.dispose();
	}

    public void goku() throws InterruptedException {

		JFrame frame = new JFrame("Goku");
		
		frame.setBounds(0, 0, 585, 855);
		frame.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images\\goku_super_saiyan_blue_kaioken_x10.png");
		frame.setIconImage(img.getImage());
		
		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Images\\goku_super_saiyan_blue_kaioken_x10.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
                frame.getContentPane().setBackground(Color.pink);//Sets backround color(Does ablsolutly nothing)

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);

		TimeUnit.SECONDS.sleep(5);

		frame.dispose();
	}

    public void tenor() throws InterruptedException {
//
//		JFrame frame = new JFrame("Tenor");
//                
//                Image[] images;
//                images = new Image[73];
//                
//                
////                ImageIcon img = new ImageIcon("Images\\tenor gif\\frame_01_delay-0.05s.gif");//Frame Icon
////               frame.setIconImage(img.getImage());
//                
//                
////for (int i = 00; i <= 73; i++) {
////                    try {
////			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Images\\tenor gif\\frame_"+/*i*/"00"+"_delay-0.05s.gif")))));
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
////                    
////                TimeUnit.MILLISECONDS.sleep(50);
////                }
//		
//                
//		frame.setBounds(0, 0, 585, 855);
//		frame.setLayout(null);
//		
//                frame.getContentPane().setBackground(Color.orange);//Sets backround color(Does absolutely nothing)
//
//                frame.setVisible(true);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//                               try {
//			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Images\\tenor gif\\frame_"+/*i*/"00"+"_delay-0.05s.gif")))));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//                    
//                TimeUnit.MILLISECONDS.sleep(50);
//                
//                
//		TimeUnit.SECONDS.sleep(5);
//
//		frame.dispose();
	}

    public void ShowLabelImage() {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//                }
//
//                images = new ArrayList<>(72);
//                try {
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_00_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_01_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_02_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_03_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_04_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_05_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_06_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_07_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_08_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_09_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_10_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_11_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_12_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_13_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_14_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_15_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_16_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_17_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_18_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_19_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_20_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_21_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_22_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_23_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_24_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_25_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_26_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_27_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_28_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_29_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_30_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_31_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_32_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_33_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_34_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_35_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_36_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_37_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_38_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_39_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_40_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_41_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_42_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_43_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_44_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_45_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_46_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_47_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_48_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_49_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_50_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_51_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_52_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_53_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_54_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_55_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_56_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_57_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_58_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_59_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_60_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_61_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_62_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_63_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_64_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_65_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_66_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_67_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_68_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_69_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_70_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_71_delay-0.05s.png")));
//                    images.add(ImageIO.read(new File("Images\\tenor gif\\frame_72_delay-0.05s.png")));
//                } catch (IOException exp) {
//                    exp.printStackTrace();
//                }
//
//                
//                
//                label = new JLabel();
//                label.setHorizontalAlignment(JLabel.CENTER);
//                label.setVerticalAlignment(JLabel.CENTER);
//
////                Timer timer = new Timer(1000, new ActionListener() {
//                    
//                    
////                    @Override
////public void actionPerformed(ActionEvent e) {
////    if (e.getSource() == timer) {
////        for (int i=0; i<images.size(); i++) {
////            images.get(i).setImage(currentPic);
////        }
////    }
////}
////                    @Override
////                    public void actionPerformed(ActionEvent e) {
////                        currentPic++;
////                        if (currentPic >= images.size()) {
////                            currentPic = 0;
////                        }
////                        label.setIcon(new ImageIcon(images.get(currentPic)));
////                    }
////                });
//                
////                JButton switchPic = new JButton("Switch");
///**                switchPic.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        currentPic++;
//                        if (currentPic >= images.size()) {
//                            currentPic = 0;
//                        }
//                        label.setIcon(new ImageIcon(images.get(currentPic)));
//                        try {
//                            TimeUnit.MILLISECONDS.sleep(50);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Celestial.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                });**/
//                
//                JFrame frame = new JFrame("Testing");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setLayout(new BorderLayout());
//                frame.add(label);
////                frame.add(switchPic, BorderLayout.SOUTH);
////                switchPic.doClick();
//                frame.pack();
//                frame.setLocationRelativeTo(null);
//                frame.setVisible(true);
//            }
//        });
    }

}
