/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square campo;
    private Person pepe;
    private Circle ojo1;
    private Circle ojo2;
    private Square boca;
   
    
   

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        campo = new Square();
        campo.changeColor("green");
        campo.moveHorizontal(-350);
        campo.moveVertical(130);
        campo.changeSize(1500);
        campo.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        pepe = new Person();
        pepe.changeColor("blue");
        pepe.moveHorizontal(-200);
        pepe.moveVertical(20);
        pepe.makeVisible();
        
        ojo1 = new Circle();
        ojo1.changeColor("blue");
        ojo1.moveHorizontal(-220);
        ojo1.moveVertical(0);
        ojo1.changeSize(30);
        
        ojo2 = new Circle();
        ojo2.changeColor("green");
        ojo2.moveHorizontal(-160);
        ojo2.moveVertical(0);
        ojo2.changeSize(30);
        
        boca = new Square();
        boca.changeColor("magenta");
        boca.changeSize(20);
        boca.moveHorizontal(-265);
        boca.moveVertical(30);
        
         
        
       
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * Change this picture to use moveSun display
     */
    public void moveSun()
    {
        if (sun != null)   // only if it's painted already...
        {
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            pepe.slowMoveHorizontal(1);
            sun.slowMoveVertical(2);
            
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            pepe.changeColor("black");
            ojo1.changeColor("black");
            ojo2.changeColor("black");
            boca.changeColor("black");
        }
    }
    /**
     * Change this picture to use funny display
     */
    public void funny()
    {
        if (wall != null)   // only if it's painted already...
        {
            ojo1.makeVisible();
            ojo2.makeVisible();
            boca.makeVisible();
            ojo1.moveHorizontal(305);
            ojo2.moveHorizontal(320);
            boca.moveHorizontal(315);
            ojo1.moveVertical(-20);
            ojo2.moveVertical(-20);
            boca.moveVertical(-30);
            
            
            
        }
    }
}
