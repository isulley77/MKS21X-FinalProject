/*
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
*/
import java.awt.Color;
import java.awt.Graphics2D;

public class FractalPlane{

  private int height;
  private int width;
  private boolean[][] values;
  private String type;
  private Color backgroundColor;
  private Color fractalColor;
  private BufferedImage imagePlane;
  private int iterations;


  FractalPlane(){

    this.height = height;
    this.width = width;
    this.type = type;
    this.backgroundColor = null;
    this.fractalColor = null;
    



  }

  public int getSize(){
    return this.size;
  }

  public int setSize(int newSize){

    size = newSize;
    return newSize;

  }
    
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
