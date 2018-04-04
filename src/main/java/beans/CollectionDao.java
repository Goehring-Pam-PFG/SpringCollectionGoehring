package beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/*public interface CollectionDao {
	public void insert(Collection collection);
	public void update(Collection collection);
	public void update (List<Collection>collections);
	public void delete(long collectionId);
	public Collection find(long collectionId);
	public List<Collection> find(List<Long>collectionIds);
	public List<Collection> find(String collectionOwner);
	public List<Collection> find(boolean locked);
}*/

public class CollectionDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SpringCollectionGoehring");
	
	public void insertCollection (Collection collectionToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(collectionToAdd);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Collection> getAllCollections() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select c from Collection c";
		TypedQuery<Collection> typedQuery = em.createQuery(q, Collection.class);
		List<Collection> all = typedQuery.getResultList();
		return all;
	}
}
