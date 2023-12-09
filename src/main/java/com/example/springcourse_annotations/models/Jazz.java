package com.example.springcourse_annotations.models;

import org.springframework.stereotype.Component;

import com.example.springcourse_annotations.interfaces.Music;

@Component("someJazz")
public class Jazz implements Music {
    @Override
    public String getSong() {
        return "Jazz";
    }
}
