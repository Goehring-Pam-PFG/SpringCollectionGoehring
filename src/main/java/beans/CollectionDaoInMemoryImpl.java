package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionDaoInMemoryImpl implements CollectionDao {
	private Map<Long, Collection> collectionsMap = new HashMap<Long, Collection>();
	{
		Collection collection1 = new Collection (1L, "John Jay", 100, "books");		
		Collection collection2 = new Collection (2L, "Susan Smith", 50, "books");
				
		collectionsMap.put(collection1.getId(), collection1);
		collectionsMap.put(collection2.getId(), collection2);
	}
	
	public void insert(Collection collection) {
		collectionsMap.put(collection.getId(), collection);
	}
	
	public void update(Collection collection) {
		collectionsMap.put(collection.getId(), collection);
	}
	
	public void update(List<Collection>collections) {
		for(Collection collection: collections) {
			update(collection);
		}
	}
	
	public void delete(long collectionId) {
		collectionsMap.remove(collectionId);
	}
	
	public Collection find(long collectionId) {
		return collectionsMap.get(collectionId);
	}
	
	public List<Collection>find(List<Long>collectionIds){
		List<Collection>collections = new ArrayList<Collection>();
		for (Long id:collectionIds) {
			collections.add(collectionsMap.get(id));
		}
		return collections;
	}
	
	public List<Collection> find(String ownerName){
		List<Collection> collections = new ArrayList<Collection>();
		for (Collection collection:collectionsMap.values()) {
			if(ownerName.equals(collection.getCollectionOwner())) {
				collections.add(collection);
			}
		}
		return collections;
	}
	
	public List<Collection> find(boolean locked){
		List<Collection> collections = new ArrayList<Collection>();
		for (Collection collection: collectionsMap.values()) {
			if(locked == (collection.isLocked())) {
				collections.add(collection);
			}
		}
		return collections;
	}
}
