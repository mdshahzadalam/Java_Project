package math;
import java.util.*;
class Calculation
{
	    public double length;
	    public double breadth;
	    public double height;
	    public double side;
	    public double radius;
}
class Area extends Calculation
{
	Scanner s=new Scanner(System.in);

	 public void cuboid()
	    {
	        System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Breadth = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=2*(length*breadth+breadth*height+height*length);
	        //System.out.println("Area of cuboid is = "+2*(length*breadth+breadth*height+height*length));
	        System.out.println("Area of Cuboid is = "+z);
	    }
	 
	 
	 public void cube()
	 {
		 System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        double z=6*length*length;
	        System.out.println("Area of Cube is = "+z);
	 }
	 
	 
	 public void RightPrism()
	 {
		 System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Breadth = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=(length+breadth+height)*height;
	        System.out.println("Area of Right Prism is = "+z);
	 }
	 
	 
	 public void cylinder()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=2*3.14*radius*height;
	        System.out.println("Area of Cylinder is = "+z);
	 }
	 
	 
	 public void cone()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        System.out.println("Enter the Lenght = ");
	        length=s.nextInt();
	        double z=3.14*radius*length;
	        System.out.println("Area of Cone is = "+z);
	 }
	 
	 
	 public void sphere()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        double z=4*3.14*radius*radius;
	        System.out.println("Area of Sphere is = "+z);
	 }
	 
	 
	 public void hemisphere()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        double z=3*3.14*radius*radius;
	        System.out.println("Area of Hemisphere is = "+z);
	 }
	 
	 
	 public void square()
	 {
		 System.out.println("Enter the Side = ");
	        side=s.nextInt();
	        double z=side*side;
	        System.out.println("Area of Square is = "+z);
	 }
	 
	 
	 public void parallelogram()
	 {
		 System.out.println("Enter the Breadth = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=breadth*height;
	        System.out.println("Area of Parallelogram is = "+z);
	 }
	 
	 
	 public void trapezoid()
	 {
		 System.out.println("Enter the First Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Second Length = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=((length+breadth)*height)/2;
	        System.out.println("Area of Trapezoid is = "+z);
	 }
	 
	 
	 public void righttriangle()
	 {
		 System.out.println("Enter the Base = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=(breadth*height)/2;
	        System.out.println("Area of Right Triangle is = "+z);
	 }
	 
	 
	 public void equilateraltriangle()
	 {
		 System.out.println("Enter the Side = ");
	        side=s.nextInt();
	        double z=(1.732*side*side)/4;
	        System.out.println("Area of Equilateral Triangle is = "+z);
	 }
	 
	 
	 public void isoscelesrighttriangle()
	 {
		 System.out.println("Enter the Side = ");
	        side=s.nextInt();
	        double z=(side*side)/2;
	        System.out.println("Area of Isosceles Right Triangle is = "+z);
	 }
	 
	 
	 public void rhombus()
	 {
		 System.out.println("Enter the First Diagonal = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Second Diagonal = ");
	        height=s.nextInt();
	        double z=(breadth*height)/2;
	        System.out.println("Area of Rhombus is = "+z); 
	 }
	 
	 
	 public void circle()
	 {
		 System.out.println("Enter the Radius = ");
	        side=s.nextInt();
	        double z=3.14*side*side;
	        System.out.println("Area of Circle is = "+z);
	 }
	 
	 
	 public void semicircle()
	 {
		 System.out.println("Enter the Radius = ");
	        side=s.nextInt();
	        double z=(3.14*side*side)/2;
	        System.out.println("Area of SemiCircle is = "+z);
	 }
	 
	 
	 public void rectangle()
	 {
		 System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Breadth = ");
	        breadth=s.nextInt();
	        double z=length*breadth;
	        //System.out.println("Area of cuboid is = "+2*(length*breadth+breadth*height+height*length));
	        System.out.println("Area of Rectangle is = "+z);
	 }
}


class Volume extends Calculation
{
	Scanner s=new Scanner(System.in);
	
	
	public void sphere()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        double z=(4*3.14*radius*radius*radius)/3;
	        System.out.println("Volume of Sphere is = "+z);
	 }
	
	
	 public void cube()
	 {
		 System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        double z=length*length*length;
	        System.out.println("Volume of Cube is = "+z);
	 } 
	 
	 
		 public void cylinder()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=3.14*radius*radius*height;
	        System.out.println("Volume of Cylinder is = "+z);
	 }
		 
		 
	 public void cone()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        System.out.println("Enter the Height = ");
	        length=s.nextInt();
	        double z=(3.14*radius*radius*length)/3;
	        System.out.println("Volume of Cone is = "+z);
	 }
	 
	 
	 public void cuboid()
	    {
	        System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Breadth = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=(length*breadth*height);
	        //System.out.println("Area of cuboid is = "+2*(length*breadth+breadth*height+height*length));
	        System.out.println("Volume of Cuboid is = "+z);
	    }
	 
	 
	 public void hemisphere()
	 {
		 System.out.println("Enter the Radius = ");
	        radius=s.nextInt();
	        double z=(2*3.14*radius*radius*radius)/3;
	        System.out.println("Volume of Hemisphere is = "+z);
	 }
	 
}


