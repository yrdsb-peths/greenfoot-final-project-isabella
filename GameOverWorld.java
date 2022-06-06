import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        replay.setLocation(425,251);
        quit.setLocation(183,229);
        replay.setLocation(486,236);
        quit.setLocation(184,233);
        quit.setLocation(341,304);
        replay.setLocation(285,224);
        quit.setLocation(290,277);
        replay.setLocation(132,236);
        quit.setLocation(468,226);
        replay.setLocation(191,236);
        quit.setLocation(420,236);
        replay.setLocation(135,240);
        replay.setLocation(199,232);
        quit.setLocation(432,231);
        replay.setLocation(188,226);
        replay.setLocation(167,234);
    }
}
