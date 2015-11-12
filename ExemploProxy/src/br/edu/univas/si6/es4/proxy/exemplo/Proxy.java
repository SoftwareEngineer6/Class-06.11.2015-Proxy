package br.edu.univas.si6.es4.proxy.exemplo;

import java.util.Random;

public class Proxy implements InterfaceAlvo {

	private long id;

	public Proxy() {
		id = new Random().nextLong();
	}

	@Override
	public void servico1() {
		System.out.println("Servi�o 1 chamado via proxy [" + id + "]");
		ObjetoAlvo alvo = Cache.getInstance().getNewAlvo();
		alvo.servico1();
		Cache.getInstance().saveAlvo(alvo);
	}

	@Override
	public void servico2() {
		System.out.println("Servi�o 2 chamado via proxy [" + id + "]");
		ObjetoAlvo alvo = Cache.getInstance().getNewAlvo();
		alvo.servico2();
		Cache.getInstance().saveAlvo(alvo);
	}

}
