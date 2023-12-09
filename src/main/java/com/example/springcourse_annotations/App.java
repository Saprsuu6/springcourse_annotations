package com.example.springcourse_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springcourse_annotations.controllers.MusicPlayer;
import com.example.springcourse_annotations.interfaces.Music;
import com.example.springcourse_annotations.models.Alternative;
import com.example.springcourse_annotations.models.Ambient;

public class App {
    /**
     * There is 3 way to set bean
     * Using annotations
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");) {
            // #region Add second level bean from
            secondLevelBean(context);
            // #endregion

            // #region Add second level bean from props using props file
            // injectionFromPropUsingProp(context);
            // #endregion

            // #region Add list of beansform construcor
            // injectionBeansListUsingConstructor(context);
            // #endregion

            // #region compare singleton and prototype bean
            // singletonPrototype(context);
            // #endregion

            // #region init and destroy
            // initDestroy(context);
            // #endregion
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void secondLevelBean(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.play();
    }

    private static void injectionFromPropUsingProp(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        player.play();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
    }

    private static void injectionBeansListUsingConstructor(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        for (Music music : player.getMusicList()) {
            System.out.println(music.getSong());
        }
    }

    private static void singletonPrototype(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(player);
        System.out.println(player2);
    }

    private static void initDestroy(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(player);
    }
}
