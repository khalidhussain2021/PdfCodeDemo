package com.drezz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drezz.entity.FileData;
@Repository
public interface FileRepository extends JpaRepository<FileData,Integer>{

}
