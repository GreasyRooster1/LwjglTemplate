package main;

import main.Core.Window;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import static main.Core.CoreFiles.readFileToString;
import static main.Core.CoreRendering.*;
import static main.Core.CoreShaders.loadShader;
import static org.lwjgl.opengl.GL11.*;

public class Main {


    public static void update() {
        fill(1,0,0);
        loadShader("resources\\shaders\\waves_frag.glsl");

        rect(10,10,100,100);
        triangle(110,110,320,200,0,140);

        int shaderID = GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER);
        GL20.glShaderSource(shaderID, readFileToString("resources\\shaders\\waves_frag.glsl"));
        GL20.glCompileShader(shaderID);

        int vertexShader;
        vertexShader = GL30.glCreateShader(GL30.GL_VERTEX_SHADER);
        int fragmentShader;
        fragmentShader = GL30.glCreateShader(GL30.GL_FRAGMENT_SHADER);




        int shaderProgram;
        shaderProgram = GL30.glCreateProgram();


        GL30.glAttachShader(shaderProgram, vertexShader);
        GL30. glAttachShader(shaderProgram, fragmentShader);
        GL30.glLinkProgram(shaderProgram);


        GL30.glUseProgram(shaderProgram);

        glMatrixMode(GL_PROJECTION);
        glPushMatrix();
        glLoadIdentity();
        glMatrixMode(GL_MODELVIEW);
        glPushMatrix();
        glLoadIdentity();

        glBegin(GL_QUADS);
        glTexCoord2f( 0,0 );
        glVertex3d( -1.0,-1.0, 0 );
        glTexCoord2f( 1,0 );
        glVertex3d(  1.0,-1.0, 0 );
        glTexCoord2f( 1,1 );
        glVertex3d(  1.0, 1.0, 0 );
        glTexCoord2f( 0,1 );
        glVertex3d( -1.0, 1.0, 0 );
        glEnd();

        glMatrixMode(GL_PROJECTION);
        glPopMatrix();
        glMatrixMode(GL_MODELVIEW);
        glPopMatrix();
    }

    public static void main(String[] args) {
        Window.run();
    }
}