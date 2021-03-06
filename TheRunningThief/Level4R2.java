import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4R2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public class Level4R2 extends GamePage {

    /**
     * Constructor for objects of class Level4R2.
     * 
     */
    public Level4R2() {
        super();
    }
    
    public void prepare() {
        addObject(thief,136,630);
        addObject(score,819,79);
        
        Points points = new Points();
        addObject(points,817,28);
        
        RedButton redButton1 = new RedButton();
        RedButton redButton2 = new RedButton();

        SwordDown swordDown1 = new SwordDown(true, -1, 200, 400);
        SwordDown swordDown2 = new SwordDown(true, 1, 250, 450);
        SwordDown swordDown3 = new SwordDown(true, 1, 700, 900);
        
        redButton1.attach(swordDown1);
        redButton1.attach(swordDown2);
        redButton2.attach(swordDown3);
        
        addObject(redButton1,400,700);
        addObject(redButton2,800,700);
        addObject(swordDown1,300,10);
        addObject(swordDown2,350,10);
        addObject(swordDown3,800,10);
        
        Diamond diamond1 = new Diamond();
        Diamond diamond2 = new Diamond();
        Diamond diamond3 = new Diamond();
        Diamond diamond4 = new Diamond();
        Diamond diamond5 = new Diamond();
        Diamond diamond6 = new Diamond();
        Diamond diamond7 = new Diamond();
        Diamond diamond8 = new Diamond();
        Diamond diamond9 = new Diamond();
        Diamond diamond10 = new Diamond();
        
        addObject(diamond1,100,690);
        addObject(diamond2,200,500);
        addObject(diamond3,300,690);
        addObject(diamond4,400,500);
        addObject(diamond5,500,550);
        addObject(diamond6,600,590);
        addObject(diamond7,700,500);
        addObject(diamond8,900,490);
        addObject(diamond9,1000,550);
        addObject(diamond10,1100,500);
        
        setPaintOrder(Thief.class, Diamond.class, SwordDown.class, RedButton.class);

    }
    
}
