package main.Core;

import java.util.ArrayList;
import java.util.List;

import static main.Core.CoreFiles.readFileToString;
import static org.lwjgl.opengl.ARBVertexArrayObject.glBindVertexArray;
import static org.lwjgl.opengl.ARBVertexArrayObject.glGenVertexArrays;
import static org.lwjgl.opengl.GL15C.*;
import static org.lwjgl.opengl.GL20.glDisableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.system.MemoryUtil.memFree;

public class CoreShaders {
    public static List<ShaderProgram> shaderPrograms = new ArrayList<ShaderProgram>();
    public static void loadShader(String filename){
        final String FRAGMENT = readFileToString(filename);

        //create our shader program -- be sure to pass SpriteBatch's desgh fault attributes!
        ShaderProgram program = new ShaderProgram();
        program.createFragmentShader(FRAGMENT);
        program.link();
        shaderPrograms.add(program);
    }
}
