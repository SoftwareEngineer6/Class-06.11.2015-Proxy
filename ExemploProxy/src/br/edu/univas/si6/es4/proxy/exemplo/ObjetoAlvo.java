package br.edu.univas.si6.es4.proxy.exemplo;

import java.util.Random;

public class ObjetoAlvo implements InterfaceAlvo {
	
	private long id;
	
	public ObjetoAlvo() {
		id = new Random().nextLong();
	}

	@Override
	public void servico1() {
		System.out.println("Servi�o 1 executado no objeto alvo [" + id + "]");
		sleep();
	}

	@Override
	public void servico2() {
		System.out.println("Servi�o 2 executado no objeto alvo [" + id + "]");
		sleep();
	}

	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}
