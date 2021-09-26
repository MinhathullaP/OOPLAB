class Randomshapes
 {
	 void draw()
		 {
		 System.out.println("Shape draw()");
		 }
	 void erase() 
		{
		 System.out.println ("Shape erase()");
		 }
 }
class Circle extends Randomshapes
 {
	void draw()
		 {
		 System.out.println ("Circle draw()");
		 }
	void erase()
		 {
		 System.out.println ("Circle erase()");
		 }
}
class Triangle extends Randomshapes
{
 	void draw()
		 {
		 System.out.println("Triangle draw()");
		 }
	void erase()
		 {
		 System.out.println("Triangle erase()");
		 }
}
class Square extends Randomshapes
{
	void draw()
		 {
		 System.out.println ("Square draw()");
		 }
	void erase()
		 {
		 System.out.println ("Square erase()");
		 }
}
public class Shapes
 {
 	public static Randomshapes randRandomshapes()
 {
 switch((int)(Math.random()*3))
 {
	 case 0: return new Circle();
	 case 1: return new Square();
	 case 2: return new Triangle();
	 default : System.out.println("exit");
	 return new Randomshapes();
 }
}
public static void main (String args[])
 {
 Randomshapes A[] = new Randomshapes[9];
 for(int i = 0;i< A.length; i++)
 {
  	 A[i] = randRandomshapes();
 }
 for(int i= 0;i < A.length; i++)
 {
	 A[i].draw();
	 A[i].erase();
 }
 }
}
