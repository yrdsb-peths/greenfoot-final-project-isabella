import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lets player replay game
 * 
 * @Isabella 
 * @June 2022
 */
public class Replay extends Actor
{
    /**
     * Act - do whatever the Replay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(Greenfoot.mousePressed(this))
        {
            //Minimizes button when clicked on
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
                (int)Math.round(getImage().getHeight()*0.9));

            Greenfoot.delay(5);
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
