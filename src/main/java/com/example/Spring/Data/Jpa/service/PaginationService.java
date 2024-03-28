package com.example.Spring.Data.Jpa.service;

import com.example.Spring.Data.Jpa.entity.UserEntity;
import com.example.Spring.Data.Jpa.repository.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaginationService {

    @Autowired
    private Pagination pagination;
    public List<UserEntity> getData(int pagenumber , int pageSize){

        Pageable pageable = PageRequest.of(pagenumber,pageSize);

        Page<UserEntity> page = pagination.findByUsernameContaining("a",pageable);

         List<UserEntity> content = page.getContent();
        return content;


    }

}