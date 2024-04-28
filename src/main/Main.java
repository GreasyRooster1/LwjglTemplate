package main;

import main.Window.Window;

import static main.Window.CoreRendering.rect;
import static main.Window.CoreRendering.triangle;
import static org.lwjgl.opengl.GL11.*;

public class Main {


    public static void update() {
        glClearColor(0.0f, 1.0f, 0.0f, 0.0f);

        rect(10,10,100,100);
        triangle(110,110,320,200,0,140);
    }

    public static void main(String[] args) {
        Window.run();
    }
}