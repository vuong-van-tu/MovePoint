public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MovablePoint() {
    }

    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }
    public void move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
    @Override
    public String toString() {
        return "["+"x= "+getX()+
                ",y = "+getY()+
                ",speed X = "+getxSpeed()+
                ",speed Y = "+getySpeed()
                +"]";
    }
}
