package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollectionController {
	@Autowired CollectionDao dao;
	
	@RequestMapping(value = "/form")
		public ModelAndView collection() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("collectionForm");
			modelAndView.addObject("collection", new Collection());
			return modelAndView;
	}
	
	@RequestMapping(value = "/result")
		public ModelAndView processCollection(Collection collection) {
			System.out.println("In processCollection");
			ModelAndView modelAndView = new ModelAndView();
			System.out.println("Value in getCollectionOwner" + collection.getCollectionOwner());
			dao.insertCollection(collection);
			modelAndView.setViewName("collectionResult");
			modelAndView.addObject("u", collection);
			return modelAndView;
	}
	
	@Bean
		public CollectionDao dao() {
			CollectionDao bean = new CollectionDao();
			return bean;
	}
}
