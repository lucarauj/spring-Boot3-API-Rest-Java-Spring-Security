package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
		@NotBlank
		String nome, 
		@NotBlank
		@Email
		String email, 
		@NotBlank
		String telefone, 
		@NotBlank
		@Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
		String cpf,
		@NotNull
		@Valid
		DadosEndereco endereco) {

}
