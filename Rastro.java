import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rastro extends Actor {
    private int timer = 35; // Establecer el tiempo que durará el rastro (ajusta según tus necesidades)

    public void act() {
        timer--;
        if (timer <= 0) {
            getWorld().removeObject(this); // Eliminar el objeto Rastro cuando el temporizador llega a cero
        }
    }

    public Rastro() {
        GreenfootImage image = new GreenfootImage(10, 10);
        image.setColor(Color.WHITE);
        image.setTransparency(50);
        image.fill();
        setImage(image);
    }
}


