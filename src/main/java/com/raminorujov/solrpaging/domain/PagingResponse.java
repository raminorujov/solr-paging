package com.raminorujov.solrpaging.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

/**
 * Created by raminorujov on 23/06/2017.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PagingResponse {
    private PagingData pagingData;
    private List<Book> books;

    public PagingData getPagingData() {
        return pagingData;
    }

    public void setPagingData(PagingData pagingData) {
        this.pagingData = pagingData;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "PagingResponse{" +
                "pagingData=" + pagingData +
                ", books=" + books +
                '}';
    }
}
