PImage backgroundImage; 
int Xpos = 0;
int Ypos = 0;
int YSpeed = 9;
int XSpeed = 9;

void setup(){
  size(500,500);
 
}

void draw(){
background(185,232,185);
 fill(144,229,221);
  stroke(0,0,0);
  ellipse(Xpos,Ypos,30,30);
  
  
  Xpos = Xpos+XSpeed;
  Ypos = Ypos+YSpeed;
 
  if(Xpos > 500 || Xpos < 0){
    XSpeed = -XSpeed;
  }
  if(Ypos > 500 || Ypos < 0){
    YSpeed = -YSpeed;
  }
fill(0,0,0);
stroke(144,229,221);
rect(mouseX,450, 80,20);


if(intersects(Xpos,Ypos,mouseX, 450,80)==true){
  YSpeed=-YSpeed;
}




}   


boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
int paddleLength) {
    if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
        return true;
    else
        return false;
}