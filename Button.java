import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean mouse = false;
    private int max_transparency = 255;
    
    // Revisa si el cursor se encuentra sobre el botón
    public void hover(){
        if (Greenfoot.mouseMoved(null)){
            mouse = Greenfoot.mouseMoved(this);
        }
        
        if (mouse){
            adjTransparency(max_transparency/2);
        } 
        else {
            adjTransparency(max_transparency);
        }
    }
    
    // Crea un nuevo mundo si se da click al botón
    public void click(World world){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
    
    // Cambia la transparencia del botón
    public void adjTransparency(int adj){
        GreenfootImage temp = getImage();
        temp.setTransparency(adj);
        setImage(temp);
    }
}
