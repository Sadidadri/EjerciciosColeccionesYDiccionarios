package ejerciciosColecciones;
/**
 * Clase Carta que utilizaremos en los ejercicios, esta 
 * compuesta por un palo y una figura
 * @author d18momoa
 *
 */
public class Carta implements Comparable<Carta>{
	private Figura figura;
	private Palo palo;
	
	Carta(Figura f,Palo p){
		this.figura = f;
		this.palo = p;
	}

	@Override
	public int compareTo(Carta carta) {
		if (palo.equals(carta.getPalo())) {
			return figura.compareTo(carta.getFigura());
		} else {
			return palo.compareTo(carta.getPalo());
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((figura == null) ? 0 : figura.hashCode());
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (figura != other.figura)
			return false;
		if (palo != other.palo)
			return false;
		return true;
	}
	/**
	 * Muestra el estado de la carta
	 */
	public String toString() {
		return getFigura()+" de "+getPalo();
	}

	Figura getFigura() {
		return figura;
	}

	Palo getPalo() {
		return palo;
	}

}
