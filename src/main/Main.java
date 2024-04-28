package main;

import main.Core.Window;

import static main.Core.CoreRendering.*;

public class Main {


    public static void update() {
        fill(1,0,0);

        rect(10,10,100,100);
        triangle(110,110,320,200,0,140);
    }

    public static void main(String[] args) {
        Window.run();
    }
}