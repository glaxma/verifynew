package learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstProgram {

	public static void add() {

		String name = "07/07/2022, 07/23/2022, 08/23/2022, 09/23/2022, 10/23/2022, 11/23/2022, 12/23/2022, 01/23/2023, 02/23/2023, 03/23/2023, 04/23/2023, 05/23/2023, 06/23/2023";
		if (name.isEmpty()) {
			System.out.println("Throw an exception:" + name.isEmpty());
		} else {
			System.out.println("the string has values:" + name.isEmpty());
		}
		try {
			String[] sp = name.split("\\s");
			for (int i = 0; i < name.length(); i++) {
				System.out.println(sp[i]);
				if (i == 12) {
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("The billing deatils value should be 13 starting from 0 to 12:" + e.getLocalizedMessage());

		}

	}

	public static void set() {
		int num1=0;
		int num2=1;
		int sum=0;
		for(int i=2;i<10;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(num1);
			
		}
	

	}

	public static void main(String[] args) {

		// add();
		 set() ;
		System.out.println();
	}

}
