import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int timer = 15;
    
    // Desaparece luego de poco tiempo
    public void act()
    {
        timer--;
        if (timer == 0){
            getWorld().removeObject(this);
        }
    }
}
