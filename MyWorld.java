import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter score = new Counter("Score : ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new strawberry(), 948,Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new Banana(), 948,Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new bomb(), 948,Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90) < 3)
        {
            addObject(new rock(), 948,Greenfoot.getRandomNumber(360));
        }
        if(MyWorld.score.getValue()>=30)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new LevelTwoWorld());
            
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cart cart = new cart();
        addObject(cart,41,244);
        cart.setLocation(111,255);
        
        Banana banana = new Banana();
        addObject(banana,397,68);
        
        strawberry strawberry = new strawberry();
        addObject(strawberry,232,115);
        bomb bomb = new bomb();
        addObject(bomb,414,214);
        rock rock = new rock();
        addObject(rock,530,338);
    }
}
