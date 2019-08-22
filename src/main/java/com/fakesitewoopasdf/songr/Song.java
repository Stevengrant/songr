package com.fakesitewoopasdf.songr;

import javax.persistence.*;

@Entity
public class Song {
    public String getTitle() {
        return title;
    }

    public Integer getLengthInSeconds() {
        return lengthInSeconds;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbumAppearsOn() {
        return albumAppearsOn;
    }
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    long id;
    String title;
    Integer lengthInSeconds;
    Integer trackNumber;
    @ManyToOne
    Album albumAppearsOn;

    public Song(String title, Integer lengthInSeconds, Integer trackNumber, Album albumAppearsOn){
        this.title = title;
        this.lengthInSeconds =lengthInSeconds;
        this.trackNumber = trackNumber;
        this.albumAppearsOn = albumAppearsOn;
    }
    public Song(){}
}
