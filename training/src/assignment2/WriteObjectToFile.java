package assignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class WriteObjectToFile {
	public static void main(String[] args) {
		Employee emp = new Employee(20, "Abdul Wahab", "Analyst", 1000.0);

		try {
			FileOutputStream fout = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.flush();
			out.close();
			
//			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("employee.txt"));
//			Employee emp1 = (Employee) oin.readObject();
//			System.out.println(emp1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
