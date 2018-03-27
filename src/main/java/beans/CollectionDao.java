package beans;

import java.util.List;

public interface CollectionDao {
	public void insert(Collection collection);
	public void update(Collection collection);
	public void update (List<Collection>collections);
	public void delete(long collectionId);
	public Collection find(long collectionId);
	public List<Collection> find(List<Long>collectionIds);
	public List<Collection> find(String collectionOwner);
	public List<Collection> find(boolean locked);
}
