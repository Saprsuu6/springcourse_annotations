package com.example.springcourse_annotations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springcourse_annotations.interfaces.Music;

/*
 * We can make injection using @Autowired
 * 1. on fiels
 * 2. on setters
 * 3. on constructors
 */

@Component
public class MusicPlayer {
    @Autowired
    private Music music;

    private String name;
    private int volume;
    private List<Music> musicList;

    // #region getters
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public Music getMusic() {
        return music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
    // #endregion

    // #region setters
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }
    // #endregion

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    // @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void play() {
        System.out.println("Playing: " + music.getSong());
    }
}
