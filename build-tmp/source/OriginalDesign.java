import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x1 = 150;
boolean ak=false;
boolean dk=false;
public void setup()
{
size(300,300);
}
public void draw()
{
  background(255);
  noFill();
  rect(2, 2, 296, 296);	
  
  bezierStuff();
  textStuff();
  keyResults();

}

public void bezierStuff(){
	fill(20,20,20);
	bezier(150, 20, x1, 30, x1, 30, 150, 200);

}
public void textStuff(){
	fill(0,0,255);
	textAlign(CENTER);
	text("use the a and d keys to move the bezier's magnet", 150, 250);
}


public void keyPressed(){
if(key=='a'){
	ak=true;
}
if(key=='d'){
	dk=true;
}

}
public void keyReleased(){
if(key=='a'){
	ak=false;
}
if(key=='d'){
	dk=false;
}

}
public void keyResults(){
	if(ak==true){
		x1-=2;
	}
	if(dk==true){
		x1+=2;
	}
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
