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
            leaveTrail();
            move(3);
        }
        if (Greenfoot.isKeyDown(down)){
            leaveTrail();
            move(-1);
        }
        if (Greenfoot.isKeyDown(right)){
            turn(-1);
        }
        if (Greenfoot.isKeyDown(left)){
            turn(1);
        }
    }
    
    //Rastro
    public void leaveTrail() {
        getWorld().addObject(new Rastro(), getX(), getY());
    }

    // Disparo
    public void shoot(int rotation, Class target, int noHealthbar) {
            Projectile projectile = new Projectile(getRotation() + rotation, target, noHealthbar);
            getWorld().addObject(projectile, getX(), getY());
    }
    
    // Colisión entre barcos
    public void checkShip(Class otherShip){
        if (isTouching(otherShip)){
            Greenfoot.playSound("explosion.wav");
            Greenfoot.setWorld(new EndScreen("¡Ambos se hundieron!"));
        }
    }
}
