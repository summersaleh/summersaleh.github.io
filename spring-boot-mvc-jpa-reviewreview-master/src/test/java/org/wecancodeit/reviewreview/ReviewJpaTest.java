package org.wecancodeit.reviewreview;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReviewJpaTest {

	@Resource
	private CrudRepository<Review, Long> reviewRepo;
	// could have done
	// private ReviewRepository reviewRepo

	@Test
	public void shouldBeAbleToAddReview() {
		Review toAdd = new Review(new Category("foo"), "review title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque congue malesuada laoreet. Integer semper congue mauris et fringilla. Aliquam consectetur, dui sed tincidunt consequat, libero ex scelerisque ipsum, ac volutpat est quam id diam. Maecenas molestie urna a eros pellentesque luctus. Nunc ut arcu tempor, tincidunt odio at, tristique sapien. Nulla ac nunc elementum, volutpat nisi eu, commodo enim. Nam interdum, tortor eu lobortis volutpat, ligula augue sagittis nibh, et rutrum arcu tortor vel risus. Vivamus id condimentum lectus, vel sagittis justo. Integer congue tincidunt tristique. Aenean euismod, nunc eget pretium cursus, est mauris lobortis sapien, at pharetra justo lacus quis odio. Curabitur nec rhoncus ligula, non eleifend dui. Sed ac posuere augue.");
		reviewRepo.save(toAdd);
	}
//	
//	@Test
//	public void shouldReadReviews() {
//		// arrange
//		Review toAdd = new Review("review title");
//		reviewRepo.save(toAdd);
//		
//		// act 
//		reviewRepo.findAll();
//		
//		// assert: we just expect it to essplode
//	}
}
