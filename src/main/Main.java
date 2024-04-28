package main;

import main.Window.CoreRendering;
import main.Window.Window;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.MemoryStack;

import java.nio.*;

import static main.Window.CoreRendering.drawQuad;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {


    public static void update() {
        glClearColor(0.0f, 1.0f, 0.0f, 0.0f);

        drawQuad(.10f,.10f,.50f,.50f);
    }

    public static void main(String[] args) {
        Window.run();
    }
}