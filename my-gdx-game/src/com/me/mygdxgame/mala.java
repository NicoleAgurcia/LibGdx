package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;

public class mala extends Pelotita{
 
	fin a; 
	
  
  
  public mala(int x,int y, fin a)
	{
		super(x,y, new Texture("data/mala.png"));
		this.addListener(new imputm(this,a));
		this.setX(x);
		this.setY(y);
	}
	
}
