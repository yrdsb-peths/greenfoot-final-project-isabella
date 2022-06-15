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
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rock()
    {
        speed = Greenfoot.getRandomNumber(1);
    }
    public void act()
    {
        // Sets location and allows rock to be removed when touched
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
