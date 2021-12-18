package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublichWeb {
    public static void main(String[] args) {

        EstoqueWs servico = new EstoqueWs();
        String url = "http://localhost:8080/estoquews";

        Endpoint.publish(url , servico);
        System.out.println("Caminho do wsdl :  "+url);
    }

}
