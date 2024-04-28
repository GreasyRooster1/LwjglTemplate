package main.Core;

import static main.Core.CoreFiles.readFileToString;

public class CoreShaders {
    public static void loadShader(){
        final String FRAGMENT = readFileToString("resources\\shaders\\waves_frag.glsl");
        final String VERTEX = readFileToString("resources\\shaders\\waves_vert.glsl");

        //create our shader program -- be sure to pass SpriteBatch's desgh fault attributes!
        ShaderProgram program = new ShaderProgram();
        program.createFragmentShader(FRAGMENT);
    }
}
