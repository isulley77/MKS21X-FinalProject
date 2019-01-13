/*
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
*/
import java.awt.Color;
import java.awt.Graphics2D;

public class FractalPlane{

  private int HEIGHT = 480;
  private int WIDTH = 480;
 // private boolean[][] values;
 // private String type;
  private Color backgroundColor;
  private Color fractalColor;
  private BufferedImage imagePlane;
  private Graphics2D drawing;
  private int iterations;


  public FractalPlane(){

    this.height = height;
    this.width = width;
    this.type = type;
    this.backgroundColor = null;
    this.fractalColor = null;
    
    imagePlane = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    drawing = imagePlane.getGraphics();
    
    


  }
  
  public void drawKoch(int x1, int y1, int x2, int y2, Graphics2D drawing, int iterations){
    
    drawing.setColor(fractalColor);
    
    
  
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
  
/*
  public String setName(String newName){
    this.name = newName;
    return newName;
  }


  public String getName(){
    return this.name;
  }
*/
 
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
}
