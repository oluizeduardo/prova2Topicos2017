package rest_impl;

import javax.enterprise.context.RequestScoped;
import interfaces.Client;
import interfaces.ClientService;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	
	private Client client;
	
	
	@Override
	public void saveNewOrder(String description) {
		client.createNewOrder(description);
	}

	@Override
	public String[] listOrders() {
		return client.listOrders();
	}

}