package uy.com.geocom.recipes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;

	private String name;
	private double amount;
	
	@Column(name="recipe_id")
	private long recipeId;
	
}
