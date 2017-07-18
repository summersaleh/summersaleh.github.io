package org.wecancodeit.reviewreview;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReadReviewsController {

	@Resource
	private CategoryRepository categoryRepo;
	
	@Resource
	private ReviewRepository reviewRepo;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/allCategories")
	public String showAllCategories(Model model) {
		model.addAttribute("allCategoriesModel", categoryRepo.findAll());
		return "categoriesView";
	}
	
	@RequestMapping("/category")
	public String showSingleCategory(@RequestParam long categoryId, Model model) {
		model.addAttribute("singleCategoryModel", categoryRepo.findOne(categoryId));
		return "singleCategoryView";
	}
	
	@RequestMapping("/allReviews") // endpoint
	// we can use Map instead of Model
	public String showAllReviews(Map<String, Object> model) {
		Iterable<Review> allTheReviews = reviewRepo.findAll();
		model.put("allReviewsModel", allTheReviews);
		
		for (Review currentReview : allTheReviews) {
			log.info(currentReview.toString());
		}
		return "reviewsView";
	}
	
	@RequestMapping("/review")
	public String showSingleReview(@RequestParam("reviewId") long reviewId, Model model) {
		Review selected = reviewRepo.findOne(reviewId);
		model.addAttribute("singleReviewModel", selected);
		return "singleReviewView";
	}
}
