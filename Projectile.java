 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    GreenfootImage newImage = new GreenfootImage("explosion.png");
    private int direction;
    private Class attacking;
    private int noHealthbar;
    
    public void act()
    {
        movement();
        collision();
    }
    
    // Movimiento
    public void movement(){
        setRotation(direction);
        move(10);
    }
    
    public void collision(){
        // Revisa si está colisionando con el otro barco
        if (isTouching(attacking)) {
            Greenfoot.playSound("explosion.wav");
            // Toma la barra de vida del barco dañado
            Sea myWorld = (Sea) getWorld();
            Healthbar health = myWorld.getHealthbar(noHealthbar);

            // Resta 10 a la vida
            health.subtractHealth(10);

            // Si la vida llega a 0, elimina el barco
            if (health.getHp() == 0) {
                getWorld().removeObject(getOneIntersectingObject(null));
                Greenfoot.setWorld(new EndScreen("Jugador " + noHealthbar));
                Greenfoot.playSound("explosion.wav");
            }
            getWorld().removeObject(this);
        }
        
        // Elimina el proyectil si colisiona con otro proyectil
        else if (isTouching(Projectile.class)){
            getWorld().removeObject(this);
        }
        
        // Elimina el proyectil al llegar al borde del mapa
        else if (isAtEdge()) {
             getWorld().removeObject(this);
        }
    }
    
    // Constructor
    public Projectile(int dir, Class atk, int noHealthbar){
        this.direction = dir;
        this.attacking = atk;
        this.noHealthbar = noHealthbar;
    }
}
