
import java.util.*;

public class Cliente extends Persona{
	private ArrayList<Prenotazione> prenotazioni;

    public Cliente(String nome, String cognome) {
        super(nome, cognome);
    }

    public void prenotaViaggio(Prenotazione prenotazione) {
        prenotazioni.add(prenotazione);
    }

    public void cancellaPrenotazione(Prenotazione prenotazione) {
        prenotazioni.remove(prenotazione);
    }
}
