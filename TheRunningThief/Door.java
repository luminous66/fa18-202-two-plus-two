import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    private boolean open = false;
    
    public void openDoor() {
        GreenfootImage img = getImage();
        setImage("DoorRemove.png");
        this.setLocation(699, 715);
        open = true;
    }
    
    public boolean isOpen() {
        return open;
    }
    
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

