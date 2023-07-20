import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player2 extends Ship{
    
    public void act() {
        movement("w", "s", "d", "a");
        shoot("space", 90, Player1.class, 1);
    }
}
