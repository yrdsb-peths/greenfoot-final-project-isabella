import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class strawberry here.
 * 
 * @Isabella 
 * @June 2022
 */
public class Strawberry extends Actor
{
    private int speed;

    /**
     * Sets the speed of the strawberry actor
     */
    public Strawberry()
    {
        speed = Greenfoot.getRandomNumber(4)+1;
    }

    /**
     * Allows score to increase and removal of object
     */
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
