package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class imputfin  extends InputListener{
		fin f;
	
		imputfin(fin param)
	{
		super();
		f=param;
	}

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		f.setVisible(false);
		
		return true;

}
}
