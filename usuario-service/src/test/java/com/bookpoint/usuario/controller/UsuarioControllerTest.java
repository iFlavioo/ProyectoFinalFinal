package com.bookpoint.usuario.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.bookpoint.usuario.dto.UsuarioDTO;
import com.bookpoint.usuario.service.UsuarioService;
import com.bookpoint.usuario.model.Usuario;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import java.util.Optional;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UsuarioController.class)
@ActiveProfiles("test")
public class UsuarioControllerTest {
    @Autowired private MockMvc mockMvc;
    @SuppressWarnings("removal") @MockBean private UsuarioService usuarioService;
    @Autowired private ObjectMapper objectMapper;

 
}
