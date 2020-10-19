package com.techsharezone.elasticsearch.repository;/*
 * @created 19/10/2020 -12:24
 * @project elasticsearch
 * @author  saurabhshcs
 */

import com.techsharezone.elasticsearch.model.Document;

import java.util.List;

public interface DocumentRepository {
    List<Document> findByDocTitleEndsWith(String name);
    List<Document> findByDocTitleStartsWith(String name);
    List<Document> findByDocTypeEndsWith(String name);
    List<Document> findByDocTypeStartsWith(String name);
}
