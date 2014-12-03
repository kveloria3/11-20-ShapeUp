// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
  Point origin = new Point();
  int width;
  int height;
  
  public Rectangle()
  {
    origin.x = 0;
    origin.y = 0;
    width = 0;
    height = 0;
  }
  public Rectangle(Point bl, Point tr)
  {
    origin = bl;
    height = tr.y-origin.y;
    width = tr.x-origin.x;
  }
  public Rectangle(Point botLef, int wid, int hei)
  {
    origin = botLef;
    width = wid;
    height = hei;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point topRight = new Point();
    topRight.x = origin.x + width;
    topRight.y = origin.y + height;
    return topRight;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    return height*width;
  }
  public double diagonal()
  {
    return origin.distance(this.getTopRight());
  }
  public int perimeter()
  {
    return 2*height  + 2*width;
  }
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public String toString()
  {
    String s = "[("+origin.x+","+origin.y+"),("+this.getTopRight().x+","+this.getTopRight().y+")]";
    return s;
  }
  public void translate(int dx, int dy)
  {
    this.getTopRight().x+=dx;
    this.getTopRight().y+=dy;
  }
  public void scale(int dx, int dy)
  {
    width += dx;
    height += dy;
  }
}
