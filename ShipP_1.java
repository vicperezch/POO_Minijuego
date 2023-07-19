import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShipP_1 extends Actor{
    public void act() {
        if (Greenfoot.isKeyDown("up")){
            move(3);
        }
        if (Greenfoot.isKeyDown("down")){
            move(-1);
        }
        if (Greenfoot.isKeyDown("left")){
            turn(-1);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(1);
        }
    }    
}
