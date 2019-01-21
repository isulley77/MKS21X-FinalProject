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
    

    
    public void drawSierpinski(Point p1, Point p2, Point p3, Graphics drawing, int iterations){
    
        Point midpoint12;
        Point midpoint23;
        Point midpoint31;
        
        if(iterations == 0){
        
            drawing.setColor(fractalColor);
            drawing.drawLine(p1.x, p1.y, p2.x, p2.y);
            drawing.drawLine(p2.x, p2.y, p3.x, p3.y);
            drawing.drawLine(p3.x, p3.y, p1.x, p1.y);
        
        }
        
        else{
        
            midpoint12 = ((p1.x + p2.x) / 2), ((p1.y + p2.y) / 2);
            midpoint23 = ((p2.x + p3.x) / 2), ((p2.y + p3.y) / 2);
            midpoint31 = ((p3.x + p1.x) / 2), ((p3.y + p1.y) / 2);
            
            drawSierpinski()
        
        }
    
    }
}


