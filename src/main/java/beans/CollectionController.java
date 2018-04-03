package beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollectionController {

	@RequestMapping(value = "/form")
		public ModelAndView collection() {
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("collectionForm");
			modelAndView.addObject("collection", new Collection());
			
			return modelAndView;
	}
}
