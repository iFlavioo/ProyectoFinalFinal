package com.bookpoint.usuario.dto;

import com.bookpoint.usuario.model.Usuario;
import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class UsuarioCreateDTO {
    @NotBlank(message = "El nombre no puede ser nulo ni vacio")
    @Size(min = 2, max = 100)
    private String nombre;

    @NotBlank(message = "El email no puede ser nulo ni vacio")
    @Email(message = "El email no tiene un formato valido")
    private String email;

    @NotBlank @Size(min = 4)
    private String password;

    @NotBlank @Pattern(regexp = "ADMIN|CLIENTE|VENDEDOR|LOGISTICA|BODEGA")
    private String rol;

    public Usuario toEntity() {
        return new Usuario(null, nombre, email, password, rol);
    }
}