import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShipP_2 extends Actor{
    public void act() {
        if (Greenfoot.isKeyDown("w")){
            move(3);
        }
        if (Greenfoot.isKeyDown("s")){
            move(-1);
        }
        if (Greenfoot.isKeyDown("a")){
            turn(-1);
        }
        if (Greenfoot.isKeyDown("d")){
            turn(1);
        }
    }    
}
