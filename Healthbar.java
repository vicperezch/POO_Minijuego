import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Healthbar extends Actor {
    // Vida inicial
    private int maxHealth = 100;
    private int health = maxHealth;
    private int barWidth = 100;
    private int barHeight = 10;
    private Color bgColor = Color.GRAY;
    private Color barColor = Color.GREEN;

    public Healthbar() {
        updateImage();
    }

    public void act() {        
    }

    // Resta a la vida
    public void subtractHealth(int hp) {
        health -= hp;
        if (health < 0) {
            health = 0;
        }
        updateImage();
    }

    // Retorna la vida actual
    public int getHp() {
        return health;
    }

    // Hace que la barra de vida se reduzca con la vida
    private void updateImage() {
        GreenfootImage image2 = new GreenfootImage(110, 50);
        image2.setColor(Color.WHITE);
        image2.fillRect(0, 0, 110, 50);
        
        GreenfootImage image = new GreenfootImage(barWidth + 2, barHeight + 2);
        image.setColor(bgColor);
        image.fillRect(0, 0, barWidth + 2, barHeight + 2);
        image.setColor(barColor);
        int barLength = (int) Math.ceil((double) health / maxHealth * barWidth);
        image.fillRect(1, 1, barLength, barHeight);
        setImage(image2);
        setImage(image);
    }
}
