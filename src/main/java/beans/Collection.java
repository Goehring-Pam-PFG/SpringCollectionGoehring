package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collections")
public class Collection {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String collectionOwner;
	private double countItems;
	private String collectorLevel;
	private boolean locked;
	
	public Collection() {
		// TODO Auto-generated constructor stub
	}

	public Collection(int id, String collectionOwner, double countItems) {
		this.id = id;
		this.collectionOwner = collectionOwner;
		this.countItems = countItems;
		this.collectorLevel = "novice";
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollectionOwner() {
		return collectionOwner;
	}

	public void setCollectionOwner(String collectionOwner) {
		this.collectionOwner = collectionOwner;
	}

	public double getCountItems() {
		return countItems;
	}

	public void setCountItems(double countItems) {
		this.countItems = countItems;
	}

	public String getCollectorLevel() {
		return collectorLevel;
	}

	public void setCollectorLevel(String level) {
		this.collectorLevel = level;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
	
}
