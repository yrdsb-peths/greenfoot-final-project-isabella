import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeforeWorld here.
 * 
 * @author Isabella 
 * @version June 2022
 */
public class BeforeWorld extends World
{

    /**
     * Constructor for objects of class BeforeWorld.
     * 
     */
    public BeforeWorld()
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
        addObject(arrow,113,344);
        arrow.setLocation(111,336);

        ToWorld toWorld = new ToWorld();
        addObject(toWorld,521,72);
    }
}
