package com.fortnox.test.boxinatorsystem.service;

import com.fortnox.test.boxinatorsystem.model.Box;
import com.fortnox.test.boxinatorsystem.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxServiceImpl implements BoxService {

    @Autowired
    private BoxRepository boxRepository;


    @Override
    public Box saveBox(Box box) {
        return boxRepository.save(box);
    }

    @Override
    public List<Box> getAllBoxes() {
        return boxRepository.findAll();
    }

}
