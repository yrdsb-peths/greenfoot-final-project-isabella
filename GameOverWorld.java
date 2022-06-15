import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world contains the end screen
 * 
 * @author Isabella
 * @version June 2022
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        // Shows players their end score 
        showText("YOUR SCORE: " + MyWorld.score.getValue()+" points", 450, 305); 

        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Replay replay = new Replay();
        addObject(replay,306,240);
        Quit quit = new Quit();
        addObject(quit,134,239);

        replay.setLocation(199,232);
        quit.setLocation(432,231);
        replay.setLocation(188,226);
        replay.setLocation(167,234);
    }
}
