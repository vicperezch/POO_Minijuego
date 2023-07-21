import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(1000, 599, 1); 
        prepare();
    }
    
    private void prepare(){
        GreenfootImage logo = new GreenfootImage("logo.png");
        logo.scale(getWidth()/2, getHeight()/2);
        Logo logoPicture = new Logo(logo);
        addObject(logoPicture, getWidth()/2, 200);

        Play play = new Play();
        addObject(play,453,308);
        play.setLocation(504,382);
        Exit exit = new Exit();
        addObject(exit,667,400);
        play.setLocation(308,423);
        exit.setLocation(670,406);
        exit.setLocation(658,428);
        exit.setLocation(647,425);
        exit.setLocation(680,435);
        play.setLocation(345,425);
        exit.setLocation(670,444);
        exit.setLocation(625,400);
        exit.setLocation(619,426);
        exit.setLocation(671,429);
        play.setLocation(404,424);
    }
}
