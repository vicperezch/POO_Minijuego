import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    public void act()
    {
      hover();
      if (Greenfoot.mouseClicked(this)){
          Greenfoot.stop();
      }
    }
    
    public Exit(){
        GreenfootImage playButton = new GreenfootImage(150, 60);
        Font adjusted = new Font(true, false, 50);
        playButton.setFont(adjusted);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Salir", 0, 50);
        setImage(playButton);
    }
}
