package adventure.of.a.lifetime;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HardCode {

    Scanner input = new Scanner(System.in);
    String user = "";

    Scanner input1 = new Scanner(System.in);
    String action = "";

    int pitchfork = 0;
    int gruecount = 0;
    int bullets = 0;
    int pearl = 0;

    Celestial ct = new Celestial();
    Examine ex = new Examine();
    PickUp pu = new PickUp();
    enter en = new enter();
    Dance dc = new Dance();
    Move mv = new Move();
    Hit hit = new Hit();

    public HardCode Start() throws InterruptedException {
        System.out.print("You are standing in a open field west of a white house with a boarded up" + " front door \n");

        while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)
                && !"move".equals(user) && !"examine".equals(user) && !"pick up".equals(user) && !"hit".equals(user)
                && !"dance".equals(user) && !"close".equals(user) && !"exit".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();

            if (gruecount >= 5) {
                System.out.print("A Grue Approachs and eats you" + "\n");
                this.restart();
            } else if ("south".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.South1();
            } else if ("east".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.East1();
            } else if ("north".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.North1();
            } else if ("west".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.West1();
            } else if ("move".equals(user)) {
                System.out.print("Choose a Direction(South, East, North, West)" + "\n");
                while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("south".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.South1();
                    } else if ("east".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.East1();
                    } else if ("west".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.West1();
                    } else if ("north".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.North1();
                    }
                }
            } else if ("examine".equals(user)) {
                this.ex.start();
            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {

                    } else if ("punch".equals(action)) {
                        System.out.print("You attempt to " + action + " the air, you fail terribly "
                                + "and procced to fall over into a undiscovered hole in the ground."
                                + "\nIn that hole you find a colony of grue's, your death is" + " slow and painful."
                                + "\nYou curse yourself for thinking the air was a punchingbag. \n");

                        this.restart();
                    }
                }
            } else if ("pick up".equals(user)) {
                pu.NA();
            } else if ("dance".equals(user)) {
                System.out.print("");
            } else if ("close".equals(user) || "exit".equals(user)) {
                System.exit(0);
            } else {
                System.out.print("The Grue aproachs in Hunger \n");
                gruecount++;
            }
        }
        return null;
    }

    public void restart() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);

        System.out.print("Game Restarts\n\n\n");
        // System.exit(0);
        this.Start();
    }

    private void South1() throws InterruptedException {
        System.out.print("\n" + "You arrive south of you starting point, Their you see a suited figure." + "\n"
                + "You now stand before Slender Man,'staring' back at you \n");
        while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)
                && !"move".equals(user) && !"examine".equals(user) && !"pick up".equals(user) && !"hit".equals(user)
                && !"dance".equals(user) && !"close".equals(user) && !"exit".equals(user) && !"enter".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();

            if (gruecount >= 5) {
                System.out.print("A Grue Approachs and eats you" + "\n");
                this.restart();
            } else if ("south".equals(user)) {
                System.out.print("You cannot go anymore South then this currently");
            } else if ("east".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.SouthEast1();
            } else if ("north".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.Start();
            } else if ("west".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.SouthWest1();
            } else if ("move".equals(user)) {
                System.out.print("Choose a Direction(South, East, North, West)" + "\n");
                while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("south".equals(action)) {
                        System.out.print("You cannot go anymore South then this currently");
                    } else if ("east".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.SouthEast1();
                    } else if ("west".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.SouthWest1();
                    } else if ("north".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.Start();
                    }
                }
            } else if ("examine".equals(user)) {
                this.ex.Slenderman();
                this.Slender();
            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {
                        hit.slenderkick();
                        System.out.print("It's a sad thing that your adventures have to end here");
                        this.Slender();
                    } else if ("punch".equals(action)) {
                        hit.slenderpunch();
                        System.out.print("It's a sad thing that your adventures have to end here");
                        this.Slender();
                    }
                }
            } else if ("pick up".equals(user)) {
                pu.NA();
            } else if ("dance".equals(user)) {
                dc.slenderdance();
            } else if ("enter".equals(user)) {
                System.out.print("You can't enter a 'living' creature, you do know that right, right?\n");
            } else if ("close".equals(user) || "exit".equals(user)) {
                System.exit(0);
            } else {
                System.out.print("The Grue aproachs in Hunger \n");
                gruecount++;
            }
        }
    }

    private void SouthWest1() throws InterruptedException {
        // TODO Auto-generated method stub

        System.out.print("This path is currently not available\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Please Write in Back\n\n");
        
        while (!"back".equals(user)){
           String user = input.nextLine().trim().toLowerCase(); 
           if("back".equals(user)){
               this.Start();
           }
        }
    }

    private void SouthEast1() throws InterruptedException {
            // TODO Auto-generated method stub

        System.out.print("This path is currently not available\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Please Write in Back\n\n");
        
        while (!"back".equals(user)){
           String user = input.nextLine().trim().toLowerCase(); 
           if("back".equals(user)){
               this.Start();
           }
        }}

    private void North1() {
        // TODO Auto-generated method stub
        System.out.print("");

        while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)
                && !"move".equals(user) && !"examine".equals(user) && !"pick up".equals(user) && !"hit".equals(user)
                && !"dance".equals(user) && !"close".equals(user) && !"exit".equals(user) && !"enter".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();
            if (gruecount >= 5) {
                System.out.print("A Grue Approachs and eats you" + "\n");

            } else if ("south".equals(user)) {
                System.out.print("You Walked " + user + "\n");

            } else if ("east".equals(user)) {
                System.out.print("You Walked " + user + "\n");

            } else if ("north".equals(user)) {
                System.out.print("You Walked " + user + "\n");

            } else if ("west".equals(user)) {
                System.out.print("You Walked " + user + "\n");

            } else if ("move".equals(user)) {
                System.out.print("Choose a Direction(South, East, North, West)" + "\n");
                while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("south".equals(action)) {
                        System.out.print("You Walked " + action + "\n");

                    } else if ("east".equals(action)) {
                        System.out.print("You Walked " + action + "\n");

                    } else if ("north".equals(action)) {
                        System.out.print("You Walked " + action + "\n");

                    } else if ("west".equals(action)) {
                        System.out.print("You Walked " + action + "\n");

                    }
                }
            } else if ("examine".equals(user)) {

            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {

                    } else if ("punch".equals(action)) {

                    }
                }
            } else if ("pick up".equals(user)) {

            } else if ("dance".equals(user)) {

            } else if ("enter".equals(user)) {

            } else if ("close".equals(user) || "exit".equals(user)) {
                System.exit(0);
            } else {
                System.out.print("The Grue aproachs in Hunger \n");
                gruecount++;
            }
        }
    }

    private void West1() throws InterruptedException {

        System.out.print("You are standing infront of the house. It windows and doors are boarded up.\n");
        System.out.print("You can't enter the house\n");

        while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)
                && !"move".equals(user) && !"examine".equals(user) && !"pick up".equals(user) && !"hit".equals(user)
                && !"dance".equals(user) && !"close".equals(user) && !"exit".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();

            if (gruecount >= 5) {
                System.out.print("A Grue Approachs and eats you" + "\n");
                this.restart();
            } else if ("south".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.SouthWest1();
            } else if ("east".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.Start();
            } else if ("north".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.NorthWest1();
            } else if ("west".equals(user)) {
                System.out.print("You cannot go anymore South then this currently");

            } else if ("move".equals(user)) {
                System.out.print("Choose a Direction(South, East, North, West)" + "\n");
                while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("south".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.SouthWest1();
                    } else if ("east".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.Start();
                    } else if ("north".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.NorthWest1();
                    } else if ("west".equals(action)) {
                        System.out.print("You cannot go anymore South then this currently");

                    }
                }
            } else if ("examine".equals(user)) {
                this.ex.house();
            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {
                        hit.housekick();
                    } else if ("punch".equals(action)) {
                        hit.housepunch();
                    }
                }
            } else if ("pick up".equals(user)) {
                pu.NA();
            } else if ("dance".equals(user)) {
                dc.house();
            } else if ("enter".equals(user)) {
                System.out.print("You can't enter a closed house, anyone should know that\n");
            } else if ("close".equals(user) || "exit".equals(user)) {
                System.exit(0);
            } else {
                System.out.print("The Grue aproachs in Hunger \n");
                gruecount++;
            }
        }
    }

    private void NorthWest1() throws InterruptedException {
            // TODO Auto-generated method stub

        System.out.print("This path is currently not available\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Please Write in Back\n\n");
        
        while (!"back".equals(user)){
           String user = input.nextLine().trim().toLowerCase(); 
           if("back".equals(user)){
               this.Start();
           }
        }}

    private void East1() throws InterruptedException {
        System.out.print("You stand before a small waterfall flowing into a lake\n");

        while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)
                && !"move".equals(user) && !"examine".equals(user) && !"pick up".equals(user) && !"hit".equals(user)
                && !"dance".equals(user) && !"close".equals(user) && !"exit".equals(user) && !"enter".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();
            if (gruecount >= 5) {
                System.out.print("A Grue Approachs and eats you" + "\n");

            } else if ("south".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.SouthEast1();

            } else if ("east".equals(user)) {
                System.out.print("You cannot go anymore South then this currently");

            } else if ("north".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.NorthEast1();
            } else if ("west".equals(user)) {
                System.out.print("You Walked " + user + "\n");
                this.Start();
            } else if ("move".equals(user)) {
                System.out.print("Choose a Direction(South, East, North, West)" + "\n");
                while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("south".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.SouthEast1();
                    } else if ("east".equals(action)) {
                        System.out.print("You cannot go anymore East then this currently");

                    } else if ("north".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.NorthEast1();
                    } else if ("west".equals(action)) {
                        System.out.print("You Walked " + action + "\n");
                        this.Start();
                    }
                }
            } else if ("examine".equals(user)) {
                ex.waterfall();
            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {
                        hit.waterfallkick();
                    } else if ("punch".equals(action)) {
                        hit.waterfallpunch();
                    }
                }
            } else if ("pick up".equals(user)) {
                pu.NA();
            } else if ("dance".equals(user)) {
                dc.waterfall();
            } else if ("enter".equals(user)) {
                en.waterfall();
                this.Waterfall();
            } else if ("close".equals(user) || "exit".equals(user)) {
                System.exit(0);
            } else {
                System.out.print("The Grue aproachs in Hunger \n");
                gruecount++;
            }
        }
    }

    private void NorthEast1() throws InterruptedException {
            // TODO Auto-generated method stub

        System.out.print("This path is currently not available\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Please Write in Back\n\n");
        
        while (!"back".equals(user)){
           String user = input.nextLine().trim().toLowerCase(); 
           if("back".equals(user)){
               this.Start();
           }
        }}

    public void Slender() throws InterruptedException {
            // TODO Auto-generated method stub

        System.out.print("This path is currently not available\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Please Write in Back\n\n");
        
        while (!"back".equals(user)){
           String user = input.nextLine().trim().toLowerCase(); 
           if("back".equals(user)){
               this.Start();
           }
        }}

    public void Waterfall() throws InterruptedException {
        System.out.print("Before you can get to the pearl a hungry piranha approches you \n");
        System.out.print("Your avalible options are; pick up, get out, attack, and talk \n");

        while (!"pick up".equals(user) && !"get out".equals(user) && !"attack".equals(user) && !"talk".equals(user)) {
            String user = input.nextLine().trim().toLowerCase();

            if ("pick up".equals(user)) {
                System.out.print("You attempt to pick up the piranha, but you can guess what happens right, of course"
                        + " you can, the piranha eats you hand, and arm,\nand then proceeds to eat the the rest of "
                        + "you. you die a slow and painful death\n\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.print("Try again\n\n\n");
                TimeUnit.SECONDS.sleep(3);
                this.Waterfall();
            } else if ("get out".equals(user)) {
                System.out.print(
                        "You exit the water as fast as you can, and get on to dry land, what do you do " + "now\n\n");
                this.East1();
            } else if ("attack".equals(user)) {
                System.out.print("You try to punch the piranha in the face, and succeed. Good for you\n");
                System.out.print(
                        "You pick up the piranha, never know when it might help(New Option Available" + ": Throw)\n\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.print("You swim down to pick up the pearl, it's a lot heavier then you thought it "
                        + "would be but you still succeed in taking it to the surface. \nUnder the pearl you "
                        + "noticed a button, next to it is a sign that says 'Boarded up House'. Wonder what that"
                        + " could mean.\n\n");
                TimeUnit.SECONDS.sleep(3);
                pearl++;
                this.Waterfall2();
            } else if ("talk".equals(user)) {
                System.out.print("You drowned...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("\nWhat else were you expecting to have happen, you do realise that you are underwater"
                        + " right now right, \nof course you would drown, and even if you weren't underwater, \ndo you "
                        + "really think that a hungry piranha would actually listin to you.\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print("Game Over, please try again\n\n\n");
                this.Waterfall();
            } else {
                System.out.print("Try something else\n");
            }
        }
    }

    public void Waterfall2() throws InterruptedException {
        System.out.print("You get out of the water and you are approached by a angry Villager with a pitch fork."
                + " You are on his land and he wants you off.\n");
        System.out.print("Options temporarily lost: Move(plus directions), pick up, and enter(for understandable"
                + " reasons)\n");

        while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user) && !"west".equals(user)
                && !"move".equals(user) && !"examine".equals(user) && !"pick up".equals(user) && !"hit".equals(user)
                && !"dance".equals(user) && !"close".equals(user) && !"exit".equals(user) && !"enter".equals(user)
                && !"throw".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();
            if (gruecount >= 5) {
                System.out.print("A Grue Approachs and eats you" + "\n");
                this.Start();
            } else if ("south".equals(user)) {
                System.out.print("Option not Available" + "\n");

            } else if ("throw".equals(user)) {
                hit.waterfallthrow();
                this.openhouse();
            } else if ("east".equals(user)) {
                System.out.print("Option not Available" + "\n");

            } else if ("north".equals(user)) {
                System.out.print("Option not Available" + "\n");
            } else if ("west".equals(user)) {
                System.out.print("Option not Available" + "\n");

            } else if ("move".equals(user)) {
                System.out.print("Option not Available" + "\n");
            } else if ("examine".equals(user)) {
                ex.villager();
            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {
                        try {
                            hit.villagerkick();
                        } catch (IOException ex) {
                            Logger.getLogger(HardCode.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if ("punch".equals(action)) {
                        try {
                            hit.villagerpunch();
                        } catch (IOException ex) {
                            Logger.getLogger(HardCode.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
            } else if ("pick up".equals(user)) {
                System.out.print("Option not Available" + "\n");
            } else if ("dance".equals(user)) {
                dc.villagerdance();
            } else if ("enter".equals(user)) {
                System.out.print("Option not Available" + "\n");
            } else if ("close".equals(user) || "exit".equals(user)) {
                System.exit(0);
            } else {
                System.out.print("The Grue aproachs in Hunger \n");
                gruecount++;
            }
        }
    }

    private void openhouse() throws InterruptedException {
        System.out.print(
                "\nYou stand before the boarded up house, but now the front door is slightly ajar, you look behind "
                + "yourself and see 15 Villagers\nrunning after you,them are incredibly angry at you.\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.print(
                "So you are left with one out of two choices, either A)Confront them(Stay), of B)Go into the scary "
                + "house(Enter), your choice.\n");

        while (!"stay".equals(user) && !"enter".equals(user)) {
            String user = input.nextLine().trim().toLowerCase();

            if ("stay".equals(user)) {
                System.out.print("To the player: ARE YOU TRYING TO DIE.\n");
                TimeUnit.SECONDS.sleep(2);
                System.out.print("Sorry, just wanted to tell you this is a stupid idea. Now then, what are you "
                        + "planning on doing next, talk to them maybe? \n");
                TimeUnit.SECONDS.sleep(4);
                this.StupidIdea();
            } else if ("enter".equals(user)) {
                System.out.print("You choice the lesser of two evils, namely to go inside the house, instead of "
                        + "confronting a group of angry Villagers that were more \nlikely then not to kill you\n");
                this.LessStupidIdea();
            }
        }

    }

    private void leatherface() throws InterruptedException {
        System.out.print("Without even a second to think Leatherface stands before you. What can I say, you have terrible"
                + " luck.(Lets ignore the fact that this is a \nrudimentary text advanture game)\n\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("Now that you are standing infront of what can only be called a monstrous demonspawn, your brain goes"
                + " into overdrive.\nYou sprint though the open metal door into the corridor past it. Now comes your "
                + "choice, what do you do?\n\n"
                + "(You see a dead grue on the ground next to you, now you know why it stopped following you)\n\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Available options include; examine, upstair, up, out, exit, downstairs, downstair"
                + ", upstairs, left, right, sing, \ncthulhu, dance, stab, throw, hit, leave, down\n");

        while (!"examine".equals(user) && !"upstair".equals(user) && !"up".equals(user) && !"out".equals(user)
                && !"exit".equals(user) && !"downstairs".equals(user) && !"downstair".equals(user) && !"upstairs".equals(user)
                && !"left".equals(user) && !"right".equals(user) && !"sing".equals(user) && !"cthulhu".equals(user)
                && !"dance".equals(user) && !"stab".equals(user) && !"throw".equals(user) && !"hit".equals(user)
                && !"leave".equals(user) && !"down".equals(user)) {
            String user = input.nextLine().trim().toLowerCase();

            if ("examine".equals(user)) {
                ex.leatherface();
            } else if ("upstairs".equals(user) || "upstair".equals(user) || "up".equals(user)) {
                mv.lhu();
                this.leatherhouseup();
            } else if ("exit".equals(user) || "out".equals(user) || "leave".equals(user)) {
                mv.lho();
                this.leatherface();
            } else if ("left".equals(user)) {
                mv.lhl();
                this.leatherhouseleft();
            } else if ("right".equals(user)) {
                mv.lhr();
                this.leatherface();
            } else if ("downstairs".equals(user) || "downstair".equals(user) || "down".equals(user)) {
                mv.lhd();
                this.leatherface();
            } else if ("stab".equals(user)) {
                hit.leatherstab1();
            } else if ("throw".equals(user)) {
                hit.na();
            } else if ("dance".equals(user)) {
                dc.leatherdance1();
                this.leatherface();
            } else if ("sing".equals(user)) {
                dc.leathersing1();
                this.leatherface();
            } else if ("cthulhu".equals(user)) {
                System.out.print("Cthulhu doesn't want to help, try something else");
            } else if ("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick \n");
                while (!"punch".equals(action) && !"kick".equals(action)) {
                    String action = input1.next().trim().toLowerCase();
                    if ("kick".equals(action)) {
                        hit.leatherfacekick1();
                        this.leatherface();
                    } else if ("punch".equals(action)) {
                        hit.leatherfacepunch1();
                        this.leatherface();
                    }
                }
            } else {
                System.out.print("Not an available option\n");
            }
        }

    }

    private void leatherhouseleft() throws InterruptedException {
        // TODO Auto-generated method stub

        System.out.print("This path is currently not available\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Please Write in Back\n\n");
        
        while (!"back".equals(user)){
           String user = input.nextLine().trim().toLowerCase(); 
           if("back".equals(user)){
               this.Start();
           }
        }
    }

    public void leatherhouseup() throws InterruptedException {
        
		System.out.print("You, with a leatherface walking up for behind, and a insane man infront, now stand "
                        + "before the ultimate choice, what do you do?\n");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print("There is of course a limited amount for options, namely; to hit him(hit), talk to him"
                        + "(talk), run passed him(run or run passed),\ngo back(leave), jump out the window(jump), examine"
                        + "(examine), save him(save), or as usual to summon our lord and\nsavior Cthulhu"
                        + "(cthulhu)\n\n");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Or if you want to quit just write"
                        + " quit\n\n");
                
                while(!"hit".equals(user) && !"talk".equals(user) && !"run".equals(user) 
                         && !"leave".equals(user) && !"jump out the window".equals(user)
                         && !"window".equals(user) && !"run passed".equals(user)
                         && !"cthulhu".equals(user) && !"examine".equals(user) && !"exit".equals(user)){
                    
            String user = input.nextLine().trim().toLowerCase();
            
            if("talk".equals(user)) {
                System.out.print("You wish to speak to the clearly crazy old man, that is talking to the fireplace,"
                        + " your funeral I guess.\n\n");
                System.out.print("");
                
            }else if("run".equals(user) || "run passed".equals(user)) {
            
            }else if("save".equals(user)){
            System.out.print("You decide to be a good person and rescue the ol man infront of the fireplace."
                    + " You pick him up and begin to take \nhim towards the window(he was surprisingly light)"
                    + "");
            
            }else if("jump out the window".equals(user) || "window".equals(user)) {
            System.out.print("You, having decided that the old man isn't worth the effort, decide to jump "
                    + "out of the burning building");
               this.leatherhouseup();
                
            }else if("leave".equals(user)) {
            
            }else if("cthulhu ".equals(user)) {
                System.out.print("Cthulhu is not happy with your sacrifice, saying that you are foolish of wishing harm"
                        + "upon this elderly man\n You being a badass that just rolled up stairs decides that you don't"
                        + " need Cthulhu and instead go up to the old man and retrive his gun\n");
            
            }else if ("examine".equals(user)){
                ex.leathergramps();
                
            }else if("hit".equals(user)) {
                System.out.print("Do you wish to punch or kick the elderly man\n");
                while(!"kick".equals(action) && !"punch".equals(user)){
                    String action = input1.next().trim().toLowerCase();
                    
                        if("punch".equals(action)){
                            System.out.print("You being the badass you are decide to go in and punch the elderly man"
                                    + " talking to the fireplace,\nhe doesn't notice you at all and instead continues"
                                    + " to talk to the fireplace, begin to ready what's left of your pitchfork in the"
                                    + "\nmiddle of his temple. He goes down and you feel triumphant. You take his 38."
                                    + " and the 4 bullets that were in it.\n\n");
                            TimeUnit.SECONDS.sleep(3);
                            bullets = 4;
                            System.out.print("Everything around you is now on fire, the walls, the floor, the ceiling"
                                    + "... ok that isn't true, not everything is on fire, the one window and fireplace"
                                    + "aren't on fire\n");
                            TimeUnit.SECONDS.sleep(3);
                            System.out.print("Leatherface is accending the stairs and smoke is rising so you do the "
                                    + "only sensible thing and jump out\nof the only window not on fire. You break "
                                    + "one of your legs and are currently being chased by a group of Villagers,\n"
                                    + "1 leatherface revving a chainsaw pissed that you killed his grampa, and "
                                    + "everything is on fire.\n You fire a round into the air to scare away the"
                                    + " Villagers and continue to drag yourself in the opposite direction of the house\n");
                            TimeUnit.SECONDS.sleep(3);
                            bullets --;
                            JasonLake();
                        }else if("kick".equals(action)){
                            System.out.print("You come up from behind the grampa to give the finishing blow, but just before"
                                    + " you do you decide to check if he can hear you, you\ntake what's left of the pichfork "
                                    + "and smash it against the nearest metal thing you can find, in this situation that thing"
                                    + " is a giant\ngong. You hit it with all the strength you can muster but the elderly man "
                                    + "doesn`t react, on the other hand the leatherface\nbehind you was stunned.\n");
                            System.out.print("You, being the sensible person you are, decide to drop kick the grampa in the "
                                    + "back of the head while Leatherface to stunned. You take\nthe gun, jump out the window,"
                                    + " and run...");
                            System.out.print("sorry, crawl away from the house to the lake, which you believe shall be your "
                                    + "final\nresting place");
                            bullets = 3;
                            System.out.print("\n");
                            JasonLake();
                        }
                    }
            }else if("quit".equals(user)) {
                exit(0);
                
            }else if("exit".equals(user)) {
                exit(0);
                
            }else {
                System.out.print("Please try other option\n\n");
            }
        }
    }
    
    public void JasonLake() throws InterruptedException {
                // TODO Auto-generated method stub
        
        //Temp//
        System.out.print("This is the current end of the game, happy times, you have finally"
                + "(temperarlly) finished this game, congrats.\n For you on this happy occasion"
                + " i give you this\n");
        ct.Yoko();
        System.out.print("And this:");
        try {
            ct.Perfect();
        } catch (IOException ex) {
            Logger.getLogger(HardCode.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("like the sound effect, well that's it");
        TimeUnit.SECONDS.sleep(2);
        exit(1);
        //Temp//
        
    System.out.print("");
    System.out.print("");
    
    while (!"shoot".equals(user) && !"cry".equals(user)) {
        
            String user = input.nextLine().trim().toLowerCase();
            
            if("shoots".equals(user)){
                
            }else if("cry".equals(user)){
                
            }
    }
}

    private void LessStupidIdea() throws InterruptedException {
        System.out.print("You enter the house closing the door behind you. You board up the door with the nearest "
                + "piece of plywood you can find \n(It just happens to be the perfect size to block the door, lucky "
                + "you!).\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("Behind you are 15 Villagers banging on the door, infront of you is a closed metal door. What"
                + " do you do?\n" + "Options: Break open, talk to, go back, or Cthulhu is always a option\n");
        while (!"break".equals(user) && !"open".equals(user) && !"talk".equals(user) && !"go back".equals(user)
                && !"back".equals(user) && !"cthulhu".equals(user) && !"the only option".equals(user)
                && !"cthulhu is always a option".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();

            if ("break".equals(user) || "open".equals(user)) {
                System.out.print("You attempt to open the door with the pitchfork you picked up before."
                        + "\nThe Pitchfork breaks, the door is scratched, you have failed\n");
                System.out.print("As you look away from the door in sadness, you hear a moaning on the otherside of "
                        + "the door. You then hear a chainsaw revving up behind you\n");
                this.leatherface();

            } else if ("go back".equals(user) || "back".equals(user)) {
                System.out.print("You begin to move away the plank that you placed infront of the door, the second"
                        + " you shift the plank from the door it explode\n(apparently the Villagers got some "
                        + "dynamite from somewhere, damn they must hate you)\n");
                System.out.print("Before you get the chance to say anything the Villagers come in to finish you."
                        + " You die before you can say anything\n\n");
                System.out.print("You Died, Good Job\n\n");
                this.LessStupidIdea();

            } else if ("talk".equals(user)) {
                System.out.print("You begin to talk to the door...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("\n\nYou do realise that you are talking to a door right. What do you think will "
                        + "happen, the door would magically open for you or something.\n");
                System.out.print("As you look down in depression, you hear a chainsaw revving up behind you\n\n");
                this.leatherface();

            } else if ("cthulhu".equals(user) || "cthulhu is always a option".equals(user)
                    || "the only option".equals(user)) {
                System.out.print("You pray to Cthulhu to open the door. As you pray a heavy mist starts to set around"
                        + " you and the room. \nYou start to hear the sound of screaming and crying around,"
                        + " progressively the sound gets louder and louder, until it becomes an unbearable wail.\n");
                System.out.print("Creatures started appearing around."
                        + "(Here's an image if you were curious what it looks like)\n");
                TimeUnit.SECONDS.sleep(3);
                ct.Celestia();
                System.out.print("So now you know what the creature looks like. And you're surrounded by those things."
                        + " So of course there is only one thing that can happen right.\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.print("They say they will take you to their master for being such a devoted follower,"
                        + " allowing you to experience the power of his lordship firsthand.\n\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.print(
                        "You kindly refuse saying that all you want is the door open and one of the creatures walk"
                        + "straight throught the door, a giant hole is left through the door and the creatures leave,"
                        + "\nbut before they leave completely you hear Cthulhu say 'Watch out for leatherface' right "
                        + "before you the sound of a chainsaw revving resonates throughout the room you are in.\n");
                TimeUnit.SECONDS.sleep(3);
                this.leatherface();

            } else {
                System.out.print("Please try again\n");
            }
        }
    }

    private void StupidIdea() throws InterruptedException {
        System.out.print("\nYou stand surrounded by a group of angry, pitchfork carrying, Villagers out for blood,"
                + " what are you going to do\n"
                + "Options are: \n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Beg for mercy, Run(not recommended), Negotiate, Fight, Summon the powers of Cthulhu,"
                + " Sing of them, Dance, or Pray. Choice Wisely\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("or not, your choice \n");

        while (!"cthulhu".equals(user) && !"summon the powers of cthulhu".equals(user) && !"beg".equals(user)
                && !"summon cthulhu".equals(user) && !"run".equals(user) && !"talk".equals(user)
                && !"negotiate".equals(user) && !"pray".equals(user) && !"fight".equals(user) && !"sing".equals(user)) {

            String user = input.nextLine().trim().toLowerCase();

            if ("dance".equals(user)) {
                System.out.print("The Villagers take offense to you the way you are dancing, which causes there rage to"
                        + " increase even more then before. \nAll the Villagers go into a blood Rage and turn into a group "
                        + "of bloodthirsty vampires. Upon finishing their transformation they all jump onto you and feast "
                        + "upon your flesh. \n You don't die, you just turn into a low-level mindless undead. You can't "
                        + "continue your quest.\n\n");
                TimeUnit.SECONDS.sleep(4);
                System.out.print("Try Again\n");
                this.openhouse();
            } else if ("cthulhu".equals(user) || "Summon the powers of cthulhu".equals(user)
                    || "summon cthulhu".equals(user)) {
                System.out.print("You begin to pray to your lord and savior Cthulhu for him to gift upon you "
                        + "his power and allow you to destroy the heathens that stand before.\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out
                        .print("As you start to truely get entranced into your prayer you realise that chuthulhu isn't "
                                + "actually real, but because you have already done this much.\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print(" what harm could alittle more do. The Villagers around you are beginning to believe"
                        + " that you are insane so they start to come in for the kill\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print("Just as the Villagers are about to stab you with there pitchforks, you feel the "
                        + "pearl you were carrying with you cruumble into dust and a voice comes from all around you\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out
                        .print("'Who has called upon me, The Great Old One of great power that lies 'dead but dreaming'"
                                + " in the city of R'lyeh, High priest of the Great Old Ones, and nightmare of man'\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print("'What ask thee, mortal?'\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.print("You are completely surprised that it actually worked but still you remember to ask"
                        + " the nice god to borrow a portion of its power to smite those around you \n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print("'I shall grant you my power, but will you be able to use it is the question?' Cthulhu"
                        + " says with something that sounds like a snear.\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print("Once he says that you feel unimaginable power gushing out from you and you manafest"
                        + " it into a group of tentacles all around you. \nAfter riding the world of those heathens "
                        + "you thank the lord Chuthulu and return his powers to him, but upon doing so you feel a part"
                        + " of your mind go with them. \nYou notice a sense of insanity come over you like a flood"
                        + " taking your body as hostage before everything goes dark...\n\n");
                TimeUnit.SECONDS.sleep(7);
                System.out.print("You wake up in utter darkness with a voice in you head telling you'Poor think,"
                        + " falling into madness after using but a part of my power, \nit's sad really, but what"
                        + " can be done when a mortal over steps his bound. But alas tis fate, the less i can do"
                        + " is welcome you to my realm of madness, \nI hope you have a pleasent time...'\n\n");
                TimeUnit.SECONDS.sleep(7);
                System.out.print("Game Over, You have been taken by Cthulhu, It was alittle early to use his power \n\n");
                TimeUnit.SECONDS.sleep(4);
                this.openhouse();

            } else if ("fight".equals(user)) {
                System.out.print(
                        "The only items you have on you are; a pitchfork taken off a corpse, and the pearl from the "
                        + "bottom of the lake. \nAs you think of the most amazing possible plan to get yourself out of this "
                        + "hopeless without getting hurt you notice that the Villagers have already started stabbing you. You "
                        + "spent too long thinking of your plan and ended up getting killed.\n\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print("You Died, Try Again after looking at your complimentary cat picture\n\n\n");
                ct.cat();
                this.openhouse();
            } else if ("sing".equals(user)) {
                System.out.print(
                        "The Villagers around you seem to really injoy you singing. They even seem ready to forgive you."
                        + " But just before you get the chance to be forgiven \nyou hear the sound of window on the second floor "
                        + "behind you breaking. As you turn around you see some creature wearing some other poor fouls face upon "
                        + "\nhis own jumping out from the window drawn out by you singing, apperantly Leatherface also likes you "
                        + "singing.\n");
                TimeUnit.SECONDS.sleep(5);
                System.out.print(
                        "He kills all the Villagers around you and carries you into into the house. You are now destined"
                        + " to be Leatherface's musicbox for the rest of eternity.\n\n");
                TimeUnit.SECONDS.sleep(3);
                System.out.print("I hope your good at singing.\nGame Over\n\n\n");
                this.openhouse();
            } else if ("beg".equals(user)) {
                System.out.print(
                        "you get onto you knees getting ready to beg, but before you get the chance to speak the "
                        + "Villagers around you have already taken your head and are going back to their Village.\n\n");
                System.out.print("Try Again Please\n\n");
                this.openhouse();
            } else if ("run".equals(user)) {
                System.out.print(
                        "You are surrounded by 15 Villagers. They are going to literally stab you to death, are you "
                        + "sure about this choice; Yes or No?\n");

                while (!"yes".equals(action) && !"no".equals(action)) {

                    String action = input1.next().trim().toLowerCase();

                    if ("yes".equals(action)) {
                        System.out.print("Good choice now lets try that again.\n\n\n");
                        TimeUnit.SECONDS.sleep(2);
                        this.StupidIdea();
                    } else if ("no".equals(action)) {
                        System.out.print(
                                "You are die, I am of course going to tell you how you die, but I just wanted you to know "
                                + "that you have indeed actually died.\n\n");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.print(
                                "The Villagers, seeing that you are running straight towards their encirclement, are "
                                + "increadibly bewildered by the fact that anyone could be that stupid, \nthey recover "
                                + "quickly from said bewilderment and set their weapons to the ready. You run into the weapons "
                                + "and impale you self. Here's an image\n");
                        TimeUnit.SECONDS.sleep(4);
                        System.out.print(
                                "I was planning on RickRolling you here, but that was to hard so instead of that i'm "
                                + "going to give you a picture of a cat. Here you go\n\n\n");
                        TimeUnit.SECONDS.sleep(4);
                        ct.cat();
                        System.out.print("Now try again\n");
                        this.openhouse();
                    }
                }
            } else if ("negotiate".equals(user) || "talk.".equals(user)) {
                System.out.print(
                        "You know you have nothing to negotiate with the Villagers, but you choose to make it up as "
                        + "you go...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("...");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(
                        "\nAs you begin to get into the meat for the negotiation you notice that 5 out of the 15 Villagers "
                        + "seem to have gone somewhere. \nThey seem to be equally as confused as you are about their comrades "
                        + "disappearance and start to look around. \nWhen you are looking around you start to hear screams out"
                        + " in the distance and the revving of a chainsaw. You can hear it getting louder and louder as time "
                        + "went on. \nYou turn around only to see a terrifying think running around with a chainsaw cutting up "
                        + "anything in its way.\nHe, after spotting you, starts making a B line straight towards you.\nYou only "
                        + "having one way to run, so you go straight into the house without fear, he runs right after you not "
                        + "caring for the other Villagers around you.\n\n");
                TimeUnit.SECONDS.sleep(10);
                this.leatherface();
            } else if ("pray".equals(user)) {
                System.out
                        .print("You pray to any god that would hear you; Set, Thor, Raijin, Susanoo, the Thunderbird, "
                                + "Zues, Chaac, and even God \n\n");// They are all lightning Gods(Except God)
                TimeUnit.SECONDS.sleep(3);
                System.out.print("You feel as though your prayers are answered as the heavens around you seem to begin"
                        + "to radiate light, \nthe light begins to progressivly become brighter and brighter as time goes "
                        + "on \nAfter afew more seconds the lightning visibly arcing from cloud to cloud.\n\n");
                TimeUnit.SECONDS.sleep(7);
                System.out.print("You sense something amiss but you just can't seem to put you finger on it... \nJust as "
                        + "the lightning finally gets to its apex you finally notice what felt out of place.\n It was "
                        + "the GODS that you were praying to, you attempt to remedy the situation, but before you can \n"
                        + " the lightning falls " + "down upon you, striking you dead \n\n");
                TimeUnit.SECONDS.sleep(7);
                System.out.print("Dead End.\n\nYou have died, but it was a fun story right? \n\n");
                TimeUnit.SECONDS.sleep(4);
                this.openhouse();
            } else {
                System.out.print("Try A diffrent command \n\n");
            }
        }
    }

}
/**
Your Savour, not really needed any more

while (!"south".equals(user) && !"east".equals(user) && !"north".equals(user)
&& !"west".equals(user) && !"move".equals(user) && !"examine".equals(user) &&
!"pick up".equals(user) && !"hit".equals(user) && !"dance".equals(user) &&
!"close".equals(user) && !"exit".equals(user) && !"enter".equals(user)) {

String user = input.nextLine().trim().toLowerCase();
 if (gruecount >= 5) {
System.out.print("A Grue Approachs and eats you" + "\n");
this.restart();

} else if ("south".equals(user)) { System.out.print("You Walked " + user +"\n");

} else if ("east".equals(user)) { System.out.print("You Walked " + user +"\n");

} else if ("north".equals(user)) { System.out.print("You Walked " + user +"\n");

} else if ("west".equals(user)) { System.out.print("You Walked " + user +"\n");

} else if ("move".equals(user)) {
 System.out.print("Choose a Direction(South, East, North, West)" + "\n"); while (!"south".equals(user) &&
!"east".equals(user) && !"north".equals(user) && !"west".equals(user)) {
String action = input1.next().trim().toLowerCase(); 

if("south".equals(action)) { 
System.out.print("You Walked " + action + "\n");

} else if ("east".equals(action)) { 
System.out.print("You Walked " + action + "\n");

} else if ("north".equals(action)) { 
System.out.print("You Walked " + action + "\n");

}else if ("west".equals(action)) { 
System.out.print("You Walked " + action + "\n");

} } }
 else if ("examine".equals(user)) {

} else if ("hit".equals(user)) { 
System.out.print("Do you wish to punch or kick \n");

 while (!"punch".equals(action) && !"kick".equals(action)) { 
 String action = input1.next().trim().toLowerCase(); 
 
 if ("kick".equals(action)) {

} else if ("punch".equals(action)) {

} } } else if ("pick up".equals(user)) {

} else if ("dance".equals(user)) {

} else if ("enter".equals(user)) {

}else if ("close".equals(user) || "exit".equals(user)) { 
System.exit(0); 
} else{
System.out.print("The Grue aproachs in Hunger \n");
gruecount++;} }

**/
