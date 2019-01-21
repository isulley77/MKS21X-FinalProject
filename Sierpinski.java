import java.awt.image.*;
import java.awt.Graphics;
import java.lang.Math;
import java.awt.Color;
import java.awt.Point;


public class Sierpinski extends FractalPlane{


    public Sierpinski(String filename, int iter, String bgcolor, String frcolor){
        
        super(filename, iter, bgcolor, frcolor);
        
        setColors(bgcolor, frcolor);
        setBackgroundColor();
        
        paint();
        save(filename);
    
    
    }
    
    public void paint(Graphics drawing){
        
        Point p1 = new Point(WIDTH / 2, 100);
        Point p2 = new Point(100, HEIGHT - 100);
        Point p3 = new Point(WIDTH - 100, Height - 100);
        
        drawSierpinkski(p1, p2, p3, drawing, iterations);
        
        //drawing.setColor(fractalColor);
    
    }
    
}


