package br.edu.univas.si6.es4.proxy.exemplo;

public class Servico2Runner implements Runnable {

	private Proxy proxy = new Proxy();

	@Override
	public void run() {
		proxy.servico2();
	}

}
