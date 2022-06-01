import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    private int speed;
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bomb()
    {
        speed = Greenfoot.getRandomNumber(1)+1;
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-4, getY());
        if(isTouching(cart.class))
        {
            removeTouching(cart.class);
            Greenfoot.setWorld(new GameOverWorld());
            
        }
        

    }
}
