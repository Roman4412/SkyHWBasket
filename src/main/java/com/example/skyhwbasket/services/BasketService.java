package com.example.skyhwbasket.services;

import java.util.List;

public interface BasketService {
    void add(int ...id);

    List<Integer> get();
}