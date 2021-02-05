package uy.com.geocom.recipes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private  Long id;
	private  String name;
	private  String description;
	private  String imagePath;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "recipe_id", referencedColumnName="id")
	private  List<Ingredient> ingredients;
}
