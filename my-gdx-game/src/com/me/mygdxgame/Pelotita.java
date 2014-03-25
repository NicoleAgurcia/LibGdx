package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelotita extends Image{
	
	
	public Pelotita(int x ,int y,Texture a) {
		super(a);
		this.addListener(new MiInput(this));   //detecta lo que pasa en la pantalla
	this.setX(x);
	this.setY(y);

	}
	

public void  act (float delta) //act es una funcion

{
	setX(getX()+0.9f);
	
	
	 if (getX()>600)
	 {
		 setX(0);
		 
	 }
	 
	 

}

}


