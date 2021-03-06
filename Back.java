import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @Isabella (your name) 
 * @June 14 2022 (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            //This is to allow the button to minimize in size
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
                (int)Math.round(getImage().getHeight()*0.9));

            Greenfoot.delay(5);
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new BeforeWorld());
        }
    }
}
