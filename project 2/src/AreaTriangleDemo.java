import org.graalvm.compiler.core.common.FieldsScanner;

import com.sun.source.util.DocTreeScanner;

public class AreaTriangleDemo {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter the width of the Triangle:");
			 double base = scanner.nextDouble();
			 System.out.println("Enter the height of the Triangle:");
			 double height = scanner.nextDouble();
			 double area = (base* height)/2;
			 System.out.println("Area of Triangle is: " + area); 
	         scanner.close();
		}

	}