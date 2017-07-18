package org.wecancodeit.reviewreview;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateReviewsController {

	@Resource
	private CategoryRepository categoryRepo;
	@Resource
	private ReviewRepository reviewRepo;
	
	@RequestMapping("/deleteReview")
	public String deleteReview(@RequestParam long categoryId, @RequestParam long reviewId) {
		reviewRepo.delete(reviewId);
		return "redirect:/category?categoryId=" + categoryId;
	}
	
	@RequestMapping("/createReview")
	public String createReview(@RequestParam long categoryId, @RequestParam String title, @RequestParam String content) {
		Category selected = categoryRepo.findOne(categoryId);
		reviewRepo.save(new Review(selected, title, content));
		return "redirect:/category?categoryId=" + categoryId;
	}
}
