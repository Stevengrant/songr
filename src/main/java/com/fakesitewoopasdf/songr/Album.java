package com.fakesitewoopasdf.songr;


import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    public long getId() {
        return id;
    }
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

    public List<Song> getSongs() {
        return songs;
    }

    @OneToMany(fetch=FetchType.EAGER, mappedBy = "albumAppearsOn")
    List<Song> songs;

    public Album(String title, String artist, Integer songCount, Integer lengthInSeconds, String albumArtUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.albumArtUrl = albumArtUrl;
    }
    public Album (){}

    @Override
    public String toString() {
        return this.title + this.artist + "songs # in list: "+this.songs.size();
    }
}
