package n1exercici2;

public class CalculoDni {
	
	public char calculLletra(int nDni) {
		
		String dniCaracters = "TRWAGMYFPDXBNJZSQVHLCKE";

		int modul= nDni % 23;

		char lDni = dniCaracters.charAt(modul);

		return lDni;
	}

}
