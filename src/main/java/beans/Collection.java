package beans;

public class Collection {
	private long id;
	private String collectionOwner;
	private double countItems;
	private String collectionType;
	private boolean locked;
	
	public Collection() {
		// TODO Auto-generated constructor stub
	}

	public Collection(long id, String collectionOwner, double countItems) {
		this.id = id;
		this.collectionOwner = collectionOwner;
		this.countItems = countItems;
	}
	
	

	public Collection(long id, String collectionOwner, double countItems, String collectionType) {
		super();
		this.id = id;
		this.collectionOwner = collectionOwner;
		this.countItems = countItems;
		this.collectionType = collectionType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String location) {
		this.collectionType = location;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
	
}
