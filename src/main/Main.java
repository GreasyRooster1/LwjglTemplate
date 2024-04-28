package main;

import main.Window.Window;

import static main.Window.CoreRendering.rect;
import static org.lwjgl.opengl.GL11.*;

public class Main {


    public static void update() {
        glClearColor(0.0f, 1.0f, 0.0f, 0.0f);

        rect(.10f,.10f,.50f,.50f);
    }

    public static void main(String[] args) {
        Window.run();
    }
}