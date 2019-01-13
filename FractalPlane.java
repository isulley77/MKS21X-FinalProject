import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class FractalPlane{

  private int HEIGHT = 480;
  private int WIDTH = 480;
 // private boolean[][] values;
 // private String type;
  private Color backgroundColor;
  private Color fractalColor;
  private BufferedImage imagePlane;
  private Graphics drawing;
  private int iterations;
  private String name;


  public FractalPlane(){

    //this.height = HEIGHT;
    //this.width = WIDTH;
    //this.type = type;
    this.backgroundColor = Color.black;
    this.fractalColor = Color.white;
    
    imagePlane = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    drawing = imagePlane.getGraphics();
    drawKoch(0, HEIGHT/2 ,WIDTH, HEIGHT/2, drawing, 3);
    save("mySnowflake");
  }
  
  public void drawKoch(double x1, double y1, double x2, double y2, Graphics drawing, int iterations){
    
    drawing.setColor(fractalColor);
    
    
    
    if(iterations == 0){
    
        return;
    }
    
    else if(iterations == 1){
    
        drawing.drawLine( (int)x1, (int)y2, (int)x2, (int)y2);
        
    
    }
    
    else{
    
        iterations--;
        
        if(Math.abs(x2-x1) != 0){
            
            double slope = (y2 - y1) / (x2 - x1);
            double thirdsegment = (x2 - x1) / 3;
            
            double newX1 = x1 + thirdsegment; 
            double newY1 = y1 + thirdsegment * slope;
            double newX2 = x2 + 2 * thirdsegment;
            double newY2 = y2 + 2 * thirdsegment * slope;
            
            drawKoch(x1, y1, newX1, newY1, drawing, iterations);
            drawKoch(newX2, newY2, x2, y2, drawing, iterations);
            drawKoch(newX1, newY1, (newX1 + newX2) / 2 + (newY2 - newY1) / 2 * Math.sqrt(3), (newY2 + newY1) / 2 + (newX2 - newX1) / 2 * Math.sqrt(3), drawing, iterations);
            drawKoch((newX2 + newX1) / 2 + (newY2 - newY1) / 2 * Math.sqrt(3), (newY2 + newY1) / 2 - (newX2 - newX1) / 2 * Math.sqrt(3), newX2, newY2, drawing, iterations);
            
        }
        
            else{
            
            double thirdsegment = (y2 - y1) / 3;
            double newY1 = y1 + thirdsegment;
            double newY2 = y1 + 2 * thirdsegment;
            
            drawKoch(x1, y1, x1, y1 + thirdsegment, drawing, iterations);
            drawKoch(x1, y1 + 2 * thirdsegment, x2, y2, drawing, iterations);
            drawKoch(x1, newY1, x1 + (newY2 - newY1) / 2 * Math.sqrt(3), (newY2 + newY1) / 2, drawing, iterations);
            drawKoch(x1 + (newY2 - newY1) / 2 * Math.sqrt(3), (newY2 + newY1) / 2, x2, newY2, drawing, iterations);
        
        
        
            }
    
    
    }
        
    
    
  
  }
  
  /*

  public int getSize(){
    return this.size;
  }


  public int setSize(int newSize){

    size = newSize;
    return newSize;

  }
  */
  
  String setName(String newName){
    this.name = newName;
    return newName;
  }


  public String getName(){
    return this.name;
  }

 
  public void setBackgroundColor(Color c){
    
    drawing.setColor(c);
    drawing.fillRect(0, 0, WIDTH, HEIGHT);
    
    
    
    /*iterates across every pixel
    for(int x = 0; x < size; x++){
      for(int y = 0; y < size; y++){

      //sets every pixel of plane to desired color
      plane.setRGB(x, y, c);
      }
    }
    */
    
    /*
    Graphics2D backgroundColor = plane.createGraphics();
    backgroundColor.setBackground(Color.WHITE);
    */
  }
  
  public void save(String name){
    try{
    
        File finalImage = new File(name + ".png");
        ImageIO.write(imagePlane, "png", finalImage);
        
        }catch(Exception e){
            return;
            }
  }



 public static void main(String[] args){
 
 new FractalPlane();
 
 }
 }
