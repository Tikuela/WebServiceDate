package model;

import java.util.Comparator;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Photo{
	
	private long id;	
	private int index;
	private int likes;
	private List<Size> sizes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public List<Size> getSizes() {
		return sizes;
	}
	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
	}
	
}
