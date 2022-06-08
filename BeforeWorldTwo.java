import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeforeWorldTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeforeWorldTwo extends World
{

    /**
     * Constructor for objects of class BeforeWorldTwo.
     * 
     */
    public BeforeWorldTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Arrow arrow = new Arrow();
        addObject(arrow,402,270);
        arrow.setLocation(421,267);
        arrow.setLocation(416,270);
        Arrow arrow2 = new Arrow();
        addObject(arrow2,531,384);
        arrow2.setLocation(531,384);
        ToWorldTwo toWorldTwo = new ToWorldTwo();
        addObject(toWorldTwo,555,213);
        toWorldTwo.setLocation(554,207);
    }
}
