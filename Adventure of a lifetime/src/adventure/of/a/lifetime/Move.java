package adventure.of.a.lifetime;

import java.util.concurrent.TimeUnit;

public class Move {

	public void lho() {
            //TODO
		System.out.print("You roll passed your adversary ");
	}
	
	public void lhl() {
            //TODO
		System.out.print("You take a sharp right passed the leathery monster into ");
                
	}
	
	public void lhr() throws InterruptedException {
            //TODO
		System.out.print("You take a sharp right passed the leathery monster into ");
		TimeUnit.SECONDS.sleep(4);
		System.out.print("You have died(How does it feel)\n\n");
	}
	
	public void lhu() throws InterruptedException {
		System.out.print("You roll passed your adversary up the stairs(rolling up stairs for"
                        + " the win)\nYou after having rolled up the stairs like a badass come across"
                        + " grampa sitting infront of a fireplace holding a 38. magnum talking to\nhis dead wife.."
                        + "yelling downstairs to keep it down\n\n"
                        + "You notice the villagers outside setting the house on fire\n");
                TimeUnit.SECONDS.sleep(1);
	}
	
	public void lhd() throws InterruptedException {
		System.out.print("You sprinted down the stairs leading into the basement. Their you are met with by an slightly ajar "
				+ "door, you kick the\ndoor open and continue your escape from Leatherface. The basement is a room full of "
				+ "tomb heads, as for exits none.\nYou choice the wrong path. As you contemplate all the mistakes you have made"
				+ " throughtout your visit to this realm\nyou can hear Leatherface coming down the stairs after you, he sound "
				+ "mad. As you wait for your inevitable demise you\nstart to hear something crackling in the distance. As you"
				+ " try to think of what the source of the sound is,");
		TimeUnit.SECONDS.sleep(4);
		System.out.print("\nyou see the stairs you took down to the basement slowly"
				+ " starting to glow red. You start to smell the scent of smoke\nand ash coming from all around you. "
				+ "The Villagers set the house on fire, and because you choice to go downstairs\nyou are stuck with Leatherface"
				+ "for the last moments of you life. Leatherface seems quite content with the end of his\nlife as he laughs to "
				+ "himself.\n\n");
		TimeUnit.SECONDS.sleep(4);
		System.out.print("You died burning alive. But aleast you took Leatherface with you, feel proud, GG.\n\n");
	}
}
