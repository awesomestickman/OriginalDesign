int x1 = 150;
boolean ak=false;
boolean dk=false;
void setup()
{
size(300,300);
}
void draw()
{
  background(255);
  noFill();
  rect(2, 2, 296, 296);	
  
  bezierStuff();
  textStuff();
  keyResults();

}

void bezierStuff(){
	fill(x1*0.1,x1*0.5,x1);
	bezier(150, 20, x1, 30, x1, 30, 150, 200);

}
void textStuff(){
	fill(0,0,255);
	textAlign(CENTER);
	text("use the a and d keys to move the bezier's magnet", 150, 250);
}


void keyPressed(){
if(key=='a'){
	ak=true;
}
if(key=='d'){
	dk=true;
}

}
void keyReleased(){
if(key=='a'){
	ak=false;
}
if(key=='d'){
	dk=false;
}

}
void keyResults(){
	if(ak==true){
	 if(x1>5){
            x1-=2;
         }
	}
	if(dk==true){
		x1+=2;
	}
}


