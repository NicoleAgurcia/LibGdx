package com.me.mygdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "my-gdx-game";
		cfg.useGL20 = false;
		cfg.width = 600;
		cfg.height = 400;
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
