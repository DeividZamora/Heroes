package Tarea;

public class Main {

	public static void main(String[] args) 
	{
		Persona Tony_Stark = new Persona("Tony stark", 35);
		System.out.println(Tony_Stark.name +": "+ Tony_Stark.edad);
	
	//-------------------------------------------
		
	SuperHeroe iron_man = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "iron man";
	iron_man.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("Bucaramanga");

	//------------------------------------------
		SuperHeroe Goku = new SuperHeroe(Goku.name, Goku.edad );
	
	iron_man.heroName= "Goku";
	Goku.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("Jajapón");

	//------------------------------------------
		SuperHeroe superman = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "iron man";
	iron_man.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("EU");

	//------------------------------------------
		SuperHeroe ProfesorSuperO = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "profesor super o";
	iron_man.powers= new String []{"corregir", "enseñar"};
	
	iron_man.setCity("Quibdó");

	//------------------------------------------
		SuperHeroe bellota = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "bellota";
	iron_man.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("Saltadilla");

	//------------------------------------------
		SuperHeroe burbuja = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "burbuja";
	iron_man.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("Saltadilla");

	//------------------------------------------
		SuperHeroe bombon = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "Bombon";
	iron_man.powers= new String []{"volar", "pelear"};
	
	iron_man.setCity("Saltadilla");

	//------------------------------------------
		SuperHeroe Spiderman = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "Spiderman";
	iron_man.powers= new String []{"telaraña", "pelear"};
	
	iron_man.setCity("New York");

	//------------------------------------------
		SuperHeroe Hulk = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "iron man";
	iron_man.powers= new String []{"super fuerza", "pelear"};
	
	iron_man.setCity("Barrancabermeja");

	//------------------------------------------
		SuperHeroe CapitanAmerica = new SuperHeroe(Tony_Stark.name, Tony_Stark.edad );
	
	iron_man.heroName= "capitan america";
	iron_man.powers= new String []{"pegar", "pelear"};
	
	iron_man.setCity("Boyacá");

	//------------------------------------------
		
	
	}
	

}
