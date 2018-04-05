//package beans;
//
//public class CollectionServiceImpl implements CollectionService{
//	private CollectionDao collectionDao;
//	
//	public CollectionServiceImpl(CollectionDao collectionDao) {
//		this.collectionDao = collectionDao;
//	}
//	
//	public CollectionDao getCollectionDao() {
//		return collectionDao;
//	}
//	
//	public void setAccountDao(CollectionDao collectionDao) {
//		this.collectionDao = collectionDao;
//	}
//	
//	public void sellItems (long sourceCollectionId, long targetCollectionId, double amount) {
//		Collection sourceCollection = collectionDao.find(sourceCollectionId);
//		Collection targetCollection = collectionDao.find(targetCollectionId);
//		
//		sourceCollection.setCountItems(sourceCollection.getCountItems() - amount);
//		targetCollection.setCountItems(targetCollection.getCountItems() + amount);
//		
//		collectionDao.update(sourceCollection);
//		collectionDao.update(targetCollection);
//	}
//	
//	public void acquireItems (long collectionId, double amount) throws Exception {
//		Collection collection = collectionDao.find(collectionId);
//		collection.setCountItems(collection.getCountItems() + amount);
//		collectionDao.update(collection);
//	}
//	
//	public Collection getCollection(long collectionId) {
//		return collectionDao.find(collectionId);
//	}
//	
//	public void setCollectorType (long collectionId) {
//		Collection collection = collectionDao.find(collectionId);
//		String orgCollectorLevel = collection.getCollectorLevel();
//		String newCollectorLevel;
//		final double MASTER = 500;
//		double count = collection.getCountItems();
//		if (count > MASTER) {
//			newCollectorLevel = "master";
//		} else {
//			newCollectorLevel = orgCollectorLevel;
//		}
//		collection.setCollectorLevel(newCollectorLevel);
//		
//	}
//}
