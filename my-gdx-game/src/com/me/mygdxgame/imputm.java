package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;


public class imputm extends MiInput {
 
    fin o;
    
	imputm(Pelotita param,fin f){
		super(param);
		o = f;
	}

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		if (!pausa.pausar){
		o.setVisible(true);
		}
		return true;
	
	}
	

}
