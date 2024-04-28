package main.Window;

import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11C.GL_QUADS;

public class CoreRendering {

    public static void drawQuad(float x, float y, float width, float height) {
        glColor3f(0,1,1);

        glBegin(GL_QUADS);

        glVertex2f(-x, y);
        glVertex2f(width, y);
        glVertex2f(width, -height);
        glVertex2f(-x, -height);

        glEnd();
    }
}
