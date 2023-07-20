import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healthbar extends Actor
{
    // Vida inicial
    private int health = 100;
    
    public void act(){
    }
    
    // Resta a la vida
    public void substractHealth(int hp){
        health -= hp;
    }
    
    // Retorna la vida actual
    public int getHp(){
        return health;
    }
}
