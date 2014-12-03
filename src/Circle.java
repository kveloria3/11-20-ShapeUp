import java.lang.Math;

public class Circle
{
  Point center = new Point();
  double radius;

  public Circle()
  {
    //center = (0, 0)
    radius=0.0;
  }
  public Circle(Point start, Point end)
  {
    center = start;
    radius = start.distance(end);
  }
  public Circle(Point p, double r)
  {
    center = p;
    radius = r;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    double area = Math.PI*(Math.pow(radius, 2));
    return area;
  }
  public double circumference()
  {
    return 2*radius*Math.PI;
  }
  public double diameter()
  {
    return 2*radius;
  }
  public String toString()
  {
    String s = "("+center.x+","+center.y+"),"+radius;
    return s;
  }
  public void changeRadius(double inc)
  {
    radius+=inc;
  }
  public void translate(int a, int b)
  {
    center.x += a;
    center.y += b;
  }
}
      
      
                          
  
  
