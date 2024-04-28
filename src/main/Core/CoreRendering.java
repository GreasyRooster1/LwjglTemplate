package main.Core;

import static main.Core.CoreUtils.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11C.GL_QUADS;

public class CoreRendering {

    public static void fill(float r,float g,float b){
        glColor3f(r,g,b);
    }
    public static void fill(float r,float g,float b,float a){
        glColor4f(r,g,b,a);
    }
    public static void fill(float gray){
        glColor3f(gray,gray,gray);
    }
    public static void fill(float gray,float a){
        glColor4f(gray,gray,gray,a);
    }
    public static void background(float r,float g,float b){
        glClearColor(r,g,b,1);
    }

    public static void rect(float x, float y, float width, float height) {
        x = scaleXCord(x);
        y = scaleYCord(y);
        width = scaleWCord(width);
        height = scaleHCord(height);

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

        glBegin(GL_TRIANGLES);

        glVertex2f(x1, y1);
        glVertex2f(x2,y2);
        glVertex2f(x3,y3);

        glEnd();
    }
}
