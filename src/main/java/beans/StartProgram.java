package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		CollectionService collectionService = applicationContext.getBean("collectionService", CollectionService.class);

		System.out.println("Beginning Day Collection Counts");
		System.out.println("Collection " + collectionService.getCollection(1).getCollectionOwner() + " Count of Collectibles: " + collectionService.getCollection(1).getCountItems());
		System.out.println("Collection " + collectionService.getCollection(2).getCollectionOwner() + " Count of Collectibles: " + collectionService.getCollection(2).getCountItems());
		
		collectionService.setCollectorType(1);
		collectionService.setCollectorType(2);
		System.out.println(collectionService.getCollection(1).getCollectionOwner() + "'s collector level: " + collectionService.getCollection(1).getCollectorLevel());
		System.out.println(collectionService.getCollection(2).getCollectionOwner() + "'s collector level: " + collectionService.getCollection(2).getCollectorLevel());
		System.out.println("************************");
		System.out.println(collectionService.getCollection(1).getCollectionOwner() + " selling 25 items to " + collectionService.getCollection(2).getCollectionOwner());
		collectionService.sellItems(1, 2, 25);
		System.out.println("************************");
		
		System.out.println("After selling collectibles");
		System.out.println(collectionService.getCollection(1).getCollectionOwner() + "'s Count of Collectibles: " + collectionService.getCollection(1).getCountItems());
		System.out.println(collectionService.getCollection(2).getCollectionOwner() + "'s Count of Collectibles: " + collectionService.getCollection(2).getCountItems());
	
		System.out.println("************************");
		collectionService.setCollectorType(1);
		collectionService.setCollectorType(2);
		System.out.println(collectionService.getCollection(1).getCollectionOwner() + "'s collector level: " + collectionService.getCollection(1).getCollectorLevel());
		System.out.println(collectionService.getCollection(2).getCollectionOwner() + "'s collector level: " + collectionService.getCollection(2).getCollectorLevel());

	}

}
