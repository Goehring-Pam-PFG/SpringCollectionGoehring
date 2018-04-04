package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollectionController {
	@Autowired CollectionDao dao;
	private static final String[] collectionTypes = {"books", "records", "trains", "pens"};
	
	@RequestMapping(value = "/form")
		public ModelAndView collection() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("collectionForm");
			modelAndView.addObject("collection", new Collection());
			modelAndView.addObject("collectionTypes", collectionTypes);
			return modelAndView;
	}
	
	@RequestMapping(value = "/result")
		public ModelAndView processCollection(Collection collection) {
			System.out.println("In processCollection");
			ModelAndView modelAndView = new ModelAndView();
			System.out.println("Value in getCollectionOwner" + collection.getCollectionOwner());
			dao.insertCollection(collection);
			modelAndView.setViewName("collectionResult");
			modelAndView.addObject("c", collection);
			return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
		public ModelAndView viewAll() {
			ModelAndView modelAndView = new ModelAndView();
			List<Collection> allCollections = dao.getAllCollections();
			modelAndView.setViewName("viewAllCollections");
			modelAndView.addObject("all", allCollections);
			return modelAndView;
	}
	
	@Bean
		public CollectionDao dao() {
			CollectionDao bean = new CollectionDao();
			return bean;
	}
}
