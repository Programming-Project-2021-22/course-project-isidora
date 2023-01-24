package org.unibz;
/**
 * In class Commercial it is achieved effect repeating “****” using Multithreads.
 * Covered topic: Multithreads
 * @author isidora.erakovic
 *
 */

public class Commercial extends Thread {
	@Override
public void run() {
		for(int i=1;i<2;i++) {
			System.out.println("********************");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
		}
}
}
	}

