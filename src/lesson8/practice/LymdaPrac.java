package lesson8.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LymdaPrac {
	
	private int LymdaID;
    public class Employee
	{
	    private String name;
		private String position;	
		
		public Employee(String name, String pos)
		{
			this.name = name;
			this.position = pos;
			LymdaPrac.this.LymdaID =1;
		}
	}

	public static void main(String[] args) {
		
		LymdaPrac lp = new LymdaPrac();
		LymdaPrac.Employee emp1 = lp. new Employee("Sanjeev", "Manager"); // creating object of inner class
		List<Employee> emlist = new ArrayList<Employee>();
	     emlist.add(lp. new Employee("San", ""));
	     emlist.add(lp. new Employee("San", ""));
	     emlist.add(lp. new Employee("San", "Manager"));
	     emlist.add(lp. new Employee("San", "Developer"));
	     
	    // emlist.forEach(consumer);
	     Iterator<Employee> emp = emlist.iterator();
	     while(emp.hasNext())
	     {
	    	 System.out.println(emp.next().hashCode());
	     }

	     
	     String [] str = {"Sanjeev", "Bhusal","Iterating"};
	      Consumer<String> con = s -> System.out.println(s.toUpperCase());
	     
	      for(String s : str)
	      {
	    	  con.accept(s);
	      }
	     
//		String [] strs = {"",""};
//		strs.forEach(consumer);
	}
	
	Consumer<String> consumer = new Consumer<String>(){

		@Override
		public void accept(String a) {
			// TODO Auto-generated method stub
			System.out.println(a.toUpperCase());
		}	
	};

}
