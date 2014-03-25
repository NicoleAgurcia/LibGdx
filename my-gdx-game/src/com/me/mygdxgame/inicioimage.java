package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class inicioimage extends Image{

	public inicioimage()
	{
		super(new Texture("data/inicio1.png"));
		this.addListener(new Inicio(this));
		
	}
	
	
}
