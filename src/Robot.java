
public class Robot {
	
	String Manos_mv;
	String Piernas_mv;
	String Torso_mv;
	String Cabeza_mv;
	
	public Robot(String Manos_mv, String Piernas_mv, String Torso_mv, String Cabeza_mv) {
		this.Manos_mv = Manos_mv;
		this.Piernas_mv = Piernas_mv;
		this.Torso_mv = Torso_mv;
		this.Cabeza_mv = Cabeza_mv;
				
		
	}
	
	public void caracteristicas_mv() {
		
		System.out.println("En sus Manos Tiene: " + Manos_mv);
		System.out.println("Sus piernas son: " + Piernas_mv);
		System.out.println("Su torso es: " + Torso_mv);
		System.out.println("Su cabeza es: " + Cabeza_mv);
		
	}
	
	public void verificacion_mv() {
		System.out.println("Este Robot tiene Vida" );
	} 
	
}
