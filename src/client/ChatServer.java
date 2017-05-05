package client;
import java.io.IOException;

import com.lloseng.ocsf.server.ConnectionToClient;
import com.lloseng.ocsf.server.ObservableServer;

public class ChatServer extends ObservableServer{

	public ChatServer(int port) {
		super(port);
		// TODO Auto-generated constructor stub
	}
	
	protected synchronized void clientConnected(ConnectionToClient client) {
		try {
			client.sendToClient("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected synchronized void handleMessageFromClient(Object message,
			ConnectionToClient client){
		
	}

}
