import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends Actor
{
    private int speed;
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public banana()
    {
        speed = Greenfoot.getRandomNumber(2)+1;
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-speed, getY());
        if(getX() == 0)
        {
            MyWorld.score.add(0);
            getWorld().removeObject(this);
            
        }
    }
}
