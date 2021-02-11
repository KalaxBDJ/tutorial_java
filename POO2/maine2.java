package POO2;

import java.util.Scanner;

public class maine2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String raza = "";
		perro toby = new perro("Pitbull","toby","marrón");
		System.out.println("La raza de toby es : " + toby.getRaza());
		
		try(Scanner scan = new Scanner(System.in))
		{	
			System.out.println("Ingrese la nueva raza del perro\n");
			raza = scan.next();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hubo un error y no se pudo cambiar la raza del perro\n");
		}
		
		if(raza.equals(""))
		{
			
		}
		else
		{
			toby.SetRaza(raza);
		}
		
		
	}

}
