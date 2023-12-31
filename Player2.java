import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player2 extends Ship{
    private boolean spaceDown;
    private int fireDelay = 0;
    
    public void act() {
        movement("up", "down", "right", "left");
        leaveTrail();
        shootProjectile();
        fireDelay--;
    }
    
    public void shootProjectile(){
       // Solo permite disparar una vez cuando se presiona la tecla y añade delay
       if (!spaceDown && Greenfoot.isKeyDown("space") && fireDelay <= 0){
            spaceDown = true;
            fireDelay = 30;
            shoot(270, Player1.class, 1);
       }
       if (spaceDown && !Greenfoot.isKeyDown("space")){
            spaceDown = false;
       }
    }
}
