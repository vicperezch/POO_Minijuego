import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sea extends World
{

    /**
     * Constructor for objects of class Sea.
     * 
     */
    public Sea()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 599, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ShipP_1 ship = new ShipP_1();
        addObject(ship,764,492);
        ShipP_2 ship2 = new ShipP_2();
        addObject(ship2,160,89);
        ship2.setLocation(160,89);
        ship2.setLocation(192,104);
    }
}
