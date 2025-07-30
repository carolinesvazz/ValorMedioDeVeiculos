//Modelo criado para pegar somente modelos específicos de veículos.

package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//@JsonIgnore para ignorar ano de modelo, para coletar as apenas as informações necessárias para não dar erro
@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos) {
}
