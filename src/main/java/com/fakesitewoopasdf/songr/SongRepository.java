package com.fakesitewoopasdf.songr;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    public Song findById(long id);

}
