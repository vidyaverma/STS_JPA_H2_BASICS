package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.alien;

import antlr.collections.List;

public interface AlienRepo extends CrudRepository<alien, Integer>
{

	java.util.List<alien> findBytech(String tech);
}
