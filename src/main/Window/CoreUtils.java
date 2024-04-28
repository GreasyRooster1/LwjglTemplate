package main.Window;

import static main.Window.Window.width;

public class CoreUtils {
    public static float scaleXCord(float pixelX){
        return pixelX/(width) -1;
    }
    public static float scaleYCord(float pixelY){
        return (pixelY/(Window.height) -1)*-1;
    }
    public static float scaleWCord(float pixelW){
        return pixelW/(width);
    }
    public static float scaleHCord(float pixelH){
        return (pixelH/(Window.height)) *-1;
    }
}
