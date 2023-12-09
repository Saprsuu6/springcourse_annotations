package com.example.springcourse_annotations.models;

import org.springframework.stereotype.Component;

import com.example.springcourse_annotations.interfaces.Music;

//@Component("someAlternative")
public class Alternative implements Music {
    @Override
    public String getSong() {
        return "Aternative";
    }
}
