
/**
 * Punto 2 del taller 01
 * 
 * @author Gustavo Ojeda & Jefferson Villa
 *
 */
public class Punto2D
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    /**
     * Constructor for objects of class Punto2D
     */
    public Punto2D()
    {
        this.x = x;
        this.y= y;
    }
    
    public float distancia(Punto2D otroPunto){
        return (float) Math.sqrt(Math.pow(x-otroPunto.getX(),2) + Math.pow(y - otroPunto.getY(),2));
    }
    
    public float radio(){
        return (float)  Math.sqrt((x*x)+(y*y));
    }
    
    public float angulo(){
        return (float) Math.atan2(x,y);
    }
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
}
