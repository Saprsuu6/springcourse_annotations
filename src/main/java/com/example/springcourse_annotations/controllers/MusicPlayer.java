package com.example.springcourse_annotations.controllers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.springcourse_annotations.interfaces.Music;

@Component("musicPlayerBean")
public class MusicPlayer {
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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void play() {
        System.out.println("Playing: " + music.getSong());
    }
}
