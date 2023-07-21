import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    public void act()
    {
        hover();
        click(new Sea());
    }
    
    // Construye un botón con el texto "Jugar"
    public Play(){
        GreenfootImage playButton = new GreenfootImage(150, 60);
        Font adjusted = new Font(true, false, 50);
        playButton.setFont(adjusted);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Jugar", 0, 50);
        setImage(playButton);
    }
}
