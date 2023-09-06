package com.example.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Product {

    private ProductId id;

    private Set<CategoryId> categoryIds;

    private String name;

    private Money price;

    private String detail;

    private List<Image> images = new ArrayList<>();
}
