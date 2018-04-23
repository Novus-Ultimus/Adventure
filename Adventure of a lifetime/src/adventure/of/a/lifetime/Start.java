package adventure.of.a.lifetime;

import java.awt.EventQueue;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.concurrent.TimeUnit;

public class Start {

    public void Game() throws InterruptedException, IOException {
        System.out.println("Are you all having fun? \n" + "Because this is gonna be fun...");

//        TimeUnit.SECONDS.sleep(5);
        
        WannaGame Start = new WannaGame();
        Celestial ct = new Celestial();
        HardCode hc = new HardCode();
        Examine ex = new Examine();
        Move mv = new Move();
//        gif gif = new gif();
        Hit hit = new Hit();
        
//        hit.villagerpunch();
//        hit.villagerpunch();
//        ex.leatherface();
//        ct.Celestia();
//        ct.goku();
//        ct.cat();
//        mv.lhd();
//        mv.lhu();
        
//        ex.villager();
        
//        hc.leatherhouseup();
        
//        hc.JasonLake();
        
        
//        exit(0);
        
        System.out.print("Available commands are Move(Cardinal Directions),\n"
                + "Examine, Hit(Punch or Kick), Pick Up, and Dance \n\n\n\n\n");

        hc.Start();
    }
}
