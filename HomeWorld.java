import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        info info = new info();
        addObject(info,91,299);
        playbutton playbutton = new playbutton();
        addObject(playbutton,282,72);
        playbutton.setLocation(296,88);
        playbutton.setLocation(319,81);
        info.setLocation(105,305);
        info.setLocation(84,323);
        playbutton.setLocation(323,79);
        removeObject(playbutton);
        info.setLocation(320,64);
        Greenfoot.playSound("a-jazz-piano-110481.mp3");
    }
}
