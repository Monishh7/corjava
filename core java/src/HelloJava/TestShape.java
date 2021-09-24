package HelloJava;

public class TestShape {
	public static void main(String[] args) {
		Shape a=new Shape();
		a.setBorderwidth(7);
        a.setcolor("blue");
 
        System.out.println(a.getBorderwidth());
        System.out.println(a.getcolor());
	}
}

 

