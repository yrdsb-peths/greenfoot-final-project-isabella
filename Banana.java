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
     * Sets the speed of the banana actor
     */
    public Banana()
    {
        speed = Greenfoot.getRandomNumber(4)+1;
    }

    /**
     * Allows score to increase and removal of object
     */
    public void act()
    {

        setLocation(getX()-speed, getY());
        if(getX() == 0)
        {
            MyWorld.score.add(0);
            getWorld().removeObject(this);

        }
    }
}
