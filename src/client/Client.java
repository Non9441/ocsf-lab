package client;
import com.lloseng.ocsf.client.ObservableClient;

public class Client extends ObservableClient{

	public Client(String host, int port) {
		super(host, port);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handleMessageFromServer(Object massage){
		System.out.println(massage.toString());
	}
	
	@Override
	public void connectionEstablished(){
		System.out.println("Connected to "+ this.getHost());
	}
	
	@Override
	public void connectionClosed(){
		System.out.println("Disconnected");
	}

}
