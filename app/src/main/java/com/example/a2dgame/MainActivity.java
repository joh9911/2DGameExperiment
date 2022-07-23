package com.example.a2dgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
//MainActivity is the entry point to our application
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set content view to game, so that objects in the Game class can be rendered to the game
        setContentView(new Game(this));
    }
}
