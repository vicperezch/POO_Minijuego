import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ships here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{   
    // Movmiento de los barcos
    public void movement(String up, String down, String left, String right){
        if (Greenfoot.isKeyDown(up)){
            move(3);
        }
        if (Greenfoot.isKeyDown(down)){
            move(-1);
        }
        if (Greenfoot.isKeyDown(right)){
            turn(-1);
        }
        if (Greenfoot.isKeyDown(left)){
            turn(1);
        }
    }
    
    // Disparo
    public void shoot(int rotation, Class target, int noHealthbar) {
            Projectile projectile = new Projectile(getRotation() + rotation, target, noHealthbar);
            getWorld().addObject(projectile, getX(), getY());
    }
}
