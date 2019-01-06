import java.util.*;
import java.awt.*;

public class FractalPlane{

  private int height = 0;
  private int width = 0;
  private Color backgroundColor = null;


  public int setHeight(int newHeight){

      height = newHeight;
      return newHeight;
  }

  public boolean setWidth(int newWidth){

    width = newWidth;
    return true;
  }

  public boolean setColor(Color c){

    backgroundColor = c;
    return true;

  }

}
