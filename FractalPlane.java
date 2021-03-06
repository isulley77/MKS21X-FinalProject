import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class FractalPlane{

int HEIGHT = 1600;
int WIDTH = 1600;
 // private boolean[][] values;
String type;
Color backgroundColor;
Color fractalColor;
BufferedImage imagePlane;
Graphics drawing;
int iterations;
String name;

//FractalPlane Constructor
  public FractalPlane(String filename, int iter, String bgcolor, String frcolor){

    //this.HEIGHT = HEIGHT;
    //this.WIDTH = WIDTH;
    
    //set fractal type
    //type = type.toLowerCase();
    
    //set image colors
    
    //setColors(bgcolor, frcolor);
    //setBackgroundColor();
    
    /*
    SelectColor c = new SelectColor(); //Select Color class instance
    backgroundColor = c.getColor(bgcolor); //Set background color
    fractalColor = c.getColor(frcolor); //Set fractal color
    */
    
    
    iterations = iter; // Set num of iterations
    name = filename; // Set image file name
    
    //Create BufferedImage for drawing
    imagePlane = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    
    //Get Graphics for BufferedImage
    drawing = imagePlane.getGraphics();
    
    //Set Background Color
    //drawing.setColor(backgroundColor); //  Set drawing color
    //drawing.fillRect(0,0,HEIGHT, WIDTH); // Set color of background
    
    //Fractal type selection
    
    /*KochSnowflake
    if(type.equals("kochsnowflake")){
        new Kochsnowflake(drawing, fractalColor, iterations);
    }
    
    Sierpinski Triangle
    if(type.equals("sierpinski"){
        new Sierpinski(imagePlane, drawing, fractalColor, iterations);
    }
    */ 
        
    //paint(drawing);
    //drawKoch(0, HEIGHT/2 ,WIDTH, HEIGHT/2, drawing, iterations);
    
    
    
    
    //Saves drawing to .png file with specified name
    //save(name);
  }
  
  /*
  
  public void drawKoch(double x1, double y1, double x2, double y2, Graphics drawing, int iterations){
    
    drawing.setColor(fractalColor);
    
    
    
    if(iterations == 0){
    
        //return;
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
  */
  
  
  /* public void paint(Graphics drawing){
        
        HEIGHT = HEIGHT - HEIGHT/4;
        int origin = WIDTH/2 - HEIGHT/2;
        
        drawKoch(origin + 20, HEIGHT - 20,   origin + HEIGHT - 20, HEIGHT - 20, drawing, iterations);
        drawKoch(origin + HEIGHT - 20,HEIGHT - 20, origin + HEIGHT/2,20, drawing, iterations);
        drawKoch(origin + HEIGHT/2, 20, origin + 20, HEIGHT - 20, drawing, iterations);
   
   
   }
  
 
    private void drawKoch(int x1, int y1, int x5, int y5, Graphics drawing, int iterations){
          int changeX;
          int changeY; 
          int x2;
          int y2;
          int x3;
          int y3;
          int x4;
          int y4;
  
          if (iterations == 0){
              drawing.setColor(fractalColor);
              drawing.drawLine(x1, y1, x5, y5);
          }
          else{
                changeX = x5 - x1;
                changeY = y5 - y1;
  
                x2 = x1 + changeX / 3;
                y2 = y1 + changeY / 3;
  
                x3 = (int) (0.5 * (x1+x5) + Math.sqrt(3) * (y1-y5)/6);
                y3 = (int) (0.5 * (y1+y5) + Math.sqrt(3) * (x5-x1)/6);
  
                x4 = x1 + 2 * changeX /3;
                y4 = y1 + 2 * changeY /3;
  
                drawKoch(x1, y1, x2, y2, drawing, iterations - 1);
                drawKoch(x2, y2, x3, y3, drawing, iterations - 1);
                drawKoch(x3, y3, x4, y4, drawing, iterations - 1);
                drawKoch(x4, y4, x5, y5, drawing, iterations - 1);
            }
        }   

    */
  


  public int getHeight(){
    return HEIGHT;
  }


  public int getWidth(){
    return WIDTH;
  }
  
  
  /*sets filename
  String setName(String newName){
    this.name = newName;
    return newName;
  }


  public String getName(){
    return this.name;
  }

  */
  
  public void setColors(String bgcolor, String frcolor){
  
    //set image colors
    SelectColor c = new SelectColor(); //Select Color class instance
    backgroundColor = c.getColor(bgcolor); //Set background color
    fractalColor = c.getColor(frcolor); //Set fractal color
  
  
  }
  
 //sets BufferedImage background color
  public void setBackgroundColor(){
    
    drawing.setColor(backgroundColor);
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
  
  
  //saves image to .png file 
  public void save(String name){
    try{
    
        File finalImage = new File(name + ".png");
        ImageIO.write(imagePlane, "png", finalImage);
        
        }catch(Exception e){
            return;
            }
  }


/* main function, creates new FractalPlane
    public static void main(String[] args){
 
        new FractalPlane(args[0], Integer.parseInt(args[1]));
 
    }
    
*/
 }
