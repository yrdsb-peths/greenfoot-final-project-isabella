import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cart here.
 * 
 * @Isabella (your name) 
 * @June 14 2022 (a version number or a date)
 */
public class Cart extends Actor
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
        // Sets the keys WASD to move the cart
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
        // Allows the cart to remove the strawberry and banana class
        if(isTouching(Strawberry.class))
        {
            removeTouching(Strawberry.class);
            MyWorld.score.add(2);
            
          
        }
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld.score.add(4);
            
          
        }
    }
}

