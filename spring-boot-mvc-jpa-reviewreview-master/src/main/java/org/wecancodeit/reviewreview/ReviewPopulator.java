package org.wecancodeit.reviewreview;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private CategoryRepository categoryRepo;
	
	@Resource
	private ReviewRepository reviewRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category apples = new Category("apples");
		categoryRepo.save(apples);
		reviewRepo.save(new Review(apples, "Granny Smith tastes like Murican spirit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque congue malesuada laoreet. Integer semper congue mauris et fringilla. Aliquam consectetur, dui sed tincidunt consequat, libero ex scelerisque ipsum, ac volutpat est quam id diam. Maecenas molestie urna a eros pellentesque luctus. Nunc ut arcu tempor, tincidunt odio at, tristique sapien. Nulla ac nunc elementum, volutpat nisi eu, commodo enim. Nam interdum, tortor eu lobortis volutpat, ligula augue sagittis nibh, et rutrum arcu tortor vel risus. Vivamus id condimentum lectus, vel sagittis justo. Integer congue tincidunt tristique. Aenean euismod, nunc eget pretium cursus, est mauris lobortis sapien, at pharetra justo lacus quis odio. Curabitur nec rhoncus ligula, non eleifend dui. Sed ac posuere augue."));
		reviewRepo.save(new Review(apples, "Red Delicious? I beg to differ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque congue malesuada laoreet. Integer semper congue mauris et fringilla. Aliquam consectetur, dui sed tincidunt consequat, libero ex scelerisque ipsum, ac volutpat est quam id diam. Maecenas molestie urna a eros pellentesque luctus. Nunc ut arcu tempor, tincidunt odio at, tristique sapien. Nulla ac nunc elementum, volutpat nisi eu, commodo enim. Nam interdum, tortor eu lobortis volutpat, ligula augue sagittis nibh, et rutrum arcu tortor vel risus. Vivamus id condimentum lectus, vel sagittis justo. Integer congue tincidunt tristique. Aenean euismod, nunc eget pretium cursus, est mauris lobortis sapien, at pharetra justo lacus quis odio. Curabitur nec rhoncus ligula, non eleifend dui. Sed ac posuere augue."));
		reviewRepo.save(new Review(apples, "Gala vs Honeycrisp", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque congue malesuada laoreet. Integer semper congue mauris et fringilla. Aliquam consectetur, dui sed tincidunt consequat, libero ex scelerisque ipsum, ac volutpat est quam id diam. Maecenas molestie urna a eros pellentesque luctus. Nunc ut arcu tempor, tincidunt odio at, tristique sapien. Nulla ac nunc elementum, volutpat nisi eu, commodo enim. Nam interdum, tortor eu lobortis volutpat, ligula augue sagittis nibh, et rutrum arcu tortor vel risus. Vivamus id condimentum lectus, vel sagittis justo. Integer congue tincidunt tristique. Aenean euismod, nunc eget pretium cursus, est mauris lobortis sapien, at pharetra justo lacus quis odio. Curabitur nec rhoncus ligula, non eleifend dui. Sed ac posuere augue."));
		
		categoryRepo.save(new Category("berries"));
	}

}
