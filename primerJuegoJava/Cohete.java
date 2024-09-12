import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cohete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cohete extends Actor
{
    /**
     * Act - do whatever the cohete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Cohete(){
        setRotation(270);
    }
        
/**
     * Declaraciones
     */
    Boolean canFire = true; 

    /**
     * Metodos getter and setters
     */
    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act() 
    {
        moveAround();
        fireProjectile();
    }   

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de RocketSpace completos y con elementos completos no estandares.
     */

    //El proceso de mover con las teclas de teclado
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+5, getY());//Moverse hacia la derecha
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-5, getY());//Moverse hacia la izquierda
        }
         if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-5);//Moverse hacia la arriba
        }
         if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+5);//Moverse hacia la abajo
        }

    }

    //Accion de dispoaro para disparar
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
            Greenfoot.playSound("disparoLaser.mp3");//Accion de sonido
        } else if(!Greenfoot.isKeyDown("space")){//Tecla para disparar "Space"
            canFire = true;   
        }

    }
    }



