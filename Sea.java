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
    private Healthbar healthbar1 = new Healthbar("Jugador 1");
    private Healthbar healthbar2 = new Healthbar("Jugador 2");
    private GreenfootSound backgroundMusic;
    
    public Sea()
    {    
        super(1000, 599, 1); 
        prepare();
        backgroundMusic = new GreenfootSound("2020-03-22_-_8_Bit_Surf_-_FesliyanStudios.com_-_David_Renda.mp3");
        backgroundMusic.playLoop();

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {    
        
        addObject(healthbar2,783,136);
        healthbar2.setLocation(888,34);
        Player2 ship = new Player2();
        addObject(ship,764,492);

        addObject(healthbar1,176,38);
        Player1 ship2 = new Player1();
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
