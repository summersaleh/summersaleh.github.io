package org.wecancodeit.reviewreview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	@Lob
	private String content;

	@ManyToOne
	private Category category;
	
	public String getTitle() {
		return title;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	// just for JPA
	@SuppressWarnings("unused")
	private Review() {
	}

	public Review(Category category, String title, String content) {
		this.category = category;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format("A review with id %s and title '%s'", id, title);
	}
	
	
}
