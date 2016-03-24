package data;




import org.lwjgl.opengl.Display;

import static helpers.Artist.*;

import static org.lwjgl.opengl.GL11.*;

public class Boot {
	
	public Boot (){
		
		BeginSession();
		
		while(!Display.isCloseRequested()){
			Display.update();
			Display.sync(60);
	
			DrawHexagone(18,00,20,36);


		}
		
	Display.destroy();
	
	}
	
	public static void main(String[] args){
		new Boot();
	}

}
