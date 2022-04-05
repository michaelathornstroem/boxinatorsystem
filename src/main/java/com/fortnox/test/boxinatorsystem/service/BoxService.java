package com.fortnox.test.boxinatorsystem.service;

import com.fortnox.test.boxinatorsystem.model.Box;

import java.util.List;

public interface BoxService {

    public Box saveBox(Box box);

    public List<Box> getAllBoxes();
}
