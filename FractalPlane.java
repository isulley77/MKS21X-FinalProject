import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

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

public int setSize();

public String setName(String newName){
  this.name = newName;
  return newName;
}

public String getName(){
  return this.name;
}

public void draw();

  public void setColor(Color c){
    for(int x = 0; x < size; x++){
      for(int y = 0; y < size; y++){

      plane.setRGB(x, y, c);
      }
    }
  }
}
