package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class imputpausa  extends InputListener{

	
	pausa f;
	
	imputpausa (pausa pa)
		{
	super();
	f=pa;
			}

public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
		{
	pausa.pausar = ! pausa.pausar;	
	System.out.println("PAUSA");
	return true;

		}
}
