package mk.ukim.finki.labapp.service;

import mk.ukim.finki.labapp.model.Artist;
import mk.ukim.finki.labapp.model.Song;

import java.util.List;
import java.util.Optional;

public interface ArtistService{
    List<Artist> listArtists();
    Optional<Artist> findById(Long id);
    void addSongToArtist(Song song, Artist artist);
    void deleteSongFromAllArtists(Long id);
}
