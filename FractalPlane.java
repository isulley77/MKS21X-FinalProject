import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Graphics2D;

public class FractalPlane{

  private int size;
  private String name;
  private Color backgroundColor;


  FractalPlane(int size, String name){

    this.name = null;

    BufferedImage plane = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);


  }

  public int getSize(){
    return this.size;
  }

  public int setSize(int newSize){

    //replaces plane with new BufferedImage object of desired size
    plane = new BufferedImage(newSize, newSize, BufferedImage.TYPE_INT_ARGB);
    return newSize;

  }

  public String setName(String newName){
    this.name = newName;
    return newName;
  }

  public String getName(){
    return this.name;
  }

  public void setColor(Color c){
    /*iterates across every pixel
    for(int x = 0; x < size; x++){
      for(int y = 0; y < size; y++){

      //sets every pixel of plane to desired color
      plane.setRGB(x, y, c);
      }
    }
    */
    Graphics2D backgroundColor = plane.createGraphics();
    backgroundColor.setBackground(c);
  }
}
