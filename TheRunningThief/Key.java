import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    int keySpeed;
    int leftBoundary;
    int rightBoundary;
    
    public Key(int speed, int leftBoundary, int rightBoundary) {
        this.keySpeed = speed;
        this.leftBoundary = leftBoundary;
        this.rightBoundary = rightBoundary;
    }
    /**
     * Act - do whatever the Bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(keySpeed);
        
        if (getX() < leftBoundary || getX() > rightBoundary) {
            keySpeed = -keySpeed;
        }
    }    
}

