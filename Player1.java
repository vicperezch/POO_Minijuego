import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Ship{
    
    public void act() {
        movement("up", "down", "right", "left");
        shoot("space", 270, Player2.class, 2);
    }
}
