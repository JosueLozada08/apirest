package com.example.apirest.person;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data // Genera automáticamente getters, setters, toString, equals y hashCode
@AllArgsConstructor // Genera un constructor con todos los argumentos
@NoArgsConstructor  // Genera un constructor vacío (sin argumentos)
@Entity // Marca esta clase como una entidad JPA (se mapea a una tabla de la BD)
public class Person {
    //esto ayudara a mapear a la base de datos 
    @Id //para indicar que es clave primaria
    @GeneratedValue //indica que su valor sera generado automaticamente 

    private Integer id;
    @Basic //indica que el resto de campos van a ser basicos 
    private String firstName;
    private String lastName;
    private String email;

}
