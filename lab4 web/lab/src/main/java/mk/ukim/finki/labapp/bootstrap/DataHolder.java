package mk.ukim.finki.labapp.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.labapp.model.Album;
import mk.ukim.finki.labapp.model.Artist;
import mk.ukim.finki.labapp.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DataHolder {
    public static List<Artist> artists = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();
    public static List<Album> albums = new ArrayList<>();

    @PostConstruct
    public void init(){

        artists.add(new Artist( "Cane", "Nikolovski", "cane cane"));
        artists.add(new Artist( "name2", "surname2", "artist2"));
        artists.add(new Artist(  "name3", "surname3", "artist3"));
        artists.add(new Artist( "name4", "surname4", "artist4"));
        artists.add(new Artist(  "name5", "surname5", "artist5"));

        albums.add(new Album("album1", "gospel", "1990"));
        albums.add(new Album("album2", "pop", "2006"));
        albums.add(new Album("album3", "punk", "1991"));
        albums.add(new Album("album4", "jazz", "1961"));
        albums.add(new Album("album5", "turbofolk", "2010"));

        songs.add(new Song("track1","Zaklina", "gospel", 1990, artists.subList(0, 1), albums.get(0)));
        songs.add(new Song("track2", "songName2", "pop", 2006, artists.subList(1, 2), albums.get(1)));
        songs.add(new Song("track3", "songName3", "punk", 1991, artists.subList(2, 3), albums.get(2)));
        songs.add(new Song("track4", "songName4", "jazz", 1961, artists.subList(3, 4), albums.get(3)));
        songs.add(new Song("track5", "songName5", "turbofolk", 2010, artists.subList(4, 5), albums.get(4)));






    }
}
