import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Button
{
    // Inicia el juego nuevamente
    public void act(){
        if (Greenfoot.isKeyDown("p")){
            Greenfoot.setWorld(new Sea());
        }
    }
    
    // Muestra un mensaje en pantalla
    public Text(String message, int fontSize)
    {
        GreenfootImage finalText = new GreenfootImage(900, 100);
        Font adjusted = new Font(true, false, fontSize);
        finalText.setFont(adjusted);
        finalText.setColor(Color.BLACK);
        finalText.drawString(message, 150, 50);
        setImage(finalText);
    }
}
