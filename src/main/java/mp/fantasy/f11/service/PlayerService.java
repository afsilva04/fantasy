package mp.fantasy.f11.service;

import mp.fantasy.f11.model.Player;
import mp.fantasy.f11.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player findById(Long id) {
        return playerRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Player " + id + " not found"));
    }

    public List<Player> findAll() {
        List<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }

}
