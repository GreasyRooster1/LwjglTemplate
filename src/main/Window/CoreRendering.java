package main.Window;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11C.GL_QUADS;

public class CoreRendering {

    public static void rect(float x, float y, float width, float height) {
        glColor3f(0,1,1);

        glBegin(GL_QUADS);

        glVertex2f(x, y);
        glVertex2f(x+width, y);
        glVertex2f(x+width, y+height);
        glVertex2f(x, x+height);

        glEnd();
    }
}
