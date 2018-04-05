//package beans;
//
//import org.springframework.beans.factory.annotation.Autowire;
//import org.springframework.context.annotation.Bean;
//
//public class BeanConfiguration {
//
//	@Bean
//	public CollectionDao collectionDao() {
//		CollectionDaoInMemoryImpl bean = new CollectionDaoInMemoryImpl();
//		return bean;
//	}
//	
//	@Bean(autowire=Autowire.BY_NAME)
//	public CollectionService collectionService() {
//		CollectionServiceImpl bean = new CollectionServiceImpl(collectionDao());
//		return bean;
//	}
//	
//	@Bean
//	public CollectionDao collectionDaoJpa() {
//		CollectionDaoJpaImpl bean = new CollectionDaoJpaImpl();
//		return bean;
//	}
//}
