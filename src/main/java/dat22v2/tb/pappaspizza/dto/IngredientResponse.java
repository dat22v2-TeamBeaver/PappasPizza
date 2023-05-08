package dat22v2.tb.pappaspizza.dto;

import dat22v2.tb.pappaspizza.entity.Ingredient;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredientResponse {

    private Integer id;

    private String name;

    private int price;

    public IngredientResponse(Ingredient ingredient) {

    }
}
