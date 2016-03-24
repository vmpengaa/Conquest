package helpers;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_POLYGON;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;



public class Artist {

	public static final int WIDTH = 1000, HEIGHT = 650;
	
	public static void BeginSession(){
		Display.setTitle("Conquête");
		
		try {
			Display.setDisplayMode(new DisplayMode(1000,650));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	
	
	
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0,1000,650,0,1,-1);
	glMatrixMode(GL_MODELVIEW);
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
}
