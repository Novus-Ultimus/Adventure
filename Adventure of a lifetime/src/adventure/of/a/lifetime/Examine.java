package adventure.of.a.lifetime;

import java.util.concurrent.TimeUnit;

public class Examine {
    
    Celestial ct = new Celestial();

	public void start() throws InterruptedException {
		System.out.print("It's an empty field what else do you want me to say.\n");
		TimeUnit.SECONDS.sleep(2);
		System.out.print("If you were wondering, it's a low cut field without much growing, it's void of flowers and animals alike.\nYou can't"
				+ " even hear the sound of insects in the distance, it's actually quite creepy.\n");
	}

	public void Slenderman() throws InterruptedException {
		System.out.print("He appears to be a tall, thin figure wearing a black suit and a blank face. \n"
				+ " Behind him you feel like you can see something, but your eyes just can't see them... and his face, \n"
				+ " it's...it's...You just don't know what it is, but you feel as though you can see something, \n"
				+ " but eveytime you look at it you feel a searing pain in your head as though you can't \n"
				+ " procces what you are looking at, as though you aren't allowing yourself to understand it, \n"
				+ " and you feel a incredible amount of fear from it ");

		TimeUnit.SECONDS.sleep(10);

		System.out.print(
				"\n \n \nHe seems to be taking offence to you staring at him, and as he 'stares' back at you the world \n"
						+ "around start to become static like an old tv around you and your vision gets dark...");

		TimeUnit.SECONDS.sleep(10);

		System.out.print("\n \n \nYou wake up in a dark forest, before you sits a single piece of paper \n\n");
	}

	public void house() throws InterruptedException {
		System.out.print("The house is boarded up, what else do you want me to tell you, it's color.\n");
		TimeUnit.SECONDS.sleep(2);
		System.out.print("It's white if you where curious. Has 2 floors, 4 windows on the first floor, 6 on the second\n"
			+ "There is a foul smell coming from the house, and you can hear a groaning sound coming from"
			+ " it, their also seems to be somthing alive in the house.\n");
	}

	public void waterfall() {
		System.out.print("Inside the waterfall you see something shining at the bottom, it has a silverish grey glow."
				+ " (You can enter the water if you want)\n");
	}

	public void leatherface() throws InterruptedException {
		System.out.print("Before your eyes stands the definition of beauty, your eyes just "
                        + "can't seem to be about to leave their face,\nand you become more and more "
                        + "entranced as time goes on...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("\nDid I say beauty, sorry I meant disgust, you, upon looking at its "
                        + "face you feel as though the only way to cleanse\nyour eyes is to ripe them "
                        + "out, pour holy water(gasoline) onto them, and set them on ablaze.\nBut due to the "
                        + "fact you're still quite attached to your eye you resist the urge\n");
		
	}
	
	public void villager() throws InterruptedException {
		System.out.print("It's an elderly man, nearing his mid two-thousands, but still looks like he could"
                        + " break a goku in half.(An example of a goku is given)\n");
                TimeUnit.SECONDS.sleep(1);
                ct.goku();
                System.out.println("In his hands is a three pronged pitchfork, on his head sits a single crown"
                        + " with the words 'King of all Saiyans' written on it\n\n");
        	}

        public void leathergramps(){
            System.out.print("You examine the mentally insane elderly man and notice that the gun he has only"
                    + " has 4 bullets in it. ");
        }
}

// public void () {
// TODO Auto-generated method stub

// }
