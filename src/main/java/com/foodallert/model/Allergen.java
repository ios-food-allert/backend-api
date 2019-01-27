/**
 * 
 */
package com.foodallert.model;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public enum Allergen {
	
	EGG("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-eggs-filled-100.png"),
	FISH("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-fish-food-filled-100.png"),
	MILK("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-tetra-pak-filled-100.png"),
	OTHER_ALLERGENS("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-eggs-filled-100.png"),
	PEANUT("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-peanuts-filled-100.png"),
	SHELLFISH("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-shrimp-and-lobster-filled-100.png"),
	SOY("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-soy-filled-100.png"),
	TREE_NUT("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-nut-filled-100.png"),
	WHEAT("https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-wheat-filled-100.png");
	
	private String imageURL;
	
	private Allergen(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getImageURL() {
		return imageURL;
	}

	public static String getAllergenImageURL(String text) {
		for(Allergen allergen : Allergen.values()) {
			if(allergen.toString().equals(text.toUpperCase())) {
				return allergen.getImageURL();
			}
		}
		
		return "https://api-fa-backend.1d35.starter-us-east-1.openshiftapps.com/images/307672-peach-filled-100.png";
	}
}
