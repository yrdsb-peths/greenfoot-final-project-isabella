import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @Isabella (your name) 
 * @Zhu (a version number or a date)
 */
public class Rock extends Actor
{
    private int speed;
    /**
     * Sets the speed of the rock actor
     */
    public Rock()
    {
        speed = Greenfoot.getRandomNumber(1);
    }

    /**
     *  Sets location and allows rock to be removed when touched
     */ 
    public void act()
    {
        setLocation(getX()-4, getY());
        if(isTouching(Cart.class))
        {
            removeTouching(Cart.class);
            Greenfoot.setWorld(new GameOverWorld());

        }
        if(getX() < 5)
        {
            getWorld().removeObject(this);

        }

    }
}
