import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cart extends Actor
{
    /**
     * Act - do whatever the cart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeyPress();
        checkCollision();
       
        
    }
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("w"))
        {
          setLocation(getX(),getY()-6);  
        }
        if(Greenfoot.isKeyDown("s"))
        {
          setLocation(getX(),getY()+6);  
        }
        if(Greenfoot.isKeyDown("a"))
        {
          setLocation(getX()-4,getY());  
        }
        if(Greenfoot.isKeyDown("d"))
        {
          setLocation(getX() + 4,getY());  
        }
    }
    
    private void checkCollision()
    {
        if(isTouching(strawberry.class))
        {
            removeTouching(strawberry.class);
            MyWorld.score.add(2);
            
          
        }
        if(isTouching(banana.class))
        {
            removeTouching(banana.class);
            MyWorld.score.add(4);
            
          
        }
    }
}

