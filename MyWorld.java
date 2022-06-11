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
            addObject(new Strawberry(), 948,Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(120) < 3)
        {
            addObject(new Banana(), 948,Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(150) < 2)
        {
            addObject(new Bomb(), 948,Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(200) < 2)
        {
            addObject(new Rock(), 948,Greenfoot.getRandomNumber(360));
        }
        /*if(MyWorld.score.getValue()>=40)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new LevelTwoWorld());
            
        }
        */
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cart cart = new Cart();
        addObject(cart,41,244);
        cart.setLocation(111,255);
        
        Banana banana = new Banana();
        addObject(banana,397,68);
        
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,232,115);
        Bomb bomb = new Bomb();
        addObject(bomb,414,214);
        Rock rock = new Rock();
        addObject(rock,530,338);
        
        
        addObject(score,80,45);
        score.setValue(0);
        
    }
}
