import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Directs player to Home Screen
 * 
 * @Isabella
 * @June 14 2022 
 */
public class Quit extends Actor
{
    /**
     * Act - do whatever the Quit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Allows button to minimize in size, produce sound and set to a 
        // new world
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
                (int)Math.round(getImage().getHeight()*0.9));
            Greenfoot.delay(5);
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new HomeWorld());
        }    
    }
}
