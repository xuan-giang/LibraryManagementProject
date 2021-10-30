package com.example.librarymanagementproject.service;

import com.example.librarymanagementproject.model.Reader;
import com.example.librarymanagementproject.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImplement implements ReaderService{
    @Autowired
    private ReaderRepository readerRepository;

    @Override
    public List<Reader> getAllReader() {
        return readerRepository.findAll();
    }

    @Override
    public Boolean createNewReader(Reader reader) {
        readerRepository.save(reader);
        return true;
    }

    @Override
    public Boolean updateReaderById(int id) {
        return null;
    }

    @Override
    public Boolean deleteReaderById(int id) {
        readerRepository.deleteById(id);
        return true;
    }

    @Override
    public Reader getById(int id) {
        return readerRepository.getOne(id);
    }
}
