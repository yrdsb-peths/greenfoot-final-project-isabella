import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeforeWorldThree here.
 * 
 * @author Isabella
 * @version June 2022
 */
public class BeforeWorldThree extends World
{

    /**
     * Constructor for objects of class BeforeWorldThree.
     * 
     */
    public BeforeWorldThree()
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
        ToHomeWorld toHomeWorld = new ToHomeWorld();
        addObject(toHomeWorld,296,274);
    }
}
