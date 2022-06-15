import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeWorld here.
 * 
 * @Isabella 
 * @June 2022
 */
public class HomeWorld extends World
{

    /**
     * Constructor for objects of class HomeWorld.
     * 
     */
    public HomeWorld()
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
        Info info = new Info();
        addObject(info,91,299);

        info.setLocation(105,305);
        info.setLocation(84,323);

        info.setLocation(320,64);
        Greenfoot.playSound("a-jazz-piano-110481.mp3");
        info.setLocation(308,68);
        info.setLocation(501,68);
    }
}
