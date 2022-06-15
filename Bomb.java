import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @Isabella (your name) 
 * @June 14 2022 (a version number or a date)
 */
public class Bomb extends Actor
{
    private int speed;
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomb()
    {
        speed = Greenfoot.getRandomNumber(1)+1;
    }
    public void act()
    {
        // Add your action code here.
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
