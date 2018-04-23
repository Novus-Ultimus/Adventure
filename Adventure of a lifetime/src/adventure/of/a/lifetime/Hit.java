package adventure.of.a.lifetime;

import java.io.*;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import sun.audio.*;

public class Hit {

	public void na() {
		System.out.print("You have nothing to throw\n\n");
	}
	
	public void slenderpunch() throws InterruptedException {
System.out.print("As you go in to hit him you notice that he doesn't seem to react, upon coming "
        + "into contact with him you feel asthough it is smiling");
TimeUnit.SECONDS.sleep(1);
System.out.print("Upon come into contact with him you feels as though your arm is getting "
        + "drawn into a black hole, the \nstrength getting applied to your arm continues "
        + "to increases until finally you become incapable of fighting against it, getting sucked"
        + " in...\nEverything around you becomes dark, but you hear the muffuled screams of "
        + "thousands of people around you. There muffuled screams never to end");
	}

	public void slenderkick() throws InterruptedException {
System.out.print("As you go in to kick him you notice that he doesn't seem to react, upon coming "
        + "into contact with him you feel asthough it is smiling");
TimeUnit.SECONDS.sleep(1);
System.out.print("Upon come into contact with him you feels as though your leg is getting "
        + "drawn into a black hole, the \nstrength getting applied to your leg continues "
        + "to increases until finally you become incapable of fighting against it, getting sucked"
        + " in...\nEverything around you becomes dark, but you hear the muffuled screams of "
        + "thousands of people around you. There muffuled screams never to end");
	}

	public void housepunch() {
		System.out.print("You hit the boards on the house. Nothing happens, but your hand"
                        + " feels incredibly painful and you create a huge bang. From inside the "
                        + "house you hear something that sounds like a growl. You back away.\n");
	}

	public void housekick() throws InterruptedException {
		System.out.print("Why are you kicking a house, nothings going to happen if you "
                        + "kick the house, you know that right.");
                TimeUnit.SECONDS.sleep(2);
		System.out.print("The house then kicks you in the shin, nothing else happens\n");
	}

	public void waterfallpunch() {
		System.out.print("You punch the water with all your might, aiming right for its "
                        + "gut. You put all the strength into the punch\nand you muster all you"
                        + "strength into it throw you one punch. \nYou feel no resistence from "
                        + "the water yet you feel oddly satisfied\n");
	}

	public void waterfallkick() {
		// TODO Auto-generated method stub

	}

	public void waterfallthrow() throws InterruptedException {// New option, much WOW...
		System.out.print("You throw the piranha at the Villager, the Piranha wakes up mid"
                        + " fight and attacks the viillager, he was not prepared of it and gets"
                        + " eaten.\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("You have killed the Villager, DO YOU FEEL PROUD...\n");
		TimeUnit.SECONDS.sleep(2);
		System.out.print("You shouldn't because he had friends with him"
				+ ", and they seem a pissed. You pick up his pitch fork before"
                        + " running away\n");
		TimeUnit.SECONDS.sleep(4);
	}

	public void villagerkick() throws IOException, MalformedURLException, InterruptedException {
System.out.print("Why do you choose to tempt fate like so, do you activly seek death, or is it "
        + "simply curiosity.\n\n");
System.out.print("But lets get back to the adventure. You proceed to run at the Goku breaking "
        + "elderly Man without a care in the world.\nYou, with all the stength you can muster, "
        + "bring yourself into a spinning roundhouse kick.\n");
System.out.print("Aiming for the head of your enemy, you feel all the blood in you body pump at "
        + "full throttle increasing your senses\nto the max.\n");
        TimeUnit.SECONDS.sleep(1);
System.out.print("With this new hightend perseption you begin to see the Villager move, his aim,"
        + " to stab you with the pitchfork \nyou forgot he had. \nYou get pierced and hung by the "
        + "pitchfork, and get brought back to his Villager as a trophy of war.\n\n");
TimeUnit.SECONDS.sleep(2);
System.out.print("The rest of your existence is spent as a trophy on the old mans wall\n\n");
TimeUnit.SECONDS.sleep(2);
System.out.print("You Win, Perfect!!\n");
    playSound();
	}

	public void villagerpunch() throws InterruptedException, IOException {
	System.out.print("You stand before this Goku breaking man in Mortal Kombat prepared to give"
                + " your life for the fight, you know that\nthe entirety of this fight rests on this"
                + " single punch that you are about to throw.\n");
TimeUnit.SECONDS.sleep(1);
	System.out.print("Without give prior prepare to the old man, you come in running, "
                + "attempting to catch him by surprise\njust as you are about to suckerpunch in "
                + "the face you notice that the thing you had been running to was nothing but an\n");
TimeUnit.SECONDS.sleep(2);
	System.out.print("after image, the old man had already gotten behind you and was ready to");
TimeUnit.SECONDS.sleep(1);
	System.out.print(" deliver the finishing blow.\nBut you are smart, and decide that you are"
                + "going to take the elderly man with you into the next world, you take out the\n");
TimeUnit.SECONDS.sleep(1);
	System.out.print("piranha that you had in safekeeping(right nest to you heart), and fling");
TimeUnit.SECONDS.sleep(1);
	System.out.print(" it at the Villager, your to close\nto escape so you accept your fate with"
                + " the Villager.\n Your death come fast.\n");
TimeUnit.SECONDS.sleep(1);
	System.out.print("You have Died.\n\n");
        
        FFVII();
	}

	public void leatherfacepunch1() {
		//TODO
	}
	
	public void leatherfacekick1() {
		//TODO
            System.out.print("");
	}
	
	public void leatherstab1() throws InterruptedException {
            Random rnd = new Random(); 
            int value = rnd.nextInt(2);
		System.out.print("You go in to stab that which has clearly been stabbed before. \n");
                TimeUnit.SECONDS.sleep(1);
                if(value == 2){
                System.out.print("You wake up 3 hours later missing you face, you wonder what "
                        + "happened.\n");
                }
                else if(value == 1){
                    System.out.print("You wake up 2 hours later dead, you wonder how that works\n");
                }else if (value == 0){
                    System.out.print("You notice that all you have in your hand is a plastic "
                            + "butter knife, yet you continue you attack, but just before \ncoming"
                            + " in contact with your enemy a giant iron golem made of over "
                            + "9000 meter thick substance stronger than iron \nwith spike drills that"
                            + " self repairs, shoots lasers and is completely indestructable "
                            + "appears before you, \nand the butter knife of absolute awesomeness "
                            + "destroys it in one hit.(Piture refrence of knife)\n");
                    //Call Picture
                    TimeUnit.SECONDS.sleep(2);
                    System.out.print("It continues through the golem and straight into your enemy,"
                            + " where it explodes into over 9 thousand quintillion pieces because \nit's a"
                            + " butter knife, you regret every life decision you have made up until"
                            + " this point and accept your imminent demise\n\n");
                }
	}
	
        private void playSound() throws FileNotFoundException, IOException {
            
    // open the sound file as a Java input stream
    String PerfectFile = "Sounds\\Street Fighter II-You Win Perfect.wav";
    InputStream in = new FileInputStream(PerfectFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
        
        private void FFVII() throws FileNotFoundException, IOException {
            
    // open the sound file as a Java input stream
    String PerfectFile = "Sounds\\FFVII.wav";
    InputStream in = new FileInputStream(PerfectFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
        
}