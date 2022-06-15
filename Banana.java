import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @Isabella (your name) 
 * @June 14 2022 (a version number or a date)
 */
public class Banana extends Actor
{
    private int speed;
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Banana()
    {
        speed = Greenfoot.getRandomNumber(4)+1;
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
