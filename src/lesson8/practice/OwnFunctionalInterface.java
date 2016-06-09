package lesson8.practice;

public class OwnFunctionalInterface {

	@FunctionalInterface
	public static interface FuncInterface
	{
		public void display(String s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Example of Annonomoys class
		FuncInterface fi = new FuncInterface(){

			@Override
			public void display(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}};
			
			fi.display("Sanjeev Kumar Bhusal");
		FuncInterface f = s -> System.out.println(s);
		f.display("Sanjeev Kumar Bhusal");
		
	}

}
