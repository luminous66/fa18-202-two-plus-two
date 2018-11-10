import java.util.*;
/**
 * Write a description of class WorldController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldController  
{
    //private static WorldController worldCtrl;
    
    List<GamePage> pageChain = new LinkedList<GamePage>();
    
    private GamePage level31;
    private GamePage level32;
    private GamePage level33;
    
    public WorldController() {
        level31 = new Level3R1();
        level32 = new Level3R2();
        level33 = new Level3R3();
        
        pageChain.add(level31);
        pageChain.add(level32);
        pageChain.add(level33);
    }
    
    /* static WorldController getWorldController() {
        if (worldCtrl == null) {
            worldCtrl = new WorldController();
        }
        return worldCtrl;
    }*/
    
    public List<GamePage> getPageChain() {
        return pageChain;
    }
}
