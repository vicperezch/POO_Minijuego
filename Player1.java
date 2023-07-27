import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Ship{
    private boolean eDown;
    private int fireDelay = 0;
    
    public void act() {
        movement("w", "s", "d", "a");
        shootProjectile();
        checkShip(Player2.class);
        fireDelay--;
    }
    
    public void shootProjectile(){
        if (!eDown && Greenfoot.isKeyDown("e") && fireDelay <= 0){
            eDown = true;
            fireDelay = 30;
            shoot(90, Player2.class, 2);
        }
        if (eDown && !Greenfoot.isKeyDown("e")){
            eDown = false;
        }
    }
}
