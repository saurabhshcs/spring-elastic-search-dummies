package com.techsharezone.elasticsearch;/*
 * @created 19/10/2020 -12:22
 * @project elasticsearch
 * @author  saurabhshcs
 */

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ElasticSearchConfig {
    @Value("${elasticsearch.host}")
    private String EsHost;
    @Value("${elasticsearch.port}")
    private int EsPort;
    @Value("${elasticsearch.clustername}")
    private String EsClusterName;
    @Bean
    public Client client() throws Exception {
        return new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(EsHost), EsPort));
    }
    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(client());
    }
    //Embedded Elasticsearch Server
    /*@Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }*/
}
