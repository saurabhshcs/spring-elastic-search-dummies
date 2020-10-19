package com.techsharezone.elasticsearch.controller;/*
 * @created 19/10/2020 -12:26
 * @project elasticsearch
 * @author  saurabhshcs
 */

import com.techsharezone.elasticsearch.model.Document;
import com.techsharezone.elasticsearch.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaDeveloperZone.
 */
@RestController
public class ESDocumentController {

    @Autowired
    private DocumentRepository documentRepository;

    @RequestMapping("/")
    public String SpringBootESExample() {
        return "Welcome to Spring Boot Elastic Search Example";
    }

    @DeleteMapping("/delete")
    public String deleteAllDocuments() {
        try {   //delete all documents from solr core
            documentRepository.deleteAll();
            return "documents deleted succesfully!";
        }catch (Exception e){
            return "Failed to delete documents";
        }
    }

    @PostMapping("/save")
    public String saveAllDocuments() {
        //Store Documents
        documentRepository.saveAll(Arrays.asList(new Document("1", "pdf","Java Dev Zone"),
                new Document("2", "msg", "subject:reinvetion"),
                new Document("3", "pdf", "Spring boot sessions"),
                new Document("4", "docx", "meeting agenda"),
                new Document("5", "docx", "Spring boot + Elastic Search")));
        return "5 documents saved!!!";
    }
    @GetMapping("/getAll")
    public List<Document> getAllDocs() {
        List<Document> documents = new ArrayList<>();
        // iterate all documents and add it to list
        for (Document doc : this.documentRepository.findAll()) {
            documents.add(doc);
        }
        return documents;
    }
}