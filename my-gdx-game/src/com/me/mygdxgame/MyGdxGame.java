package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;



class Imagen extends Sprite
{
	Imagen(Texture texture)
{
	super(texture);
}
InputListener l;
void avanzar()
{
	setX(getX()+0.01f);
	if(getX()>0.5f)
		setX(-0.5f);
}
	
}

public class MyGdxGame implements ApplicationListener {

	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;	
	private Sprite sprite;
	private Sprite sprite2;
	//	private Imagen imagen;
	private Image i;
    private Texture texture1;
	private Imagen In;
    private fin ff;
    private pausa pause;
    Pelotita p;
	Stage s;
	
	
	private Texture inici;
	
	
	
	ArrayList<Sprite>sprites=new ArrayList<Sprite>();
	ArrayList<Pelotita> pelotitas = new ArrayList<Pelotita>(); 
	
	

	int rotacion=0;
	
	@Override
	public void create()
	{		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		

		
		texture = new Texture(Gdx.files.internal("data/fondo.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		sprite = new Sprite(region);
		sprite2 = new Sprite(region);
		sprite2.setPosition(0,0);
		sprite2.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);
		sprite.setRotation(25);
		
		
		
		texture1 = new Texture (Gdx.files.internal("data/pelotita.png"));
		  
		  
		//imagen = new Imagen(texture);
		//imagen.setPosition(-0.5f,-0.5f);
		//imagen.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		//imagen.setSize(1.0f, 1.0f);
		
		s=new Stage();
		i=new Image(texture);
		s.addActor(i);
	
		ff = new fin ();
		inicioimage ib = new inicioimage ();
		
		
		ff.setVisible(false);
		
		pause= new pausa();
		s.addActor(pause);
		
		
		for(int i=0;i<5;i++)
		{
			sprites.add(new Sprite(texture));
			sprites.get(i).setX(i*0.2f-0.5f);
			sprites.get(i).setY(i*-0.2f-0.5f);
			sprites.get(i).setSize(1, 1);
		}
		

		
		for (int i=0 ; i<25; i++){
	
			Pelotita p =new Pelotita((int)(Math.random()*2000%w),(int)(Math.random()*2000%h),new Texture("data/pelotita.png"));		
			s.addActor(p);
			pelotitas.add(p);
		
		}
		Gdx.input.setInputProcessor(s);
		
		for (int i=0 ; i<8; i++){
		
		Pelotita p =new mala ((int)(Math.random()*2000%w),(int)(Math.random()*2000%h),ff);
		s.addActor(p);
		pelotitas.add(p);
	
		}

		
		Gdx.input.setInputProcessor(s);

		
		
		
		s.addActor(ib);
		s.addActor(ff);
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {	
		


		//imagen.avanzar();
		
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		
		if (!pausa.pausar){
			s.act(); 
		}
			
		s.draw();
		
		
		
	}

	@Override
	public void resize(int width, int height) {
		s.setViewport(600, 400, true);
		
	}

	@Override
	public void pause() {
	
	}

	@Override
	public void resume() {
	}
}
