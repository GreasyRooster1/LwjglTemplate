package main;

import main.Window.Window;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.MemoryStack;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {


    public static void update() {
        glClearColor(0.0f, 1.0f, 0.0f, 0.0f);
        GL11.glColor3f(0f, 1f, 1f);

        glBegin(GL_QUADS);

        glVertex2f(10, 10);
        glVertex2f(100, 10);
        glVertex2f(100, 100);
        glVertex2f(10, 100);

        glEnd();
    }

    public static void main(String[] args) {
        Window.run();
    }
}