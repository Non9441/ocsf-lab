package UI;

import java.io.IOException;
import java.util.Scanner;

import client.Client;

public class ClientUI {
	
	public void run(){
		String address = "10.2.12.83";
		int port = 5001;
		String type;
		Scanner input = new Scanner(System.in);
		Client client = new Client(address,port);
		try {
			client.openConnection();
			while(client.isConnected()){
				type = input.nextLine();
				if(type.equals("quite")){
					client.closeConnection();
				} else {
					client.sendToServer(type);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
