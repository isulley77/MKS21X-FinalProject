import java.io.*;
import java.imageio.*;

public class Driver{

  public static void main(String[] args){

    String name = args[0];

    FractalPlane plane = new FractalPlane(500, name);
    File f = new File(name + ".png");
    ImageIO.write(plane, "PNG", f);
  }
}
