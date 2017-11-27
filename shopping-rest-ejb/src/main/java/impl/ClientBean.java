package impl;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Local(Client.class)
@Remote(Client.class)
public class ClientBean implements interfaces.Client {

	@EJB
	private ClientDAO dao;
	
	@Override
	public void createNewOrder(String description) {
		Client client = new Client();
		client.setDescription(description);
		dao.insert(client);
	}

	@Override
	public String[] listOrders() {
		return dao.listAll()
				.stream()
				.map(Client::getDescription)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}