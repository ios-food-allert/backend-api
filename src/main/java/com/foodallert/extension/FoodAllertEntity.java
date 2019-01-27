/**
 * 
 */
package com.foodallert.extension;

import java.util.List;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public class FoodAllertEntity  {
	
	private String entity;
	private List<Long> location;
	private String value;
	private Double confidence;
	private String imageURL;
	
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public List<Long> getLocation() {
		return location;
	}
	public void setLocation(List<Long> location) {
		this.location = location;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Double getConfidence() {
		return confidence;
	}
	public void setConfidence(Double confidence) {
		this.confidence = confidence;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}	
}
