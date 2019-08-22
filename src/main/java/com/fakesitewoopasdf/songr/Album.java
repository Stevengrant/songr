package com.fakesitewoopasdf.songr;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public String getTitle() {
        return title;
    }

    String title;

    public String getArtist() {
        return artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public Integer getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getAlbumArtUrl() {
        return albumArtUrl;
    }

    String artist;
    Integer songCount;
    Integer lengthInSeconds;
    String albumArtUrl;

    public Album(String title, String artist, Integer songCount, Integer lengthInSeconds, String albumArtUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.albumArtUrl = albumArtUrl;
    }
    public Album (){}
}
