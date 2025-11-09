import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    private static final double CANNON_BALL_VELOCITY = 1500.0;
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
            Vector2D cannonToMouse = new Vector 2D(mouse.getX() - getX(),
                                                   mouse.getY() - getY();
                                                   
            double adjacent = cannonToMouse.getX();
            double opposite = cannonToMouse.getY();
            
            double angleRadians = Math.atan2(opposite, adjacent);
            double angleDegrees = Math.toDegrees(angleRadians);
    
            setRotation((int) angleDegrees;
        }
    }
     
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
            Vector2D cannonToMouse = new Vector 2D(mouse.getX() - getX(),
                                                   mouse.getY() - getY();
            alignWithVector(cannonToMouse);
            
            if (Greenfoot.mouseCLicked(null))
            {
                cannonToMouse.normalize();
                cannonToMouse = Vector2D.multiply(cannonToMouse,CANNON_Ball_VELOCITY);
                
                CannonBall newBall = new CannonBall();
                newBall.setVelocity(cannonToMouse);
                getWorld().addObject(newBall, getX(), getY());
            }                          
        }
    }
}
