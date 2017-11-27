package impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "shopping_order")
@SequenceGenerator(name = "seq_shopping_order", sequenceName = "seq_shopping_order", allocationSize = 1)
public class Client {
	
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	private Integer id;	
	private String description;
	
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
