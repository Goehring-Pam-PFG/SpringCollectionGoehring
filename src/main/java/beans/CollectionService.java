package beans;

public interface CollectionService {
	public void sellItems(long sourceCollectionId, long targetCollectionId, double amount);
	public void acquireItems(long collectionId, double amount) throws Exception;
	public Collection getCollection(long collectionId);
	public void setCollectorType(long collectionId); 

}
