package br.edu.univas.si6.es4.proxy.exemplo;

public class Runner {

	public static void main(String[] args) {
		Servico1Runner servico1 = new Servico1Runner();
		Servico2Runner servico2 = new Servico2Runner();
		for(int i = 0; i < 20; i++) {
			runOnThread(servico1);
			sleep();
			runOnThread(servico2);
			sleep();
		}
	}

	private static void runOnThread(Runnable runnable) {
		new Thread(runnable).start();
	}
	
	private static void sleep() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
	}

}
