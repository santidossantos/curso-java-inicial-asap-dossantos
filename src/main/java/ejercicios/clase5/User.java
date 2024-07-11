package ejercicios.clase5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private String email;
    private boolean isScolarShipHolder;

}