class Perimeter extends Calculation
{
	Scanner s=new Scanner(System.in);
	
	
	public void parallelogram()
	 {
		 System.out.println("Enter the Base = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        double z=2*(breadth+height);
	        System.out.println("Perimeter of Parallaelogram is = "+z);
	 }
	
	
	public void triangle()
	 {
		 System.out.println("Enter the Base = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Height = ");
	        height=s.nextInt();
	        System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        double z=length+breadth+height;
	        System.out.println("Perimeter of Triangle is = "+z);
	 }
	
	
	public void rectangle()
	 {
		 System.out.println("Enter the Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Breadth = ");
	        breadth=s.nextInt();
	        double z=2*(length+breadth);
	        //System.out.println("Area of cuboid is = "+2*(length*breadth+breadth*height+height*length));
	        System.out.println("Perimeter of Rectangle is = "+z);
	 }
	
	
	 public void square()
	 {
		 System.out.println("Enter the Side = ");
	        side=s.nextInt();
	        double z=4*side;
	        System.out.println("Perimeter of Square is = "+z);
	 }
	 
	 
	 public void trapezoid()
	 {
		 System.out.println("Enter the First Length = ");
	        length=s.nextInt();
	        System.out.println("Enter the Second Length = ");
	        breadth=s.nextInt();
	        System.out.println("Enter the Third Length = ");
	        height=s.nextInt();
	        System.out.println("Enter the Fourth Length = ");
	        radius=s.nextInt();
	        double z=length+breadth+height+radius;
	        System.out.println("Perimeter of Trapezoid is = "+z);
	 }
	 
	 
	 public void kite()
	 {
		 System.out.println("Enter the Length = ");
		 length=s.nextInt();
		 System.out.println("Enter the Breadth = ");
		 breadth=s.nextInt();
		 double z=2*(length+breadth);
		 System.out.println("Perimeter of Kite is = "+z);
	 }
	 
	 
	 public void rhombus()
	 {
		 System.out.println("Enter the Side = ");
	        breadth=s.nextInt();
	        double z=4*breadth;
	        System.out.println("Perimeter of Rhombus is = "+z); 
	 }
	 
	 
	 public void hexagon()
	 {
		 System.out.println("Enter the Side = ");
	        breadth=s.nextInt();
	        double z=6*breadth;
	        System.out.println("Perimeter of Hexagon is = "+z); 
	 }
}

public class MathSolution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Area a=new Area();
		
		Volume v=new Volume();
		
		Perimeter p=new Perimeter();
		int option;
		int i=0;
		
