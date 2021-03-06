//import java.io.*;
//import java.imageio.*;
//import java.awt.Color;
import java.util.Scanner;

public class Driver{

    public static String type;
    public static String fileName;
    public static String fractalColor;
    public static String backgroundColor;
    public static int iterations;

  public static void main(String[] args){

   Scanner userInput = new Scanner(System.in);
   
   
    
    //Color bgcolor = c.getColor(args[2]);
    //Color frcolor = c.getColor(args[3]);

    //if(
    
    //new FractalPlane(args[0], Integer.parseInt(args[1]), args[2], args[3]);
    
    //String name = args[0];
    //String iterations = args[1];
    
    //new FractalPlane();
    //FractalPlane.setName(name);
    //FractalPlane.setIterations(parseInt(iterations));
    
    
    
    // 1 Please Enter the fractal you would like to draw (KochSnowflake, Sierpinski)
    System.out.print("Please Enter the fractal you would like to draw (KochSnowflake, Sierpinski): ");
    type = userInput.next();
    type = type.toLowerCase();
    
    // 2 Please Enter the fractal color you would like
    System.out.print("Enter the fractal color you would like: ");
    fractalColor = userInput.next();
    
    // 3 Please enter the background color you would like
    System.out.print("Enter the background color you would like: ");
    backgroundColor = userInput.next();
    
    
    
    // 4 Please enter the number of iterations for your fractal
    System.out.print("Enter the number of iterations you would like: ");
    iterations = Integer.parseInt(userInput.next());
    
    // 5 Please enter a filename for your fractal image
    System.out.print("Enter the filename for your fractal image: ");
    fileName = userInput.next();
    
    System.out.println("Your fractal has been generated, check the main directory");
    
    //KochSnowflake
    if(type.equals("kochsnowflake")){
        new KochSnowflake(fileName, iterations, backgroundColor, fractalColor);
    }
    
    //Sierpinski Triangle
    if(type.equals("sierpinski")){
        new Sierpinski(fileName, iterations, backgroundColor, fractalColor);
    }
     
    
    
  }
}
