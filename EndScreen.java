import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{  
    public EndScreen(String win)
    {    
        super(1000, 599, 1);
        prepare(win);
    }
    
    // Crea los textos en pantalla
    public void prepare(String win){
        Text winner = new Text("¡" + win + " ha ganado!", 60);
        addObject(winner, getWidth()/2, getHeight()/2);
        
        Text playAgain = new Text("Presiona \"P\" para volver a jugar", 25);
        addObject(playAgain, getWidth()/2, getHeight()/2 + 50);
    }
}
