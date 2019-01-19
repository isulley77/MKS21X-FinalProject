public class KochSnowflake{

    public KochSnowflake(BufferedImage imageplane, Color fractalColor, int iterations)

    public void paint(Graphics drawing){
            
            HEIGHT = HEIGHT - HEIGHT/4;
            int origin = width/2 - HEIGHT/2;
            
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

    
}
