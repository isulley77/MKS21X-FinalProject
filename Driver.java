import java.io.*;
import java.imageio.*;

public class Driver{

      FractalPlane plane = new FractalPlane(500, name);
      File f = new File(name + ".png");
      ImageIO.write(plane, "PNG", f);

}
