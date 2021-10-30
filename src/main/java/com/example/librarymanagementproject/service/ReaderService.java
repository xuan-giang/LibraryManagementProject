package com.example.librarymanagementproject.service;


import com.example.librarymanagementproject.model.Reader;

import java.util.List;

public interface ReaderService {
    List<Reader> getAllReader();

    Boolean createNewReader(Reader reader);

    Boolean updateReaderById(int id);

    Boolean deleteReaderById(int id);

    Reader getById(int id);

}
