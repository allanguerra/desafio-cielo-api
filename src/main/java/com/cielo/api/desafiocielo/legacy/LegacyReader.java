package com.cielo.api.desafiocielo.legacy;

import com.cielo.api.desafiocielo.domain.payload.ExtratoLancamentoCliente;
import com.cielo.api.desafiocielo.infra.exceptions.FileException;
import com.cielo.api.desafiocielo.infra.exceptions.JsonNotFoundException;
import com.cielo.api.desafiocielo.infra.exceptions.enums.ErrorType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class LegacyReader implements LegacyFacade {

    @Autowired
    private ObjectMapper mapper;

    @Value(value = "${json.path}")
    private String jsonPath;

    @Override
    public ExtratoLancamentoCliente listarExtratoDeLancamentos() {

        ExtratoLancamentoCliente extratoLancamentoCliente = new ExtratoLancamentoCliente();

        try{
            // Ler Arquivo
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Path path = Paths.get(classLoader.getResource(jsonPath).toURI());
            String json = String.join(" ",
                    Files.readAllLines(path, StandardCharsets.UTF_8));

            //Mapear Arquivo
            extratoLancamentoCliente = mapper.readValue(json, ExtratoLancamentoCliente.class);

            //Verificar Mapeamento

            //Retornar
            return extratoLancamentoCliente;

        } catch (JsonProcessingException e) {
            throw new JsonNotFoundException(ErrorType.JS01, "Desculpe, não conseguimos carregar os dados de lançamentos.");
        } catch (IOException e) {
            throw new FileException(ErrorType.FL01, "Desculpe, não conseguimos carregar os dados de lançamentos.");
        } catch (URISyntaxException e) {
            throw new FileException(ErrorType.FL02, "Desculpe, não conseguimos carregar os dados de lançamentos.");
        }
    }
}
