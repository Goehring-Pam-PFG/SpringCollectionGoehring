package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		CollectionService collectionService = applicationContext.getBean("collectionService", CollectionService.class);

		System.out.println("Beginning Day Collection Counts");
		System.out.println("Collection " + collectionService.getCollection(1).getCollectionOwner() + " Count of Collectibles: " + collectionService.getCollection(1).getCountItems());
		System.out.println("Collection " + collectionService.getCollection(2).getCollectionOwner() + " Count of Collectibles: " + collectionService.getCollection(1).getCountItems());
		
		
		collectionService.sellItems(1, 2, 5);
		
		System.out.println("After selling collectibles");
		System.out.println("Collection 1 Balance: " + collectionService.getCollection(1).getCountItems());
		System.out.println("Collection 2 Balance: " + collectionService.getCollection(2).getCountItems());
	}

}
