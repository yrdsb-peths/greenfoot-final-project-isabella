import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @Isabella (your name) 
 * @June 13th 2021 (a version number or a date)
 */
public class Arrow extends Actor
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[2];
    SimpleTimer timer = new SimpleTimer();

    public void act()
    {
        animateArrow();
    }

    /**
     * Adds animation to the arrow actor
     */
    public Arrow()

    {
        for(int i = 0; i < idle.length; i ++)
        {
            idle[i] = new GreenfootImage("images/idle/idle" + i + ".png");
        }
        setImage(idle[0]);

        timer.mark();
    }

    int imageIndex = 0;
    /**
     * Sets the speed of the animation
     */
    public void animateArrow()
    {
        if(timer.millisElapsed() < 150)
        {
            return;

        }
        timer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }

}
