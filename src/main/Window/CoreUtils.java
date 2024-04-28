package main.Window;

public class CoreUtils {
    public float scaleXCord(float pixelX){
        return pixelX/Window.width;
    }
    public float scaleYCord(float pixelY){
        return pixelY/Window.height;
    }
}
