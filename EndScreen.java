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
    public void prepare(String message){
        PlayAgain winner = new PlayAgain(message, 60);
        addObject(winner, getWidth()/2, getHeight()/2);
        
        PlayAgain playAgain = new PlayAgain("\"P\" para volver a jugar", 25);
        addObject(playAgain, getWidth()/2, getHeight()/2 + 50);
        
        PlayAgain exit = new PlayAgain("\"O\" para salir", 25);
        addObject(exit, getWidth()/2, getHeight()/2 + 85);
    }
}
