//Objects have state and behaviour
//Fan Class
//State (Member Variables)
//make;
//radius;
//color;
//ison;
//speed;
//Constructors
//Fan(String make, double radius, String color)
//Behavior (Member Methods)
//void switchon()
//void switchOff()
//void changeSpeed()
//String toString() using String.format method


public class Fan {

    private  String make ;
    private final double radius;
    private  String color;
    private  boolean isOn = false;
    private  boolean isOff = true;
    private  int speed = 0;

    public Fan(String make, double radius, String color){

      if(make.isBlank() || radius <= 0.00 || color.isBlank()){
          throw new IllegalArgumentException("Invalid argument specification\nPlease ensure that your make,radius and color are correct values");
      }
      else {

          this.make = make;
          this.radius = radius;
          this.color = color;
      }

    }


    public String getMake() {
        return make;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {

        return color.substring(0,1).toUpperCase().concat(color.substring(1).toLowerCase());

    }



    public int getSpeed() {
        return Math.abs(speed);
    }
  public void setOn(){
        if (speed != 0){
            throw new IllegalArgumentException("Fan Already On...");
        }else
        {
            this.isOn = true;
        }
  }
  public void setOff(){
        if(isOn){
            this.isOff = true;
            IO.println("Fan is now on...");
        }else{
            throw new IllegalArgumentException("Fan is already off...");
        }
  }
  public void setSpeed(){

  }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", isOff=" + isOff +
                ", speed=" + speed +
                '}';
    }
}
