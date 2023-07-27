import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player2 extends Ship{
    private boolean eDown;
    private int fireDelay = 0;
    
    public void act() {
        movement("w", "s", "d", "a");
        shootProjectile();
        fireDelay--;
    }
    
    public void shootProjectile(){
        if (!eDown && Greenfoot.isKeyDown("e") && fireDelay <= 0){
            eDown = true;
            fireDelay = 30;
            shoot(90, Player1.class, 1);
        }
        if (eDown && !Greenfoot.isKeyDown("e")){
            eDown = false;
        }
    }
}
