import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Achievement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Achievement extends Actor
{
    /**
     * Act - do whatever the Achievement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed ,in the environment.
     */
    public void act()
    {
        if(MyWorld.score.getValue()>=10)
        {
            Achievement achievement = new Achievement();
            MyWorld w = (MyWorld)getWorld();
            w.addObject(achievement,489,38);
            /*Greenfoot.delay(5);
            Greenfoot.setWorld(new LevelTwoWorld());
            */
           
        }
    }
}
