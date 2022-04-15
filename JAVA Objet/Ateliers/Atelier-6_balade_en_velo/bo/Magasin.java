package bo;

/*import bo.Velo;
import bo.Gyro;
import bo.Gyropode;
import bo.Gyroroue;
*/
import java.time.LocalDate;

public class Magasin {
	private Cycle[] cyclesDisponibles;

	public Magasin() {
		cyclesDisponibles = new Cycle[6];
		cyclesDisponibles[0] = new Velo("Lapierre", "Speed Run 400", LocalDate.of(2021, 03, 25), 27);
		cyclesDisponibles[1] = new Velo("Btwin", "Riverside 900", LocalDate.of(2022, 04, 10), 10);
		cyclesDisponibles[2] = new Gyropode("Segway", "Ninebot elite", LocalDate.of(2022, 03, 12), 40, "1m50");
		cyclesDisponibles[3] = new Gyropode("Weebot", "echo", LocalDate.of(2022, 03, 12), 35, "1m60");
		cyclesDisponibles[4] = new Gyroroue("Immotion", "v8", LocalDate.of(2022, 03, 12), 40);
		cyclesDisponibles[5] = new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2020, 12, 04), 30);
	}


	
	@Override
	public String toString() {
		String resultat = "";
		// Je fais une variable current de type Cycle qui prend successivement les valeurs de cyclesDisponibles
		for (Cycle current : cyclesDisponibles) {
			resultat += " - ";
			resultat += current.toString();
			resultat += "\n";
		}
		return resultat;


	}


}
