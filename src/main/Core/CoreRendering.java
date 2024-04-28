package main.Core;

import static main.Core.CoreUtils.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11C.GL_QUADS;

public class CoreRendering {

    public static void rect(float x, float y, float width, float height) {
        x = scaleXCord(x);
        y = scaleYCord(y);
        width = scaleWCord(width);
        height = scaleHCord(height);

        glColor3f(0,1,1);

        glBegin(GL_QUADS);

        glVertex2f(x, y);
        glVertex2f(x+width, y);
        glVertex2f(x+width, y+height);
        glVertex2f(x, y+height);

        glEnd();
    }

    public static void triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        x1 = scaleXCord(x1);
        y1 = scaleYCord(y1);
        x2 = scaleXCord(x2);
        y2 = scaleYCord(y2);
        x3 = scaleXCord(x3);
        y3 = scaleYCord(y3);

        glColor3f(0,1,1);

        glBegin(GL_TRIANGLES);

        glVertex2f(x1, y1);
        glVertex2f(x2,y2);
        glVertex2f(x3,y3);

        glEnd();
    }
}
