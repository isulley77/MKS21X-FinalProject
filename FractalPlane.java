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

public int getSize();

public int setSize();

public String setName();

public String getName();

public void draw();

public void setColor();

}
