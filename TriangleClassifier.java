package asdm_assignment;

public class TriangleClassifier {
	public static void main(String[] args) {
		
	}
	
		String classifyTriangle(int x, int y, int z) {
	        if (x <= 0 || y <= 0 || z <= 0) {
	            return "Not a triangle";
	        } else if (x + y <= z || x + z <= y || y + z <= x) {
	            return "Not a triangle";
	        } else if (x == y && y == z) {
	            return "Equilateral";
	        } else if (x == y || x == z || y == z) {
	            return "Isosceles";
	        } else {
	            return "Scalene";
	        }
	    }
	}

	







