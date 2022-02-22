package cadastrosprocesso.v2.springboot.validation.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ProcessosModel {

    private Integer id;
    @NotBlank
    @Length(max = 10)
    @Pattern(regexp = "^[A-Z]+(.)*")
    private String nome;
    @NotNull
    private Integer codigoSf;
    @NotBlank
    private String identificador;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoSf() {
        return codigoSf;
    }

    public void setCodigoSf(Integer codigoSf) {
        this.codigoSf = codigoSf;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
