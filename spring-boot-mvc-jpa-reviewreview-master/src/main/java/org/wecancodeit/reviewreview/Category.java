package org.wecancodeit.reviewreview;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy="category")
	private Set<Review> reviews;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	// for JPA
	private Category() {
	}

	public Category(String name) {
		this.name = name;
	}
}