		do {
		System.out.println("..................................MATH SOLUTION........................................");
        System.out.println("1. Area");
        System.out.println("2. Volume");
        System.out.println("3. Perimeter");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Slect the Number ");
        option=s.nextInt();
        System.out.println();
        i=i+1;
        
	
        
        if(option==1)
        {
        	System.out.println("1. Cuboid");
        	System.out.println("2. Cube");
        	System.out.println("3. Right Prism");
        	System.out.println("4. Cylinder");
        	System.out.println("5. Cone");
        	System.out.println("6. Sphere");
        	System.out.println("7. Hemisphere");
        	System.out.println("8. Square");
        	System.out.println("9. Parallelogram");
        	System.out.println("10. Trapezoid");
        	System.out.println("11. Right Triangle");
        	System.out.println("12. Equilateral Triangle");
        	System.out.println("13. Isosceles Right Triangel");
        	System.out.println("14. Rhombus");
        	System.out.println("15. Circle");
        	System.out.println("16. Semicircle");
        	System.out.println("17. Rectangle");
        	System.out.println();
        	System.out.println("Please select one ");
        	option=s.nextInt();
        	System.out.println();
        
        	switch(option)
        	{
        	case 1:
        		a.cuboid();
        		break;
        	case 2:
        		a.cube();
        		break;
        	case 3:
        		a.RightPrism();
        		break;
        	case 4:
        		a.cylinder();
        		break;
        	case 5:
        		a.cone();
        		break;
        	case 6:
        		a.sphere();
        		break;
        	case 7:
        		a.hemisphere();
        		break;
        	case 8:
        		a.square();
        		break;
        	case 9:
        		a.parallelogram();
        		break;
        	case 10:
        		a.trapezoid();
        		break;
        	case 11:
        		a.righttriangle();
        		break;
        	case 12:
        		a.equilateraltriangle();
        		break;
        	case 13:
        		a.isoscelesrighttriangle();
        		break;
        	case 14:
        		a.rhombus();
        		break;
        	case 15:
        		a.circle();
        		break;
        	case 16:
        		a.semicircle();
        		break;
        	case 17:
        		a.rectangle();
        		break;
        	default:
        		System.out.println("Please select the right Number !!!!!!!..........");
        	}
        }
        
        else if(option==2)
        {
        	System.out.println("1. Sphere");
        	System.out.println("2. Cube");
        	System.out.println("3. Rectangle");
        	System.out.println("4. Cylinder");
        	System.out.println("5. Cone");
        	System.out.println("6. Cuboid");
        	System.out.println("7. Hemisphere");
        	System.out.println();
        	
        	System.out.println("Please select one ");
        	option=s.nextInt();
        	System.out.println();
        	
        	switch(option)
        	{ 
        	case 1:
        		v.sphere();
        		break;
        	case 2:
        		v.cube();
        		break;
        	case 3:
        		//v.rectangle();
        		System.out.println("not available");
        		break;
        	case 4:
        		v.cylinder();
        		break;
        	case 5:
        		v.cone();
        		break;
        	case 6:
        		v.cuboid();
        		break;
        	case 7:
        		v.hemisphere();
        		break;
        		default:
        			System.out.println("Please select the right Number !!!!!!!..........");
        	}
        }
        
        else if(option==3)
        {
        	System.out.println();
        	System.out.println();
        	System.out.println("1. Parallelogram");
        	System.out.println("2. Triangle");
        	System.out.println("3. Rectangle");
        	System.out.println("4. Square");
        	System.out.println("5. Trapezoid");
        	System.out.println("6. Kite");
        	System.out.println("7. Rhombus");
        	System.out.println("8. Hexagone");
        	System.out.println();
        	
        	System.out.println("Please select one ");
        	option=s.nextInt();
        	System.out.println();
        	
        	switch(option)
        	{
        	case 1:
        		p.parallelogram();
        		break;
        	case 2:
        		p.triangle();
        		break;
        	case 3:
        		p.rectangle();
        		break;
        	case 4:
        		p.square();
        		break;
        	case 5:
        		p.trapezoid();
        		break;
        	case 6:
        		p.kite();
        		break;
        	case 7:
        		p.rhombus();
        		break;
        	case 8:
        		p.hexagon();
        		break;
        		default:
        			System.out.println("...............Please select the right Number !!!!!!!..........");
        	}
       }
        
        else if(option==4)
        {
        	System.out.println("Thanks for solving the Questions.");
        	return;
        }
        
       
        
        else
        {
        	System.out.println("Please enter the given numbers...............!");
        }
        
        System.out.println();
        System.out.println();
        
		}while(i > 0);
	}

}
