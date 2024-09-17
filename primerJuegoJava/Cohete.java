import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cohete here.
 * 
 * @author Thomas Cano 
 * @version 1.0
 */
public class Cohete extends Actor
{
    public Cohete(){
        setRotation(270);
    }
    Boolean canFire = true;
    public void act() 
    {
        moveAround();
        fireProjectile();
        rotateCohete();
    }   

    
    private void prepare()
    {
    }

    public void moveAround()
    {
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+5, getY());//Moverse hacia la derecha
        }
        else if(Greenfoot.isKeyDown("A")) {
            setLocation(getX()-5, getY());//Moverse hacia la izquierda
        }
        else if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY()-5);//Moverse hacia la arriba
        }
        else if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY()+5);//Moverse hacia la abajo
        }
    }

    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true) {
        getWorld().addObject(new Projectile(), getX(), getY());
        canFire = false;
        Greenfoot.playSound("disparoLaser.mp3");
        
        } else if(!Greenfoot.isKeyDown("space")) {
            canFire = true;   
        }
    }
    
    public void rotateCohete() {
        if(Greenfoot.isKeyDown("Right")) {
            setRotation(0);
        }
        
        if(Greenfoot.isKeyDown("Down")) {
            setRotation(90);
        }
           
        if(Greenfoot.isKeyDown("Up")) {
            setRotation(-90);
        }
            
        if(Greenfoot.isKeyDown("Left")) {
            setRotation(180);
        }
    }
}



  