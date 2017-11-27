package impl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "order")
	private EntityManager em;

	public void insert(Client client) {
		em.persist(client);
	}

	
	public List<Client> listAll() {
		return em.createQuery("from shopping_order order", Client.class).getResultList();
	}


}