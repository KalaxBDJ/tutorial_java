package POO2;

public class perro {
	
	private String raza , nombre , color , edad , peso;
	
	public perro(String raza , String nombre , String color)
	{
		this.raza = raza;
		this.nombre = nombre;
		this.color = color;
		System.out.println("Se ha inicializado el perro " + this.nombre);
		this.edad = "10";
		this.peso = "30Kg";
	}
	
		
	public String getRaza()
	{
		
		return this.raza;
	}
	
	public void SetRaza(String param)
	{
		this.raza = param;
		System.out.println("La raza de "+this.nombre+" ha sido cambiada a "+param+"\n");
	}
	
}
