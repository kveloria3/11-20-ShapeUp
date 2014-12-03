// A Line object represents a line defined by a pair of Points.
import java.lang.Math;

public class Line
{
  Point start = new Point();
  Point end = new Point();
  
  public Line()
  {
    start.x=0;
    start.y=0;
    end.x=0;
    end.y=0;
  }
  public Line(Point x, Point y)
  {
    start = x;
    end = y;
  }
  public double length()
  {
    double dis=Math.sqrt(Math.pow(start.x-end.x,2)+Math.pow(start.y-end.y,2));
    return dis;
  }
  public double slope()
  {
    double slope=(start.y-end.y)/(start.x-end.x);
    return slope;
  }
  public String toString()
  {
    String s="("+start.x+","+start.y+"),("+end.x+","+end.y+")";
    return s;
  }
  public void translate(int a, int b)
  {
    start.x+=a;
    end.x+=a;
    start.y+=b;
    end.y+=b;
  }
}
  
