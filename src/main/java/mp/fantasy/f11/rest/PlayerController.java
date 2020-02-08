package mp.fantasy.f11.rest;

import mp.fantasy.f11.model.Player;
import mp.fantasy.f11.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{id}")
    public Player findById(@PathVariable("id") Long id) {
        return playerService.findById(id);
    }

    @GetMapping("/all")
    public List<Player> findAll() {
        return playerService.findAll();
    }

}
