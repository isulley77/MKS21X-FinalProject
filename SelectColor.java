import java.awt.Color;

public class SelectColor{



static Color myColor;

public SelectColor(){

    myColor = Color.white;
}

static Color getColor(String color){

    if(color.equals("white")){
        myColor = Color.white;
    }
    if(color.equals("black")){
        myColor = Color.black;
    }
    if(color.equals("blue")){
        myColor = Color.blue;
    }
    if(color.equals("red")){
        myColor = Color.red;
    }
    if(color.equals("green")){
        myColor = Color.green;
    }
    if(color.equals("orange")){
        myColor = Color.orange;
    }
    if(color.equals("pink")){
        myColor = Color.pink;
    }

    return myColor;


}


}
