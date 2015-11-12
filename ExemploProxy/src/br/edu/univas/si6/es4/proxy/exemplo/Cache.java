package br.edu.univas.si6.es4.proxy.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private static final Cache INSTANCE = new Cache();

	private List<ObjetoAlvo> availables = new ArrayList<>();

	private Cache() {
	}

	public static Cache getInstance() {
		return INSTANCE;
	}

	public synchronized ObjetoAlvo getNewAlvo() {
		ObjetoAlvo alvo = null;
		if (availables.isEmpty()) {
			alvo = new ObjetoAlvo();
		} else {
			alvo = availables.remove(0);
		}
		return alvo;
	}

	public synchronized void saveAlvo(ObjetoAlvo alvo) {
		availables.add(alvo);
	}
}
