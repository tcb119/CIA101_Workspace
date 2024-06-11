package xxx;

public class CubeTest {
	
	public static void main(String[] args) {
		try {
//			Cube c1 = new Cube(5);
			Cube c2 = new Cube();
			c2.setLength(-2);
			System.out.println(c2.getVolume());
		} catch (CubeException ce) {
			ce.printStackTrace();
		}
	}
}
