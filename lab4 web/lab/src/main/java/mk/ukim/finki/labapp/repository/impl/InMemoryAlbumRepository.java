package mk.ukim.finki.labapp.repository.impl;

import mk.ukim.finki.labapp.bootstrap.DataHolder;
import mk.ukim.finki.labapp.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryAlbumRepository {

    public List<Album> findAll() {
        return DataHolder.albums;
    }

    public Optional<Album> findById(Long id) {
        return DataHolder.albums.stream().filter(x->x.getId().equals(id)).findFirst();
    }
}