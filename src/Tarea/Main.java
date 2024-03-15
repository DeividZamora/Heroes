package Tarea;

public class Main {

	public static void main(String[] args) 
	{
		Persona Tony_Stark = new Persona("Tony stark", 35);
		System.out.println(Tony_Stark.name +": "+ Tony_Stark.edad);
	
	
	SuperHeroe iron_man = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "iron man";
	iron_man.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("Bucaramanga");
	
	
	}
	
/**/
}
