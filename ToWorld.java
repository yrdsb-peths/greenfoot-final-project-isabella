import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToWorld extends Actor
{
    /**
     * Act - do whatever the ToWorld wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Allows the button to minimize in size when pressed on
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
                (int)Math.round(getImage().getHeight()*0.9));
            Greenfoot.delay(5);
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new BeforeWorldTwo());
        }
    }
}
