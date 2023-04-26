/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import tenizinho.Tenizinho;

public class Servidor {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		LocateRegistry.createRegistry(1099);
		Tenizinho jogo =  new Tenizinho();
		Naming.rebind("rmi://localhost/Tenizinho", (Remote) jogo);
		System.out.println("Servidor pronto e registrado no RMI Registry.");
	}

}
