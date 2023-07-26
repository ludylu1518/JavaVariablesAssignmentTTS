
public class Variables {
	
	static int var1;
	static String var2;
	static char var3;
	static boolean var4;
	static double var5;
	
	
	//int 1Test;
	
	int _test;
	int $test;
	
	//int #test;
	//int @test;
	
	

	public static void main(String[] args) {
		
		System.out.print("uninitialized int: ");
		System.out.println(var1);
		
		System.out.print("uninitialized String: ");
		System.out.println(var2);
		
		System.out.print("uninitialized char: ");
		System.out.println(var3);
		
		System.out.print("uninitialized boolean: ");
		System.out.println(var4);
		
		System.out.print("uninitialized double: ");
		System.out.println(var5);
		
		int var6 = newVar();
		
		System.out.println(var6);
		
	}
	
	public static int newVar() {
		int var6 = 10;
		
		return var6;
	}
	
}
