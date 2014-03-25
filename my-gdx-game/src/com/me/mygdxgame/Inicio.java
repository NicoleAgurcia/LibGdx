package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Inicio extends  InputListener{

	 inicioimage ib;
	 Inicio (inicioimage  p) { 
		 super ();
		ib = p;
		}	 
	 
	
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
  
     ib.setVisible(false);	
		return  true;
	
	}
}
