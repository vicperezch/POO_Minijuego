import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sea extends World
{
    // Las barras de vida de cada jugador
    private Healthbar healthbar1 = new Healthbar();
    private Healthbar healthbar2 = new Healthbar();
    
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
        addObject(healthbar1,783,136);
        healthbar1.setLocation(888,34);
        Player1 ship = new Player1();
        addObject(ship,764,492);
        
        addObject(healthbar2,176,38);
        Player2 ship2 = new Player2();
        addObject(ship2,160,89);
        ship2.setLocation(160,89);
        ship2.setLocation(192,104);
    }
    
    // Retorna una de las barras
    public Healthbar getHealthbar(int player){
        if (player == 1){
            return healthbar1;
        } else {
            return healthbar2;
        }
    }
}
