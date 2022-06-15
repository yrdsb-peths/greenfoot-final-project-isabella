import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and Mouseinfo)

/**
 * Write a description of class info here.
 * 
 * @Isabella 
 * @June 14 2022 (
 */
public class Info extends Actor
{
    /**
     * Act - do whatever the info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            //Allows the button to minimize in size when pressed on
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
                (int)Math.round(getImage().getHeight()*0.9));

            Greenfoot.delay(5);
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new InstructionsWorld());

        }
    }
}
