package com.fakesitewoopasdf.songr;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int lengthInSeconds;
    String albumArtUrl;
    public Album(){};
    public Album(String title, String artist, int songCount, int lengthInSeconds, String albumArtUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.albumArtUrl = albumArtUrl;
    }
}
