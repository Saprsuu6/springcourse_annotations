package com.example.springcourse_annotations.models;

import org.springframework.stereotype.Component;

import com.example.springcourse_annotations.interfaces.Music;

//@Component("someClassical")
public class Classical implements Music {
    @Override
    public String getSong() {
        return "Classical Music";
    }
}
