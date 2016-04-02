package helpers;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_POLYGON;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glVertex2f;

import java.io.IOException;
import java.io.InputStream;

import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glTranslatef;



import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;



public class Artist {

	public static final int WIDTH = 900, HEIGHT = 600;
	
	public static void BeginSession(){
		Display.setTitle("Conquête");
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	
	
	
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0,1000,650,0,1,-1);
	glMatrixMode(GL_MODELVIEW);
	glEnable(GL_TEXTURE_2D);
	}
	
	public static void DrawHexagone(float X,float Y,float Sheight,float Swidth){
		float SquareX = X-18;
		float SquareY = Y+10;
		glBegin(GL_POLYGON);
		glVertex2f(X,Y);
		glVertex2f(SquareX,SquareY);
		glVertex2f(SquareX,SquareY+Sheight);
		glVertex2f(X,SquareY+Sheight+(SquareY-Y));
		glVertex2f(SquareX+Swidth,SquareY+Sheight);
		glVertex2f(SquareX+Swidth,SquareY);
		glEnd();
	}
	
	public static void DrawHexagoneTex(Texture tex, float x, float y, float Sheight, float Swidth){
		tex.bind();
		glTranslatef(x,y,0);
		glBegin(GL_POLYGON);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(Swidth, 0);
		glTexCoord2f(1, 1);
		glVertex2f(Swidth, Sheight);
		glTexCoord2f(0, 1);
		glVertex2f(0, Sheight);
		glEnd();
		glLoadIdentity();
		
	}
	
	public static Texture LoadTexture(String path, String fileType) {
		Texture tex = null;
		InputStream in = ResourceLoader.getResourceAsStream(path);
		try {
			tex = TextureLoader.getTexture(fileType, in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tex;
	}
	
	public static Texture QuickLoad(String name) {
		Texture tex = null;
		tex = LoadTexture("res/" + name + ".png", "PNG");
		return tex;
	}
}
