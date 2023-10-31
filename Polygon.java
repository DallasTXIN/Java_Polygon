//Dallas Lawson
//October 30, 2023
//Professor Bowman
//SDEV200-1AH
//Chapter 9, Exercise 9.9: N-Sided Rgular Polygon

public class Polygon {
  private int n = 3;
  private double side = 1;
  private double x = 0;
  private double y = 0;

    public Polygon() {
      
    }

    public Polygon(int n, double side) {
      this.n = n;
      this.side = side;
      this.x = 0;
      this.y = 0;
    }

  public Polygon(int n, double side, double x, double y){  
              this.n = n;
              this.side = side;
              this.x = x;
              this.y = y;
          }

          public int getN(){
              return this.n;
          }

          public void setN(int n){
              this.n = n;
          }

          public double getSide(){
              return this.side;
          }

          public void setSide(double side){
              this.side = side;
          }

          public double getX(){
              return this.x;
          }

          public void setX(double x){
              this.x  = x;    
          }

          public double getY(){
              return this.y;
          }

          public void setY(double y){
              this.y  = y;
          }

          public double getPerimeter(){
              return this.n * this.side;
          }

          public double getArea(){
              return (this.n * Math.pow(this.side,2)) / (4 * Math.tan(Math.PI/this.n));
          }

          public String toString(){
              String result;
              if(this.n >= 3 && this.side > 0){
                  result = "The Regular Polygon n: " + this.n + ", side: "+ this.side + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
              }else if(this.n >= 3 && this.side <= 0){
                  result = "The side needs to be greater than zero.";
              }else if(this.n < 3 && this.side > 0){
                  result = "The number of edges needs to be greater than three.";
              }else{
                  result = "The side needs to be greater than zero, along with the edges need to be greater than three.";
              }
              return result;
          }
}