package data;


import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;

public class Boot {
	
	public Boot (){
		
		Display.setTitle("Conquête");
		
			try {
				Display.setDisplayMode(new DisplayMode(600,400));
				Display.create();
			} catch (LWJGLException e) {
				e.printStackTrace();
			}
		
		
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,600,400,0,1,-1);
		glMatrixMode(GL_MODELVIEW);
		
		while(!Display.isCloseRequested()){
			Display.update();
			Display.sync(60);
	
			float X = 100;
			float Y = 150;

			
			float Swidth = 36;
			float Sheight = 20;
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
	Display.destroy();
	}
	
	public static void main(String[] args){
		new Boot();
	
	
	}

}
